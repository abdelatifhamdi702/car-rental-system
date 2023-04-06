/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entity.Client_Numéros;
import Entity.Location;
import static Tools.Tools.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abdelatif Hamdi
 */
public class Voiture extends javax.swing.JFrame {

    /**
     * Creates new form Département
     */
    public Voiture() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTrouver = new controls.JMyBottom();
        btnTout = new controls.JMyBottom();
        btnSup = new controls.JMyBottom();
        btnModifier = new controls.JMyBottom();
        btnAjouter = new controls.JMyBottom();
        btnEffacer = new controls.JMyBottom();
        btnRetoure = new controls.JMyBottom();
        jLabel5 = new javax.swing.JLabel();
        RadBtnMatricule = new javax.swing.JRadioButton();
        RadBtnModèle = new javax.swing.JRadioButton();
        RadBtnDisponible = new javax.swing.JRadioButton();
        btnRecherche = new controls.JMyBottom();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDept = new javax.swing.JTable();
        Textmatricule = new controls.JTextBox(20);
        Textmarque = new controls.JTextBox(20);
        Textmodèle = new controls.JTextBox(20);
        TextRecherche = new controls.JTextBox(20);
        Textcouleur = new controls.JTextBox(20);
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbDisponible = new javax.swing.JCheckBox();
        cbPropriété = new javax.swing.JCheckBox();
        RadBtnMarque = new javax.swing.JRadioButton();
        RadBtnCouleur = new javax.swing.JRadioButton();
        RadBtnPropriété = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Textprix = new controls.JTextBox(20);
        RadBtnPrix = new javax.swing.JRadioButton();
        TextIdClient = new controls.JTextBox(20);
        Textduree = new controls.JTextBox(20);
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextDate = new com.toedter.calendar.JDateChooser();
        btnEffacer1 = new controls.JMyBottom();
        btnEffacer2 = new controls.JMyBottom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 32)); // NOI18N
        jLabel1.setText("Véhicules");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Matricule :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Marque :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modèle :");

        btnTrouver.setText("Trouver");
        btnTrouver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrouverActionPerformed(evt);
            }
        });

        btnTout.setText("Tout");
        btnTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToutActionPerformed(evt);
            }
        });

        btnSup.setText("Supprimer");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnEffacer.setText("Effacer");
        btnEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerActionPerformed(evt);
            }
        });

        btnRetoure.setText("Retoure");
        btnRetoure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetoureActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Chercher avec :");

        RadBtnMatricule.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnMatricule.setSelected(true);
        RadBtnMatricule.setText("Matricule");
        RadBtnMatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadBtnMatriculeActionPerformed(evt);
            }
        });

        RadBtnModèle.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnModèle.setText("Modèle");

        RadBtnDisponible.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnDisponible.setText("Disponible");

        btnRecherche.setText("Rechercher");
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        TblDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Marque", "Modèle", "Couleur", "Prix", "Disponible", "Propriété"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDeptMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDept);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Couleur :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Disponible :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Propriété :");

        cbDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisponibleActionPerformed(evt);
            }
        });

        RadBtnMarque.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnMarque.setText("Marque");
        RadBtnMarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadBtnMarqueActionPerformed(evt);
            }
        });

        RadBtnCouleur.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnCouleur.setText("Couleur");

        RadBtnPropriété.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnPropriété.setText("Propriété");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Prix :");

        RadBtnPrix.setBackground(new java.awt.Color(255, 255, 255));
        RadBtnPrix.setText("Prix");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Num Client :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Durée :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Date :");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnEffacer1.setText("Louer la véhicule");
        btnEffacer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacer1ActionPerformed(evt);
            }
        });

        btnEffacer2.setText("Retour");
        btnEffacer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacer2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Textmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Textmarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Textmodèle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Textcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Textprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSup, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbDisponible)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbPropriété))
                            .addComponent(btnRetoure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnTrouver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Textduree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnEffacer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEffacer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadBtnMatricule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadBtnMarque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadBtnModèle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadBtnCouleur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadBtnPrix))
                            .addComponent(TextRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadBtnDisponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadBtnPropriété))
                            .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAjouter, btnEffacer, btnModifier, btnSup, btnTout, btnTrouver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RadBtnMatricule)
                            .addComponent(RadBtnModèle)
                            .addComponent(RadBtnDisponible)
                            .addComponent(RadBtnMarque)
                            .addComponent(RadBtnPropriété)
                            .addComponent(RadBtnCouleur)
                            .addComponent(RadBtnPrix))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Textmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Textmarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Textmodèle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Textcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Textprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDisponible)
                                    .addComponent(jLabel8)
                                    .addComponent(cbPropriété))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTrouver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(TextIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Textduree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12))
                            .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEffacer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEffacer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnRetoure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setValues(){
    v.setMatricule(Textmatricule.getText());
    v.setMarque(Textmarque.getText());
    v.setModele(Textmodèle.getText());
    v.setCouleur(Textcouleur.getText());
    String disp = "";
    if (cbDisponible.isSelected() == true) disp = "Oui"; else disp = "Non";
    v.setDisponible(disp);
    String prop = "";
    if (cbPropriété.isSelected() == true) prop = "Oui"; else prop = "Non";
    v.setPropriete(prop);
    v.setPrix(Double.parseDouble(Textprix.getText()));
            
    }
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
    setValues();
    v.add();
    Clear();
    v.getAllRows(TblDept);
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void RadBtnMatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadBtnMatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadBtnMatriculeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnGroup.add(RadBtnMatricule);
        btnGroup.add(RadBtnModèle);
        btnGroup.add(RadBtnDisponible);
        btnGroup.add(RadBtnCouleur);
        btnGroup.add(RadBtnMarque);
        btnGroup.add(RadBtnPropriété);
        btnGroup.add(RadBtnPrix);
        Clear();
        v.getAllRows(TblDept);
    }//GEN-LAST:event_formWindowOpened

    private void btnRetoureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetoureActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Tools.Tools.OpenForm(new frmMain());
    }//GEN-LAST:event_btnRetoureActionPerformed
        Entity.Voiture v = new Entity.Voiture();
        
    private void Clear(){
    Tools.Tools.ClearTexts(this);
    btnAjouter.setEnabled(true);
    btnModifier.setEnabled(false);
    btnSup.setEnabled(false);
    Textmatricule.requestFocus();
    }
    private void btnEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnEffacerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        setValues();
        v.update();
        Clear();
        v.getAllRows(TblDept);
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
       if(Tools.Tools.ConfirmMessage("Voulez vous supprimer ? ")){
       setValues();
       v.delete();
       Clear();
       v.getAllRows(TblDept);}

    }//GEN-LAST:event_btnSupActionPerformed

    private void btnTrouverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrouverActionPerformed
    String strdeptNo = (String) Tools.Tools.InputBox("Entrer le matricule de voiture");
    String mat = strdeptNo;
    v.setMatricule(mat);
    v.getOneRow(TblDept);
    }//GEN-LAST:event_btnTrouverActionPerformed

    private void btnToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToutActionPerformed
        // TODO add your handling code here:
        v.getAllRows(TblDept);
    }//GEN-LAST:event_btnToutActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void TblDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDeptMouseClicked
             try{
         int row = TblDept.getSelectedRow();
         String mat = TblDept.getValueAt(row, 0).toString();
         String marque = TblDept.getValueAt(row, 1).toString();
         String modele = TblDept.getValueAt(row, 2).toString();
         String couleur = TblDept.getValueAt(row, 3).toString();
         String prix = TblDept.getValueAt(row, 4).toString();
         String disp = TblDept.getValueAt(row, 5).toString();
         String prop = TblDept.getValueAt(row, 6).toString();
         Textmatricule.setText(mat);
         Textmarque.setText(marque);
         Textmodèle.setText(modele);
         Textcouleur.setText(couleur);
         Textprix.setText(prix);
         boolean d = false;
         if ("Oui".equals(disp)) d = true;
         cbDisponible.setSelected(d);
         boolean p = false;
         if ("Oui".equals(prop)) p = true;
         cbPropriété.setSelected(p);
         btnAjouter.setEnabled(false);
         btnModifier.setEnabled(true);
         btnSup.setEnabled(true);
         }catch(Exception ex)
         {
             Message(ex.getMessage());
         } 
    }//GEN-LAST:event_TblDeptMouseClicked

    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
    String cherche ="select * from voiture where ";
    
    if (RadBtnMatricule.isSelected()){ cherche+="matricule ='"+TextRecherche.getText()+"'";}
    else if (RadBtnModèle.isSelected()){ cherche+="modele ='"+TextRecherche.getText()+"'";}
    else if (RadBtnMarque.isSelected()){ cherche+="marque ='"+TextRecherche.getText()+"'";}
    else if (RadBtnCouleur.isSelected()){ cherche+="couleur ='"+TextRecherche.getText()+"'";}
    else if (RadBtnPrix.isSelected()){ cherche+="prix ="+TextRecherche.getText();}
    else if (RadBtnDisponible.isSelected()){ cherche+="disponible ='"+TextRecherche.getText()+"'";}
    else if (RadBtnModèle.isSelected()){ cherche+="propriete ='"+TextRecherche.getText()+"'";}
    v.getCustomRows(cherche, TblDept);
    
    }//GEN-LAST:event_btnRechercheActionPerformed

    private void cbDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDisponibleActionPerformed

    private void RadBtnMarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadBtnMarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadBtnMarqueActionPerformed
