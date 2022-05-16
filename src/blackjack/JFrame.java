package blackjack;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * @author Kiss Niki
 */
public class JFrame extends javax.swing.JFrame {

    private boolean valtozas;

    public JFrame() {
        initComponents();
        valtozas = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnMentes = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnKilepes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuMentes = new javax.swing.JMenuItem();
        mnuKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("lapok felsorol");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valtozas(evt);
            }
        });

        btnMentes.setText("Mentés");
        btnMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMentesActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("lapok összértéke");

        btnKilepes.setText("Kilépés");
        btnKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKilepesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKilepes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMentes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(btnMentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKilepes)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnKilepes, btnMentes});

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/kepek/Blackjack-singlehand.jpg"))); // NOI18N

        jMenu1.setText("File");

        mnuMentes.setText("Mentés");
        mnuMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMentesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMentes);

        mnuKilepes.setText("Kilépés");
        mnuKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKilepes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stratégia");

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Kockáztat");
        jRadioButtonMenuItem1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valtozas(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Nem kockáztat");
        jMenu2.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuKilepesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void btnMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentesActionPerformed
        mentes();
    }//GEN-LAST:event_btnMentesActionPerformed

    private void btnKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_btnKilepesActionPerformed

    private void mnuMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMentesActionPerformed
        mentes();
    }//GEN-LAST:event_mnuMentesActionPerformed

    private void valtozas(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valtozas
        valtozas = true;
    }//GEN-LAST:event_valtozas

    private int felugro(String uzenet) {
        Icon icon = new ImageIcon(this.getClass().getResource("kepek/ikon.jpg"));
        return JOptionPane.showConfirmDialog(rootPane, uzenet, "Kérdés", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public void kilepes() throws HeadlessException {
        if (valtozas) {
            if (felugro("Biztos kilép?") == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }
    
    public void mentes() throws HeadlessException {
        JFileChooser jfc = new JFileChooser(new File("."));
        jfc.setDialogTitle("Megnyitás");

        FileNameExtensionFilter filterKepek = new FileNameExtensionFilter("*.jpg, *.gif", "jpg", "gif");
        FileNameExtensionFilter filterTxt = new FileNameExtensionFilter("*.txt", "txt");

        jfc.addChoosableFileFilter(filterKepek);
        jfc.addChoosableFileFilter(filterTxt);

        jfc.setFileFilter(filterTxt);

        int gomb = jfc.showOpenDialog(jPanel1);
        if (gomb == JFileChooser.APPROVE_OPTION) {
            String fajlNev = "Fájl neve: " + jfc.getSelectedFile().getName();
            String eleres = "Elérése: " + jfc.getSelectedFile().getPath();
            String uzenet = fajlNev + "\n" + eleres;
            felugro(uzenet);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKilepes;
    private javax.swing.JButton btnMentes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JMenuItem mnuKilepes;
    private javax.swing.JMenuItem mnuMentes;
    // End of variables declaration//GEN-END:variables
}
