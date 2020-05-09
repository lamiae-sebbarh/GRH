
package gestion_rv_v2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;


public class EmployeHome extends javax.swing.JInternalFrame {

    
    
    public boolean dataStatu;
    //String requete=
    public void getData(){
        try{

            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT nom, prenom, sexe, datenais, nif, poste, dateemb, statut, salaire FROM EMPLOYE");
	    jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
	
	
       }catch(Exception e){
	
	
}
    }
    

    public EmployeHome() {
        initComponents();
        jFTNIF.setEditable(true);
        jTDateNais.setDate(new Date());
        jTDateEmb.setDate(new Date());
        
        
        setLocation(8,32);
        
        getData();
        dataStatu= true;
         SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        jTNom.requestFocus();
       
      }
      
    });
         pack();
    }
    Statement stmt;
    Connexion maConnexion= new Connexion();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jFTNIF = new javax.swing.JFormattedTextField();
        jLNom = new javax.swing.JLabel();
        jLPrenom = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jTPrenom = new javax.swing.JTextField();
        jTLieuNais = new javax.swing.JTextField();
        jLLieuNais = new javax.swing.JLabel();
        jLSexe = new javax.swing.JLabel();
        jLNIF = new javax.swing.JLabel();
        jCSexe = new javax.swing.JComboBox();
        jCSanguin = new javax.swing.JComboBox();
        jLNIF1 = new javax.swing.JLabel();
        jLDateNais = new javax.swing.JLabel();
        jLNiveauEtude = new javax.swing.JLabel();
        jCNEtude = new javax.swing.JComboBox();
        jTDateNais = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLPoste = new javax.swing.JLabel();
        jTPoste = new javax.swing.JTextField();
        jLDateEmb = new javax.swing.JLabel();
        jLStatut = new javax.swing.JLabel();
        jCStatut = new javax.swing.JComboBox();
        jTSalaire = new javax.swing.JTextField();
        jLDateEmb1 = new javax.swing.JLabel();
        jTDateEmb = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLTel = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jFTTel = new javax.swing.JFormattedTextField();
        jTEmail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jBValider = new javax.swing.JButton();
        jBVider = new javax.swing.JButton();
        jBQuitter = new javax.swing.JButton();
        jSupprimer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTSearch = new javax.swing.JTextField();
        jLTel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DES EMPLOYES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Détails sur l'employé"));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations Personnelles"));

        try {
            jFTNIF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNom.setForeground(new java.awt.Color(255, 102, 102));
        jLNom.setText("NOM");

        jLPrenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPrenom.setForeground(new java.awt.Color(255, 102, 102));
        jLPrenom.setText("PRENOM");

        jTNom.setText(" ");
        jTNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomActionPerformed(evt);
            }
        });
        jTNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomKeyTyped(evt);
            }
        });

        jTPrenom.setText(" ");
        jTPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrenomActionPerformed(evt);
            }
        });
        jTPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrenomKeyTyped(evt);
            }
        });

        jTLieuNais.setText(" ");
        jTLieuNais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLieuNaisActionPerformed(evt);
            }
        });
        jTLieuNais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLieuNaisKeyTyped(evt);
            }
        });

        jLLieuNais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLLieuNais.setForeground(new java.awt.Color(255, 102, 102));
        jLLieuNais.setText("LIEU DE NAISSANCE");

        jLSexe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLSexe.setForeground(new java.awt.Color(255, 102, 102));
        jLSexe.setText("SEXE");

        jLNIF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNIF.setForeground(new java.awt.Color(255, 102, 102));
        jLNIF.setText("NIF");

        jCSexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculin", "Féminin" }));
        jCSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSexeActionPerformed(evt);
            }
        });

        jCSanguin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "AB+", "AB-", "O+", "O-" }));

        jLNIF1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNIF1.setForeground(new java.awt.Color(255, 102, 102));
        jLNIF1.setText("GROUPE SANGUIN");

        jLDateNais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDateNais.setForeground(new java.awt.Color(255, 102, 102));
        jLDateNais.setText("DATE NAISSANCE");

        jLNiveauEtude.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNiveauEtude.setForeground(new java.awt.Color(255, 102, 102));
        jLNiveauEtude.setText("NIVEAU D'ETUDE");

        jCNEtude.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Certificat", "Licence", "Master", "Doctorat", "Autre" }));

        jTDateNais.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLNiveauEtude)
                .addGap(60, 60, 60)
                .addComponent(jCNEtude, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDateNais)
                            .addComponent(jLLieuNais)
                            .addComponent(jLNIF))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLNIF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFTNIF)
                    .addComponent(jTLieuNais, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCSexe, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTNom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCSanguin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDateNais, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLDateNais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateNais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLieuNais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTLieuNais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNIF1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSanguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNiveauEtude, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCNEtude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations sur l'emploi"));

        jLPoste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPoste.setForeground(new java.awt.Color(255, 102, 102));
        jLPoste.setText("POSTE");

        jTPoste.setText(" ");
        jTPoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPosteActionPerformed(evt);
            }
        });
        jTPoste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPosteKeyTyped(evt);
            }
        });

        jLDateEmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDateEmb.setForeground(new java.awt.Color(255, 102, 102));
        jLDateEmb.setText("DATE D'EMBAUCHE");

        jLStatut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLStatut.setForeground(new java.awt.Color(255, 102, 102));
        jLStatut.setText("STATUT");

        jCStatut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contrat Tps Plein", "Contrat Tps Partiel", "Nommé Tps Plein", "Nommé Tps Partiel" }));

        jTSalaire.setText(" ");
        jTSalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSalaireActionPerformed(evt);
            }
        });
        jTSalaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSalaireKeyTyped(evt);
            }
        });

        jLDateEmb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDateEmb1.setForeground(new java.awt.Color(255, 102, 102));
        jLDateEmb1.setText("SALAIRE");

        jTDateEmb.setDateFormatString("yyyy-MM-dd");
        jTDateEmb.setMinSelectableDate(new java.util.Date(-2208967355000L));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDateEmb)
                    .addComponent(jLStatut)
                    .addComponent(jLPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDateEmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTSalaire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCStatut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateEmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPoste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLDateEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateEmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDateEmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact"));

        jLTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTel.setForeground(new java.awt.Color(255, 102, 102));
        jLTel.setText("TELEPHONE");

        jLEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 102, 102));
        jLEmail.setText("E-MAIL");

        try {
            jFTTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(509)##-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTEmail.setText(" ");
        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLTel, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFTTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opérations"));

        jBValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_save.png"))); // NOI18N
        jBValider.setText("Sauver");
        jBValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBValiderActionPerformed(evt);
            }
        });

        jBVider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new_user.png"))); // NOI18N
        jBVider.setText("Nouveau");
        jBVider.setMaximumSize(new java.awt.Dimension(101, 23));
        jBVider.setMinimumSize(new java.awt.Dimension(101, 23));
        jBVider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBViderActionPerformed(evt);
            }
        });

        jBQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/use_exit.png"))); // NOI18N
        jBQuitter.setText("Sortir");
        jBQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitterActionPerformed(evt);
            }
        });

        jSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_delete.png"))); // NOI18N
        jSupprimer.setText("Supprimer");
        jSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSupprimerActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_print.png"))); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jBVider, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBValider, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBValider)
                    .addComponent(jBVider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBQuitter)
                    .addComponent(jSupprimer)
                    .addComponent(jButton1))
                .addGap(62, 62, 62))
        );

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Prenom", "Sexe", "DateNais", "NIF", "Poste", "DateEmb.", "Statut", "Salaire"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Recherche d'un employé"));

        jTSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTSearchKeyReleased(evt);
            }
        });

        jLTel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTel1.setForeground(new java.awt.Color(0, 51, 255));
        jLTel1.setText("ENTRER LE PRENOM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLTel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119)
                .addComponent(jTSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTel1))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("jPAppli");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomActionPerformed

    private void jTNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_jTNomKeyTyped

    private void jTPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrenomActionPerformed

    private void jTPrenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrenomKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_jTPrenomKeyTyped

    private void jTLieuNaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLieuNaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLieuNaisActionPerformed

    private void jTLieuNaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLieuNaisKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_jTLieuNaisKeyTyped

    private void jCSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSexeActionPerformed

    private void jTPosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPosteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPosteActionPerformed

    private void jTPosteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPosteKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_jTPosteKeyTyped

    private void jTSalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSalaireActionPerformed

    private void jTSalaireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSalaireKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTSalaireKeyTyped

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jBValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBValiderActionPerformed
        // TODO add your handling code here:
        //*********************************************************

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String daterecup=sdf.format(jTDateNais.getDate());
        String dateembrecup=sdf.format(jTDateEmb.getDate());
        String nomrecup=jTNom.getText().toUpperCase().trim();
        String prenomrecup=jTPrenom.getText().trim();
        String sexerecup= jCSexe.getSelectedItem().toString();
        String lieurecup=jTLieuNais.getText().trim();
        String nifrecup=jFTNIF.getText().trim();
        String grouperecup=jCSanguin.getSelectedItem().toString();
        String netuderecup=jCNEtude.getSelectedItem().toString();
        String posterecup=jTPoste.getText().trim();
        String statutrecup=jCStatut.getSelectedItem().toString();
        String salairerecup=jTSalaire.getText().trim();
        String telrecup=jFTTel.getText();
        String emailrecup=jTEmail.getText().trim();
        if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0 && daterecup.length()>0
            && jTLieuNais.getText().trim().length()>0 &&
            jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0  &&
            jTSalaire.getText().trim().length()>0 && jFTTel.getText().trim().length()>0 && jTEmail.getText().trim().length()>0){

        if(dataStatu==true){
            
            try{
            String requete="INSERT INTO EMPLOYE(nom, prenom, sexe, datenais, lieunais, nif, gsanguin,netude, poste, dateemb, statut, salaire, telephone, email)value ('"+nomrecup+"','"+prenomrecup+"','"+sexerecup+"','"+daterecup+"','"+lieurecup+"','"+nifrecup+"','"+grouperecup+"','"+netuderecup+"','"+posterecup+"','"+dateembrecup+"','"+statutrecup+"','"+salairerecup+"','"+telrecup+"','"+emailrecup+"')";
            stmt=maConnexion.ObtenirConnexion().createStatement();
            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null,"Enregistrement réussi!");
            jFTNIF.setText(null);
        jFTNIF.setEditable(true);
        jTNom.setText("");
        jTPrenom.setText("");
        jCSexe.setSelectedItem("Masculin");
        jTLieuNais.setText("");
        jCSanguin.setSelectedItem("A+");
        jCNEtude.setSelectedItem("Certificat");
        jCStatut.setSelectedItem("Contrat Tps Plein");
        jTPoste.setText("");
        jFTTel.setText(null);
        jTEmail.setText("");
        jTSalaire.setText("");
        jTDateNais.setDate(new Date());
        jTDateEmb.setDate(new Date());
            }catch(SQLException | HeadlessException e){
                //JOptionPane.showMessageDialog(null,e);
                JOptionPane.showMessageDialog(null, "Veuillez vérifier le NIF!");
                
            }
        }else{
            String requete="UPDATE EMPLOYE  SET nom='"+nomrecup+"', prenom='"+prenomrecup+"', sexe='"+sexerecup+"', datenais='"+daterecup+"', "
                 + "lieunais='"+lieurecup+"',gsanguin='"+grouperecup+"', netude='"+netuderecup+"', poste='"+posterecup+"', dateemb='"+dateembrecup+""
                 + "', statut='"+statutrecup+"', salaire='"+salairerecup+"', telephone='"+telrecup+"', email='"+emailrecup+"' where nif='"+jFTNIF.getText()+"'";

      try{
            stmt =maConnexion.ObtenirConnexion().createStatement();
            stmt .executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Modification réussie!");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,e);
        }
            
        }
        getData();
        }else{
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs!");
        }   
       
    }//GEN-LAST:event_jBValiderActionPerformed

    private void jBViderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBViderActionPerformed
        // TODO add your handling code here:
        dataStatu=true;
        jFTNIF.setText(null);
        jFTNIF.setEditable(true);
        jTNom.setText("");
        jTPrenom.setText("");
        jCSexe.setSelectedItem("Masculin");
        jTLieuNais.setText("");
        jCSanguin.setSelectedItem("A+");
        jCNEtude.setSelectedItem("Certificat");
        jCStatut.setSelectedItem("Contrat Tps Plein");
        jTPoste.setText("");
        jFTTel.setText(null);
        jTEmail.setText("");
        jTSalaire.setText("");
        jTDateNais.setDate(new Date());
        jTDateEmb.setDate(new Date());
        SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        jTNom.requestFocus();
       
      }
      
    });
    }//GEN-LAST:event_jBViderActionPerformed

    private void jBQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitterActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jBQuitterActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dataStatu=false;
        try{
            int row=jTable1.getSelectedRow();
            String table1_click=(jTable1.getModel().getValueAt(row,4).toString());
            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT * FROM EMPLOYE WHERE nif='"+table1_click+"'");

            if(resultat.next()){
                jTNom.setText(resultat.getString("nom"));
                jTPrenom.setText(resultat.getString("prenom"));
                jCSexe.setSelectedItem(resultat.getString("sexe"));
                jTDateNais.setDate(resultat.getDate("datenais"));
                jTLieuNais.setText(resultat.getString("lieunais"));
                jFTNIF.setText(resultat.getString("nif"));
                jFTNIF.setEditable(false);
                jCSanguin.setSelectedItem(resultat.getString("gsanguin"));
                jCNEtude.setSelectedItem(resultat.getString("netude"));
                jCStatut.setSelectedItem(resultat.getString("statut"));
                jTPoste.setText(resultat.getString("poste"));
                jTDateEmb.setDate(resultat.getDate("dateemb"));
                jCStatut.setSelectedItem(resultat.getString("statut"));
                jTSalaire.setText(resultat.getString("salaire"));
                jFTTel.setText(resultat.getString("telephone"));
                jTEmail.setText(resultat.getString("email"));

            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSupprimerActionPerformed
        // TODO add your handling code here:
        if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0
                && jTLieuNais.getText().trim().length()>0 &&
                 jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0&&
             jTSalaire.getText().trim().length()>0 && jFTTel.getText().length()>0 && jTEmail.getText().trim().length()>0){ 
            String requete="DELETE FROM EMPLOYE WHERE nif='"+jFTNIF.getText()+"'";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Suppresion réussie!");
           
               
      }                                           
      catch(SQLException ex){
            System.err.println(ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un employé!");
      
            
        }
        jFTNIF.setText(null);
        jFTNIF.setEditable(true);
        jTNom.setText("");
        jTPrenom.setText("");
        jCSexe.setSelectedItem("Masculin");
        jTLieuNais.setText("");
        jCSanguin.setSelectedItem("A+");
        jCNEtude.setSelectedItem("Certificat");
        jCStatut.setSelectedItem("Contrat Tps Plein");
        jTPoste.setText("");
        jFTTel.setText(null);
        jTEmail.setText("");
        jTSalaire.setText("");
        jTDateNais.setDate(new Date());
        jTDateEmb.setDate(new Date());
        getData();
    }//GEN-LAST:event_jSupprimerActionPerformed

    private void jTSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSearchKeyReleased
        // TODO add your handling code here:

        dataStatu=false;
        
        try{
            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT nom, prenom, sexe, datenais, nif, poste, dateemb, statut, salaire FROM EMPLOYE where prenom LIKE '" + jTSearch.getText().trim() + "%'");
	    jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
	
          }catch(Exception e){
	
	
}
        
    }//GEN-LAST:event_jTSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        final String daterecup=sdf.format(jTDateEmb.getDate());
        final String dateNais=sdf.format(jTDateNais.getDate());
        
        if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0
                && jTLieuNais.getText().trim().length()>0 &&
                 jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0&&
             jTSalaire.getText().trim().length()>0 && jFTTel.getText().length()>0 && jTEmail.getText().trim().length()>0){
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
 
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
         
    //Image
                /*BufferedImage image = ImageIO.read(new File(adresseImage));
                graphics.drawImage(image, 0, 0, null);*/
                
    //Image
        int marge=30;
        int x = (int)pageFormat.getImageableX();
        int y = (int)pageFormat.getImageableY();
                 
        graphics.setFont(new Font("Times new roman", Font.BOLD, 20));
        graphics.setColor(Color.BLACK);
        graphics.drawString("                            FICHE DE L'EMPLOYE\n", x + marge, y + marge);
 
        graphics.drawLine(100, 40, 470, 40);
    
    
        graphics.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        graphics.drawString(" *Nom", 130, 80);        
        graphics.drawString(jTNom.getText(), 350, 80);
        
        graphics.drawString(" *Prénom", 130, 110);
        graphics.drawString(jTPrenom.getText(), 350, 110);
        
        graphics.drawString(" *Sexe", 130, 140);
        graphics.drawString((String) jCSexe.getSelectedItem(), 350, 140);
        
        graphics.drawString(" *Date Naissance", 130, 170);
        graphics.drawString(dateNais, 350, 170);
        
        graphics.drawString(" *Lieu", 130, 200);
        graphics.drawString(jTLieuNais.getText(), 350, 200);
        
        graphics.drawString(" *NIF", 130, 230);
        graphics.drawString(jFTNIF.getText(), 350, 230);
        
        graphics.drawString(" *G. Sanguin", 130, 270);
        graphics.drawString((String) jCSanguin.getSelectedItem(), 350, 270);
        
        graphics.drawString(" *Grade", 130, 300);
        graphics.drawString((String) jCNEtude.getSelectedItem(), 350, 300);
             
        graphics.drawString(" *Poste", 130, 330);
        graphics.drawString(jTPoste.getText(), 350, 330);
        
        graphics.drawString(" *Date Embauche", 130, 360);
        graphics.drawString(daterecup, 350, 360);
        
        graphics.drawString(" *Statut", 130, 390);
        graphics.drawString((String) jCStatut.getSelectedItem(), 350, 390);
        
        graphics.drawString(" *Salaire", 130, 420);
        graphics.drawString(jTSalaire.getText()+" Gdes.", 350, 420);
        
        graphics.drawString(" *Téléphone", 130, 450);
        graphics.drawString(jFTTel.getText(), 350, 450);
        
        graphics.drawString(" *Email", 130, 480);
        graphics.drawString(jTEmail.getText(), 350, 480);

        return PAGE_EXISTS;
            }
 
        });