Entity.Location l = new Location();
Entity.Client_Numéros cn = new Client_Numéros();
    private void btnEffacer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacer1ActionPerformed
    l.setIdVoiture(Textmatricule.getText());
    l.setIdClient(Integer.parseInt(cn.getEmpByPhone(TextIdClient.getText())));
    l.setDuree(Integer.parseInt(Textduree.getText()));
    Double total = Integer.parseInt(Textduree.getText()) * Double.parseDouble(Textprix.getText());
     l.setTotal(total);
     SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
     l.setDate(String.valueOf(s.format(new Date())));
     l.add();
     v.location(Textmatricule.getText());



    }//GEN-LAST:event_btnEffacer1ActionPerformed

    private void btnEffacer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacer2ActionPerformed
        v.retour(Textmatricule.getText());
    }//GEN-LAST:event_btnEffacer2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Voiture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voiture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voiture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voiture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voiture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadBtnCouleur;
    private javax.swing.JRadioButton RadBtnDisponible;
    private javax.swing.JRadioButton RadBtnMarque;
    private javax.swing.JRadioButton RadBtnMatricule;
    private javax.swing.JRadioButton RadBtnModèle;
    private javax.swing.JRadioButton RadBtnPrix;
    private javax.swing.JRadioButton RadBtnPropriété;
    private javax.swing.JTable TblDept;
    private com.toedter.calendar.JDateChooser TextDate;
    private javax.swing.JTextField TextIdClient;
    private javax.swing.JTextField TextRecherche;
    private javax.swing.JTextField Textcouleur;
    private javax.swing.JTextField Textduree;
    private javax.swing.JTextField Textmarque;
    private javax.swing.JTextField Textmatricule;
    private javax.swing.JTextField Textmodèle;
    private javax.swing.JTextField Textprix;
    private controls.JMyBottom btnAjouter;
    private controls.JMyBottom btnEffacer;
    private controls.JMyBottom btnEffacer1;
    private controls.JMyBottom btnEffacer2;
    private javax.swing.ButtonGroup btnGroup;
    private controls.JMyBottom btnModifier;
    private controls.JMyBottom btnRecherche;
    private controls.JMyBottom btnRetoure;
    private controls.JMyBottom btnSup;
    private controls.JMyBottom btnTout;
    private controls.JMyBottom btnTrouver;
    private javax.swing.JCheckBox cbDisponible;
    private javax.swing.JCheckBox cbPropriété;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
