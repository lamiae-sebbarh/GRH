pipeline {
    agent any
    tools {
     maven 'MAVEN 3'
     jdk 'jdk1.8.0_172'
    }
   stages{
		stage('Build'){
			steps{
				bat 'mvn compile'
			}
		}
		
		stage('Test'){
			parallel {

		        stage('JUnit') {
					steps {
						bat 'mvn test'
					}
					post{
						success{
							junit 'target/surefire-reports/**/*.xml'
						}
					}
		        }

		        stage('Code Coverage') {
					steps {
					bat 'mvn cobertura:cobertura'
					}
		        }

		        stage('Performance Test'){
					steps{
						bat 'mvn gatling:test'
					}
				}
	      	}	
		}

		stage('Code Analysis'){
			parallel {

		        stage('CheckStyle') {
					steps {
						bat 'mvn checkstyle:checkstyle'
					}
					post{
						success{
							junit 'target/surefire-reports/**/*.xml'
						}
					}
		        }

		        stage('FindBugs') {
					steps {
					bat 'mvn findbugs:findbugs'
					}
		        }

		        stage('PMD'){
					steps{
						bat 'mvn pmd:pmd'
					}
				}
	      	}	
		}
		
		stage('JavaDoc'){
			steps{
				bat 'mvn site'
			}
		}
		
		stage('Packaging'){
			steps{
				bat 'mvn package'
			}
		}
		
		
		stage('Archivage Nexus'){
			steps{
				nexusPublisher nexusInstanceId: 'localNexus', 
				nexusRepositoryId: 'releases', 
				packages: 
				[
					[
						$class: 'MavenPackage', mavenAssetList: 
						[[classifier: '', extension: '', filePath: 'target/Proth_APP-0.0.3.war']], 
						mavenCoordinate: [artifactId: 'Proth_APP', groupId: 'com', packaging: 'war', version: '0.0.3']
					]
				]
			}
		}

		/*stage('Deploying'){
			steps{
			}
		}*/
			
	}
}