boolean doPrint = job.printDialog();
if(doPrint) {
    try {
         
        job.print();
    }
    catch (PrinterException e1) {
            JOptionPane.showMessageDialog(null, e1);
    }
}}else{
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un employé!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBQuitter;
    private javax.swing.JButton jBValider;
    private javax.swing.JButton jBVider;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCNEtude;
    private javax.swing.JComboBox jCSanguin;
    private javax.swing.JComboBox jCSexe;
    private javax.swing.JComboBox jCStatut;
    private javax.swing.JFormattedTextField jFTNIF;
    private javax.swing.JFormattedTextField jFTTel;
    private javax.swing.JLabel jLDateEmb;
    private javax.swing.JLabel jLDateEmb1;
    private javax.swing.JLabel jLDateNais;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLLieuNais;
    private javax.swing.JLabel jLNIF;
    private javax.swing.JLabel jLNIF1;
    private javax.swing.JLabel jLNiveauEtude;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLPoste;
    private javax.swing.JLabel jLPrenom;
    private javax.swing.JLabel jLSexe;
    private javax.swing.JLabel jLStatut;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLTel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSupprimer;
    private com.toedter.calendar.JDateChooser jTDateEmb;
    private com.toedter.calendar.JDateChooser jTDateNais;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTLieuNais;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTPoste;
    private javax.swing.JTextField jTPrenom;
    private javax.swing.JTextField jTSalaire;
    private javax.swing.JTextField jTSearch;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
