/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClientAjoutAnimalTrouve.java
 *
 * Created on 27 févr. 2014, 11:25:33
 */

package edu.esprit.GUI;

import edu.esprit.DAO.AnimalTrouveDAO;
import edu.esprit.entities.AnimalTrouve;
import edu.esprit.util.Controle;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Melek
 */
public class ClientAjoutAnimalTrouve extends javax.swing.JFrame {

    /** Creates new form ClientAjoutAnimalTrouve */
    public ClientAjoutAnimalTrouve() {
        initComponents();
         ok1.setVisible(false);
        ok2.setVisible(false);
        ok3.setVisible(false);
        ok4.setVisible(false);
        ok6.setVisible(false);

        no1.setVisible(false);
        no2.setVisible(false);
        no3.setVisible(false);
        no4.setVisible(false);
        no6.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbtype = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbcouleur = new javax.swing.JComboBox();
        tfespece = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbsexe = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbetat = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tadescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfville = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfregion = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        no1 = new javax.swing.JLabel();
        ok1 = new javax.swing.JLabel();
        ok2 = new javax.swing.JLabel();
        no2 = new javax.swing.JLabel();
        no3 = new javax.swing.JLabel();
        ok3 = new javax.swing.JLabel();
        ok4 = new javax.swing.JLabel();
        no4 = new javax.swing.JLabel();
        ok6 = new javax.swing.JLabel();
        no6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Ajouter Animal Trouvé");

        cbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chat", "Cheval", "Chien", "Ronjeur", "Furet", "Oiseau", "Reptile" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Couleur");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Espece");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Photo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Type");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1393447771_plus-24.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbcouleur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Noir", "Blanc", "Vert", "Bleu", "Rouge", "Marron", "Mauve", " " }));
        cbcouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcouleurActionPerformed(evt);
            }
        });

        tfespece.setFont(new java.awt.Font("Tahoma", 0, 12));
        tfespece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfespeceKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit-the-System-1128050130.png"))); // NOI18N
        jButton2.setText("Quitter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("Sexe");

        cbsexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Femelle", "Je ne sais pas" }));
        cbsexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsexeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Etat");

        cbetat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bon", "blessé", "affamé" }));
        cbetat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbetatActionPerformed(evt);
            }
        });

        tadescription.setColumns(20);
        tadescription.setRows(5);
        tadescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tadescriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tadescription);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel12.setText("Description");

        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        jButton5.setText("Attacher photo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel22.setText("Date");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setText("Ville");

        tfville.setFont(new java.awt.Font("Tahoma", 0, 12));
        tfville.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfvilleKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel23.setText("Region");

        tfregion.setFont(new java.awt.Font("Tahoma", 0, 12));
        tfregion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfregionKeyTyped(evt);
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        no1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N

        ok1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accept.png"))); // NOI18N

        ok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accept.png"))); // NOI18N

        no2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N

        no3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N

        ok3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accept.png"))); // NOI18N

        ok4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accept.png"))); // NOI18N

        no4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N

        ok6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accept.png"))); // NOI18N

        no6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel9))
                                            .addGap(84, 84, 84)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(tfespece, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tfville, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfregion, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(path, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(69, 69, 69)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ok2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ok1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ok3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ok4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ok6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no6))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton2)
                                            .addComponent(jButton5))))
                                .addGap(76, 76, 76))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbsexe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbetat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbcouleur, 0, 130, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbetat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbsexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfespece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ok1)
                        .addComponent(no1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tfville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ok2)
                            .addComponent(no2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ok3)
                            .addComponent(no3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(tfregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ok4)
                    .addComponent(no4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(ok6)
                    .addComponent(no6))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AnimalTrouve animal= new AnimalTrouve();
        AnimalTrouveDAO animalDAO= new AnimalTrouveDAO();
        if(espece && date && ville && region && description)
        {
        animal.setType(cbtype.getSelectedItem().toString());
        animal.setEspece(tfespece.getText());
        animal.setCouleur(cbcouleur.getSelectedItem().toString());
        animal.setSexe(cbsexe.getSelectedItem().toString());
        animal.setEtat(cbetat.getSelectedItem().toString());
        animal.setDescription(tadescription.getText());
        animal.setDate(jDateChooser1.getDateFormatString());
        animal.setVille(tfville.getText());
        animal.setRegion(tfregion.getText());
        animal.setPhoto(animal_image);
        animalDAO.insertAnimal(animal,Connection.id);
        JOptionPane.showMessageDialog(this, "Ajout effectué avec succès");
        }
        else
       {
             jperr.showMessageDialog(this, "Certaines données saisies sont invalides", "Erreur", jperr.ERROR_MESSAGE);

        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void cbcouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcouleurActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cbcouleurActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void cbsexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cbsexeActionPerformed

    private void cbetatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbetatActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cbetatActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_pathActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        path.setText(filename);
        try {
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);

            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            animal_image=bos.toByteArray();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tfespeceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfespeceKeyTyped
        // TODO add your handling code here:
         Controle c = new Controle();
        boolean result = c.controlestring(tfespece.getText());
       // System.out.println("" + result);
        if (result == true) {
            espece = true;
            ok1.setVisible(true);
            no1.setVisible(false);
        } else if (result == false) {
            espece = false;
            ok1.setVisible(false);
            no1.setVisible(true);
        } else if (tfespece.getText() == null) {
            espece = false;
            ok1.setVisible(false);
            no1.setVisible(true);
        }
    }//GEN-LAST:event_tfespeceKeyTyped

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
         Controle c = new Controle();
        boolean result = c.controlestring(jDateChooser1.getDateFormatString());
       // System.out.println("" + result);
        if (result == true) {
            date = true;
            ok2.setVisible(true);
            no2.setVisible(false);
        } else if (result == false) {
            date = false;
            ok2.setVisible(false);
            no2.setVisible(true);
        } else if (jDateChooser1.getDateFormatString() == null) {
            date = false;
            ok2.setVisible(false);
            no2.setVisible(true);
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void tfvilleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfvilleKeyTyped
        // TODO add your handling code here:
           Controle c = new Controle();
        boolean result = c.controlestring(tfville.getText());
       // System.out.println("" + result);
        if (result == true) {
            ville = true;
            ok3.setVisible(true);
            no3.setVisible(false);
        } else if (result == false) {
            ville = false;
            ok3.setVisible(false);
            no3.setVisible(true);
        } else if (tfville.getText() == null) {
            ville = false;
            ok3.setVisible(false);
            no3.setVisible(true);
        }
    }//GEN-LAST:event_tfvilleKeyTyped

    private void tfregionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfregionKeyTyped
        // TODO add your handling code here:
           Controle c = new Controle();
        boolean result = c.controlestring(tfregion.getText());
       // System.out.println("" + result);
        if (result == true) {
            region = true;
            ok4.setVisible(true);
            no4.setVisible(false);
        } else if (result == false) {
            region = false;
            ok4.setVisible(false);
            no4.setVisible(true);
        } else if (tfregion.getText() == null) {
            region = false;
            ok4.setVisible(false);
            no4.setVisible(true);
        }
    }//GEN-LAST:event_tfregionKeyTyped

    private void tadescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tadescriptionKeyTyped
        // TODO add your handling code here:
         Controle c = new Controle();
        boolean result = c.controlestring(tadescription.getText());
       // System.out.println("" + result);
        if (result == true) {
            description = true;
            ok6.setVisible(true);
            no6.setVisible(false);
        } else if (result == false) {
            description = false;
            ok6.setVisible(false);
            no6.setVisible(true);
        } else if (tadescription.getText() == null) {
            description = false;
            ok6.setVisible(false);
            no6.setVisible(true);
        }
    }//GEN-LAST:event_tadescriptionKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientAjoutAnimalTrouve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbcouleur;
    private javax.swing.JComboBox cbetat;
    private javax.swing.JComboBox cbsexe;
    private javax.swing.JComboBox cbtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel no1;
    private javax.swing.JLabel no2;
    private javax.swing.JLabel no3;
    private javax.swing.JLabel no4;
    private javax.swing.JLabel no6;
    private javax.swing.JLabel ok1;
    private javax.swing.JLabel ok2;
    private javax.swing.JLabel ok3;
    private javax.swing.JLabel ok4;
    private javax.swing.JLabel ok6;
    private javax.swing.JTextField path;
    private javax.swing.JTextArea tadescription;
    private javax.swing.JTextField tfespece;
    private javax.swing.JTextField tfregion;
    private javax.swing.JTextField tfville;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JOptionPane jperr;
    String filename=null;
   int s=0;
   byte[] animal_image=null;
   public boolean espece = false;
   public boolean date = false;
   public boolean ville = false;
   public boolean region = false;
   public boolean description = false;
}
