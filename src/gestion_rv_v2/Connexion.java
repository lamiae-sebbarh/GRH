
package gestion_rv_v2;
import java.sql.*;

public class Connexion {
    String urlPilote="com.mysql.jdbc.Driver";
    String urlBaseDonnees="jdbc:Mysql://localhost:3306/dbrh";//Chemin de connexion a la base
    Connection con;
        public Connexion(){
    try{
    Class.forName(urlPilote);
    System.out.println("Chargement du pilote de réussi");
    
}catch(ClassNotFoundException ex){
    System.out.println(ex);
}
    try{
        con=DriverManager.getConnection(urlBaseDonnees,"root","");
        System.out.println("Connexion à la base de données réussi");
    
}catch(SQLException ex){
    System.out.println(ex);
}
}
        Connection ObtenirConnexion(){
        return con;
    }

    Statement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
