/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CadastroController;

/**
 *
 * @author luisg
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public static CadastroController cadastroController;
    public static Integer contador;
    
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        cadastroController = new CadastroController();
        contador = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tbMenu = new javax.swing.JToolBar();
        mbCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        mbPesquisa = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        mbSobre = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        mbSair = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GPL");
        setBackground(new java.awt.Color(0, 153, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        tbMenu.setFloatable(false);
        tbMenu.setRollover(true);

        mbCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbCadastro.setForeground(new java.awt.Color(255, 255, 255));
        mbCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/register_32.png"))); // NOI18N
        mbCadastro.setText("Cadastro");
        mbCadastro.setFocusable(false);
        mbCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mbCadastro.setMaximumSize(new java.awt.Dimension(125, 45));
        mbCadastro.setMinimumSize(new java.awt.Dimension(125, 45));
        mbCadastro.setPreferredSize(new java.awt.Dimension(125, 45));
        mbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCadastroActionPerformed(evt);
            }
        });
        tbMenu.add(mbCadastro);
        tbMenu.add(jSeparator1);

        mbPesquisa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        mbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_32.png"))); // NOI18N
        mbPesquisa.setText("Pesquisa");
        mbPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mbPesquisa.setMaximumSize(new java.awt.Dimension(125, 45));
        mbPesquisa.setMinimumSize(new java.awt.Dimension(125, 45));
        mbPesquisa.setPreferredSize(new java.awt.Dimension(125, 45));
        mbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbPesquisaActionPerformed(evt);
            }
        });
        tbMenu.add(mbPesquisa);
        tbMenu.add(jSeparator2);

        mbSobre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbSobre.setForeground(new java.awt.Color(255, 255, 255));
        mbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about_32.png"))); // NOI18N
        mbSobre.setText("Sobre");
        mbSobre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mbSobre.setMaximumSize(new java.awt.Dimension(125, 45));
        mbSobre.setMinimumSize(new java.awt.Dimension(125, 45));
        mbSobre.setPreferredSize(new java.awt.Dimension(125, 45));
        tbMenu.add(mbSobre);
        tbMenu.add(jSeparator3);

        mbSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbSair.setForeground(new java.awt.Color(255, 255, 255));
        mbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout_32.png"))); // NOI18N
        mbSair.setText("Sair");
        mbSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mbSair.setMaximumSize(new java.awt.Dimension(125, 45));
        mbSair.setMinimumSize(new java.awt.Dimension(125, 45));
        mbSair.setPreferredSize(new java.awt.Dimension(125, 45));
        mbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSairActionPerformed(evt);
            }
        });
        tbMenu.add(mbSair);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(773, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCadastroActionPerformed
        new TelaCadastro(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mbCadastroActionPerformed

    private void mbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbPesquisaActionPerformed
        new TelaPesquisa(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mbPesquisaActionPerformed

    private void mbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSairActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_mbSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mbCadastro;
    private javax.swing.JButton mbPesquisa;
    private javax.swing.JButton mbSair;
    private javax.swing.JButton mbSobre;
    private javax.swing.JToolBar tbMenu;
    // End of variables declaration//GEN-END:variables
}
