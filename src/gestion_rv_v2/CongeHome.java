
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class CongeHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeHome
     */
    public boolean dataStatu;
    //String requete=
    public void getData(){
        try{

            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT ref, nom, prenom, dateemb, poste, statut, datedebut, datefin, typeconge, nif FROM CONGE");
	    jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
	
	
       }catch(Exception e){
	
}
    }
    

    public CongeHome() {
        initComponents();
        
        jFTNIF.setEditable(true);
        jTRef.setEditable(false);
        jTDateDebut.setDate(new Date());
        jTDateEmb.setDate(new Date());
        jTDateFin.setDate(new Date());
        jTNom.setEditable(true);
        jTPrenom.setEditable(true);
        jTDateEmb.setEnabled(true);
        jTPoste.setEditable(true);
        jCStatut.setEnabled(true);
        
        setLocation(8,32);
        
        
        dataStatu= true;
         
         pack();
         jTRef.setVisible(false);
         
         getData();
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
        jLNom = new javax.swing.JLabel();
        jLPrenom = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jTPrenom = new javax.swing.JTextField();
        jLDateEmb = new javax.swing.JLabel();
        jTDateEmb = new com.toedter.calendar.JDateChooser();
        jLPoste = new javax.swing.JLabel();
        jTPoste = new javax.swing.JTextField();
        jLStatut = new javax.swing.JLabel();
        jCStatut = new javax.swing.JComboBox();
        jLTel1 = new javax.swing.JLabel();
        jFTNIF = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jBValider = new javax.swing.JButton();
        jBNouveau = new javax.swing.JButton();
        jBQuitter = new javax.swing.JButton();
        jSupprimer = new javax.swing.JButton();
        jBImprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLTel2 = new javax.swing.JLabel();
        jTNomFiltre = new javax.swing.JTextField();
        jTRef = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLStatut1 = new javax.swing.JLabel();
        jLStatut2 = new javax.swing.JLabel();
        jLStatut3 = new javax.swing.JLabel();
        jCTypeConge = new javax.swing.JComboBox();
        jTDateFin = new com.toedter.calendar.JDateChooser();
        jTDateDebut = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DES CONGES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1118, Short.MAX_VALUE))
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

        jLDateEmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDateEmb.setForeground(new java.awt.Color(255, 102, 102));
        jLDateEmb.setText("DATE D'EMBAUCHE");

        jTDateEmb.setDateFormatString("yyyy-MM-dd");
        jTDateEmb.setMinSelectableDate(new java.util.Date(-2208967355000L));

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

        jLStatut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLStatut.setForeground(new java.awt.Color(255, 102, 102));
        jLStatut.setText("STATUT");

        jCStatut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contrat Tps Plein", "Contrat Tps Partiel", "Nommé Tps Plein", "Nommé Tps Partiel" }));

        jLTel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTel1.setForeground(new java.awt.Color(255, 102, 102));
        jLTel1.setText("NIF");

        try {
            jFTNIF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTNIF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jFTNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTNIFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jTPrenom, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDateEmb)
                    .addComponent(jLPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLStatut)
                    .addComponent(jLTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFTNIF)
                    .addComponent(jCStatut, 0, 135, Short.MAX_VALUE)
                    .addComponent(jTPoste)
                    .addComponent(jTDateEmb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDateEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateEmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTel1)
                    .addComponent(jFTNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jBNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/all_new.png"))); // NOI18N
        jBNouveau.setText("Nouveau");
        jBNouveau.setMaximumSize(new java.awt.Dimension(101, 23));
        jBNouveau.setMinimumSize(new java.awt.Dimension(101, 23));
        jBNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNouveauActionPerformed(evt);
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

        jBImprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_print.png"))); // NOI18N
        jBImprimer.setText("Imprimer");
        jBImprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jBNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBValider, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBImprimer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBValider)
                    .addComponent(jBNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBQuitter)
                    .addComponent(jSupprimer)
                    .addComponent(jBImprimer))
                .addGap(62, 62, 62))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ref", "Nom", "Prenom", "DateEmb.", "Poste", "Statut", "TypeConge", "Debut", "Fin", "NBreJour", "NIF"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtre ou recherche d'un employé"));

        jLTel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTel2.setForeground(new java.awt.Color(0, 51, 255));
        jLTel2.setText("ENTRER LE PRENOM");

        jTNomFiltre.setText(" ");
        jTNomFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomFiltreActionPerformed(evt);
            }
        });
        jTNomFiltre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNomFiltreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomFiltreKeyTyped(evt);
            }
        });

        jTRef.setText(" ");
        jTRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRefActionPerformed(evt);
            }
        });
        jTRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRefKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTNomFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTRef, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTel2)
                    .addComponent(jTNomFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations sur le congé"));

        jLStatut1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLStatut1.setForeground(new java.awt.Color(0, 51, 255));
        jLStatut1.setText("DATE DEBUT");

        jLStatut2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLStatut2.setForeground(new java.awt.Color(0, 51, 255));
        jLStatut2.setText("DATE FIN");

        jLStatut3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLStatut3.setForeground(new java.awt.Color(0, 51, 255));
        jLStatut3.setText("TYPE CONGE");

        jCTypeConge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cg. Payé", "Cg. Maternité", "Cg. Paternité", "Cg. S. Solde" }));

        jTDateFin.setDateFormatString("yyyy-MM-dd");

        jTDateDebut.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLStatut2)
                    .addComponent(jLStatut1)
                    .addComponent(jLStatut3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTDateDebut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDateFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCTypeConge, 0, 135, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLStatut1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLStatut2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStatut3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTypeConge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jBValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBValiderActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");        
        String dateEmbauche=sdf.format(jTDateEmb.getDate());        
        String datedebu=sdf.format(jTDateDebut.getDate());
        String datefi=sdf.format(jTDateFin.getDate());
        
        String nomrecup=jTNom.getText().toUpperCase().trim();
        String prenomrecup=jTPrenom.getText().trim();
        String posterecup=jTPoste.getText().trim();
        String statutrecup=jCStatut.getSelectedItem().toString();
        String typeConge=jCTypeConge.getSelectedItem().toString();
        
        Date date_1=jTDateDebut.getDate();
        Date date_2=jTDateFin.getDate();
        long CONST_DURATION_OF_DAY = 1000l * 60 * 60 * 24; 
        long diff = Math.abs(date_2.getTime() - date_1.getTime());
        long numberOfDay = diff/CONST_DURATION_OF_DAY; 
        int congeAPrendre = (int) numberOfDay;
        int congePris=0;
        
        if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0 
            && jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0 ){

        if(dataStatu==true){//Enreg
            
            
    String requete="SELECT SUM(njour) AS nbJour FROM CONGE WHERE nif='"+jFTNIF.getText().trim()+"' AND typeconge='"+jCTypeConge.getSelectedItem().toString()+"' ";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            ResultSet resultat= stmt.executeQuery(requete);

            if(!resultat.next() || jFTNIF.getText()==null){
                JOptionPane.showMessageDialog(this, "Veuillez entrer une référence valide!",
                    "Avertissement",JOptionPane.WARNING_MESSAGE);

                jFTNIF.setText(null);
                jTRef.setText(null);
                jTNom.setText("");
                jTPrenom.setText("");
                jCStatut.setSelectedItem("Contrat Tps Plein");
                jCTypeConge.setSelectedItem("Cg. Payé");
                jTPoste.setText("");
                
                
            }
            else{
                resultat= stmt.executeQuery(requete);

                while(resultat.next()){

                    congePris=resultat.getInt("nbJour");
                   
                }
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
      

     if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0
                && jTPoste.getText().trim().length()>0 &&
             jFTNIF.getText().trim().length()>0 ){     
          if( jTDateDebut.getDate().before(jTDateFin.getDate())){   
              if((typeConge.contains("Cg. Payé")&& congePris<15 && congeAPrendre<=(15-congePris))||(typeConge.contains("Cg. Maternité") && congePris<90 && congeAPrendre<=(90-congePris))||
             (typeConge.contains("Cg. Paternité") && congePris<3 && congeAPrendre<=(3-congePris))||(typeConge.contains("Cg. S. Solde") && congePris<730 && congeAPrendre<=(730-congePris))){
        String requete2="INSERT INTO CONGE(nom, prenom, poste, dateemb, statut, typeconge, datedebut, datefin, njour, nif )value ('"+nomrecup+"',"
                    + "'"+prenomrecup+"','"+posterecup+"', '"+dateEmbauche+"', '"+statutrecup+"','"+typeConge+"', '"+datedebu+"',"
                    + "'"+datefi+"','"+congeAPrendre+"','"+jFTNIF.getText()+"')"; 
        
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            stmt.executeUpdate(requete2);
            JOptionPane.showMessageDialog(null, "M/Mme "+nomrecup+" "+prenomrecup+" a reçu son congé!");

            jFTNIF.setText(null);
            jTRef.setText(null);
            jTNom.setText("");
            jTPrenom.setText("");
            jCStatut.setSelectedItem("Contrat Tps Plein");    
            jCTypeConge.setSelectedItem("Cg. Payé");
            jTPoste.setText("");
            
            jTDateDebut.setDate(new Date()); 
            jTDateFin.setDate(new Date()); 
            jTDateEmb.setDate(new Date());
            
            
            }catch(SQLException ex){
            System.err.println(ex);
        }//
         
     }else{
         JOptionPane.showMessageDialog(null, "M/Mme "+ jTPrenom.getText()+" n'a pas de congé suffisant\nVeuillez vérifier la liste des congés!");
           jFTNIF.setText(null);
           jTRef.setText(null);
           jTNom.setText("");
           jTPrenom.setText("");
           jCStatut.setSelectedItem("Contrat Tps Plein");   
           jCTypeConge.setSelectedItem("Cg. Payé");
           jTPoste.setText("");
           jTDateDebut.setDate(new Date());
           jTDateEmb.setDate(new Date());
           jTDateFin.setDate(new Date());
     }
              
        
     }else{
             JOptionPane.showMessageDialog(null, "La date de début doit être inférieure à la date de fin!");
             jTDateDebut.setDate(new Date()); 
             jTDateFin.setDate(new Date());
         }
      
     }else{
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs!");
        }
        }
        
        else{

    String requete="SELECT SUM(njour) AS nbJour FROM CONGE WHERE nif='"+jFTNIF.getText().trim()+"' AND typeconge='"+jCTypeConge.getSelectedItem().toString()+"' ";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            ResultSet resultat= stmt.executeQuery(requete);

            if(!resultat.next() || jFTNIF.getText()==null){
                JOptionPane.showMessageDialog(this, "Veuillez entrer une référence valide!",
                    "Avertissement",JOptionPane.WARNING_MESSAGE);

                jFTNIF.setText(null);
                jTRef.setText(null);
                jTNom.setText("");
                jTPrenom.setText("");
                jCStatut.setSelectedItem("Contrat Tps Plein");
                jCTypeConge.setSelectedItem("Cg. Payé");
                jTPoste.setText("");
                
                
            }
            else{
                resultat= stmt.executeQuery(requete);

                while(resultat.next()){

                    congePris=resultat.getInt("nbJour");
                   
                }
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
      
    
          if( jTDateDebut.getDate().before(jTDateFin.getDate())){   
              if((typeConge.contains("Cg. Payé")&& congePris<15 && congeAPrendre<=(15-congePris))||(typeConge.contains("Cg. Maternité") && congePris<90 && congeAPrendre<=(90-congePris))||
             (typeConge.contains("Cg. Paternité") && congePris<3 && congeAPrendre<=(3-congePris))||(typeConge.contains("Cg. S. Solde") && congePris<730 && congeAPrendre<=(730-congePris))){
        String requete2="UPDATE CONGE  SET datedebut='"+datedebu+""
                 + "', datefin='"+datefi+"', typeconge='"+typeConge+"' where ref='"+jTRef.getText()+"'";

      try{
            stmt =maConnexion.ObtenirConnexion().createStatement();
            stmt .executeUpdate(requete2);
            JOptionPane.showMessageDialog(null, "Modification réussie!");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,e);
        }//
         
     }else{
         JOptionPane.showMessageDialog(null, "M/Mme "+ jTPrenom.getText()+" n'a pas de congé suffisant\nVeuillez vérifier la liste des congés!");
           jFTNIF.setText(null);
           jTRef.setText(null);
           jTNom.setText("");
           jTPrenom.setText("");
           jCStatut.setSelectedItem("Contrat Tps Plein");   
           jCTypeConge.setSelectedItem("Cg. Payé");
           jTPoste.setText("");
           jTDateDebut.setDate(new Date());
           jTDateEmb.setDate(new Date());
           jTDateFin.setDate(new Date());
     }
              
        
     }else{
             JOptionPane.showMessageDialog(null, "La date de début doit être inférieure à la date de fin!");
             
         }
 
        }
        getData();
        }else{
            JOptionPane.showMessageDialog(null, "Cliquez sur nouveau pour un nouveau congé!");
        }   
       
    }//GEN-LAST:event_jBValiderActionPerformed

    private void jBNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNouveauActionPerformed
        // TODO add your handling code here:
        dataStatu=true;
        jFTNIF.setText(null);
        jFTNIF.setEditable(true);
        jTRef.setText(null);
        jTNom.setText("");
        jTPrenom.setText("");
        jTDateEmb.setDate(new Date());
        jTPoste.setText("");
        jCStatut.setSelectedItem("Contrat Tps Plein");
        
        jTDateDebut.setDate(new Date());
        jTDateFin.setDate(new Date());
        jCTypeConge.setSelectedItem("Cg. Payé");
        
        String recupNif = JOptionPane.showInputDialog(null, "Veuillez entrer le nif de l'employé", JOptionPane.QUESTION_MESSAGE);
        
        String requete="select* from EMPLOYE where nif='"+recupNif+"' ";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            ResultSet resultat= stmt.executeQuery(requete);
            //code

            if(!resultat.next() || jFTNIF.getText()==null){
                JOptionPane.showMessageDialog(this, "Veuillez entrer un NIF valide.\nFormat: xxx-xxx-xxx-x",
                    "Avertissement",JOptionPane.WARNING_MESSAGE);

                jFTNIF.setText(null);
                jTRef.setText(null);
                jTNom.setText("");
                jTPrenom.setText("");
                jCStatut.setSelectedItem("Contrat Tps Plein");
                jCTypeConge.setSelectedItem("Cg. Payé");
                jTPoste.setText("");                
                
            }
            else{
                resultat= stmt.executeQuery(requete);

                while(resultat.next()){

                    jTNom.setText(resultat.getString("nom"));
                    jTPrenom.setText(resultat.getString("prenom"));
                    jTPoste.setText(resultat.getString("poste"));
                    jCStatut.setSelectedItem(resultat.getString("Statut"));
                    jTDateEmb.setDate(resultat.getDate("dateemb"));
                    jFTNIF.setText(resultat.getString("nif"));  
                    
                    jFTNIF.setEditable(false); 
                    jTNom.setEditable(false);
                    jTPrenom.setEditable(false);
                    jTDateEmb.setEnabled(false);
                    jTPoste.setEditable(false);
                    jCStatut.setEnabled(false);

                }
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        getData();

    }//GEN-LAST:event_jBNouveauActionPerformed

    private void jBQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitterActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBQuitterActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dataStatu=false;
        try{
            int row=jTable1.getSelectedRow();
            String table1_click=(jTable1.getModel().getValueAt(row,0).toString());
            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT ref, nom, prenom, dateemb, poste, statut, typeconge, datedebut, datefin, nif from CONGE WHERE ref='"+table1_click+"'");

            if(resultat.next()){
                jTRef.setText((resultat.getString("ref")));
                jTNom.setText(resultat.getString("nom"));
                jTPrenom.setText(resultat.getString("prenom"));                
                jTDateEmb.setDate(resultat.getDate("dateemb"));
                jTPoste.setText(resultat.getString("poste"));
                jCStatut.setSelectedItem(resultat.getString("statut"));
                jFTNIF.setEditable(false);
                jCTypeConge.setSelectedItem(resultat.getString("typeconge"));
                jTDateDebut.setDate(resultat.getDate("datedebut"));
                jTDateFin.setDate(resultat.getDate("datefin"));
                jFTNIF.setText(resultat.getString("nif"));
                
             
                jTNom.setEditable(false);
                jTPrenom.setEditable(false);
                jTDateEmb.setEnabled(false);
                jTPoste.setEditable(false);
                jCStatut.setEnabled(false); 

            }

        }catch(Exception e){

        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSupprimerActionPerformed
        // TODO add your handling code here:
      if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0
                && jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0){ 
            String requete="DELETE FROM CONGE WHERE ref='"+jTRef.getText()+"'";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Suppresion réussie!");
           
               
      }                                           
      catch(SQLException ex){
            System.err.println(ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner le congé à annuler!");//
      
            
        }
        jTRef.setText(null);
        jFTNIF.setText(null);
        jTNom.setText("");
        jTPrenom.setText("");
        jTDateEmb.setDate(new Date());
        jTPoste.setText("");
        jCStatut.setSelectedItem("Contrat Tps Plein");        
        jTDateDebut.setDate(new Date());
        jTDateFin.setDate(new Date());
        jCTypeConge.setSelectedItem("Cg. Payé");

        getData();
    }//GEN-LAST:event_jSupprimerActionPerformed

    private void jFTNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTNIFActionPerformed

    private void jTNomFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomFiltreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomFiltreActionPerformed

    private void jTNomFiltreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomFiltreKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_jTNomFiltreKeyTyped

    private void jTNomFiltreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomFiltreKeyReleased
        // TODO add your handling code here:
        try{
            java.sql.Statement stmt1=maConnexion.ObtenirConnexion().createStatement();
            java.sql.ResultSet resultat= stmt1.executeQuery("SELECT ref, nom, prenom, dateemb, poste, statut, typeconge, datedebut, datefin, nif from CONGE where prenom LIKE '" + jTNomFiltre.getText().trim() + "%'");
	    jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
	
          }catch(Exception e){
	
	
}
    }//GEN-LAST:event_jTNomFiltreKeyReleased

    private void jTRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRefActionPerformed

    private void jTRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRefKeyTyped

    private void jBImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimerActionPerformed
        // TODO add your handling code here:
        //
        int conge=0;
        String requete="SELECT SUM(njour) AS nbJour FROM CONGE WHERE nif='"+jFTNIF.getText().trim()+"' AND typeconge='"+jCTypeConge.getSelectedItem().toString()+"' ";
        try{
            stmt=maConnexion.ObtenirConnexion().createStatement();
            ResultSet resultat= stmt.executeQuery(requete);

                while(resultat.next()){

                    conge=resultat.getInt("nbJour");
     
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        //
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        final String daterecup=sdf.format(jTDateEmb.getDate());
        final String dated=sdf.format(jTDateDebut.getDate());
        final String datef=sdf.format(jTDateFin.getDate());
        final String s1=Integer.toString(conge);

        
        if(jTNom.getText().trim().length()>0 && jTPrenom.getText().trim().length()>0
                && jFTNIF.getText().trim().length()>0 && jTPoste.getText().trim().length()>0){
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
 
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        int marge=30;
        int x = (int)pageFormat.getImageableX();
        int y = (int)pageFormat.getImageableY();
                 
        graphics.setFont(new Font("Times new roman", Font.BOLD, 20));
        graphics.setColor(Color.BLACK);
        graphics.drawString("                            FICHE DE CONGE\n", x + marge, y + marge);
 
        graphics.drawLine(100, 40, 470, 40);    
    
        graphics.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        graphics.drawString(" *Nom", 130, 80);        
        graphics.drawString(jTNom.getText(), 350, 80);
        
        graphics.drawString(" *Prénom", 130, 110);
        graphics.drawString(jTPrenom.getText(), 350, 110);
        
        graphics.drawString(" *Date Embauche", 130, 140);
        graphics.drawString(daterecup, 350, 140);
        
        graphics.drawString(" *Poste", 130, 170);
        graphics.drawString(jTPoste.getText(), 350, 170);        
        
        graphics.drawString(" *Statut", 130, 200);
        graphics.drawString((String) jCStatut.getSelectedItem(), 350, 200);
                
        graphics.drawString(" *NIF", 130, 230);
        graphics.drawString(jFTNIF.getText(), 350, 230);        
        
        graphics.drawString(" *Date début", 130, 270);
        graphics.drawString(dated, 350, 270);
        
        graphics.drawString(" *Date fin", 130, 300);
        graphics.drawString(datef, 350, 300);
             
        graphics.drawString(" *Type Congé", 130, 330);
        graphics.drawString((String) jCTypeConge.getSelectedItem(), 350, 330);
        
        graphics.drawString(" *Nbre. de Jours", 130, 360);
        graphics.drawString(s1, 350, 360);

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
    }//GEN-LAST:event_jBImprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBImprimer;
    private javax.swing.JButton jBNouveau;
    private javax.swing.JButton jBQuitter;
    private javax.swing.JButton jBValider;
    private javax.swing.JComboBox jCStatut;
    private javax.swing.JComboBox jCTypeConge;
    private javax.swing.JFormattedTextField jFTNIF;
    private javax.swing.JLabel jLDateEmb;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLPoste;
    private javax.swing.JLabel jLPrenom;
    private javax.swing.JLabel jLStatut;
    private javax.swing.JLabel jLStatut1;
    private javax.swing.JLabel jLStatut2;
    private javax.swing.JLabel jLStatut3;
    private javax.swing.JLabel jLTel1;
    private javax.swing.JLabel jLTel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSupprimer;
    private com.toedter.calendar.JDateChooser jTDateDebut;
    private com.toedter.calendar.JDateChooser jTDateEmb;
    private com.toedter.calendar.JDateChooser jTDateFin;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTNomFiltre;
    private javax.swing.JTextField jTPoste;
    private javax.swing.JTextField jTPrenom;
    private javax.swing.JTextField jTRef;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
