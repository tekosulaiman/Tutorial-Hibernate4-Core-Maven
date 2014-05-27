package co.id.desktopui;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class MenuUtama extends javax.swing.JFrame {

    private FormFristHibernateApplication formFristHibernateApplication = new FormFristHibernateApplication();
    
    public MenuUtama() {
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Training Hibernate 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jLabel1, gridBagConstraints);

        jLabel2.setText("First Hibernate Application");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jSeparator1, gridBagConstraints);

        jButton1.setText("Run it!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jButton1, gridBagConstraints);

        jSplitPane1.setLeftComponent(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jPanel7.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel7);

        jPanel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!formFristHibernateApplication.getVisible() && !formFristHibernateApplication.isShowing()) {
            formFristHibernateApplication = new FormFristHibernateApplication();
            jDesktopPane1.add(formFristHibernateApplication);
            formFristHibernateApplication.setVisible(true);
        }else{
            try{
                formFristHibernateApplication.setSelected(true);
                formFristHibernateApplication.getDesktopPane().getDesktopManager().deiconifyFrame(formFristHibernateApplication);
                formFristHibernateApplication.getDesktopPane().getDesktopManager().maximizeFrame(formFristHibernateApplication);
                formFristHibernateApplication.getDesktopPane().getDesktopManager().minimizeFrame(formFristHibernateApplication);
                formFristHibernateApplication.moveToFront();
            }catch(PropertyVetoException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}