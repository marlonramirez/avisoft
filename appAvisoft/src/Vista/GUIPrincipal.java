/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIPrincipal.java
 *
 * Created on 15/12/2011, 05:03:58 PM
 */
package Vista;

/**
 *
 * @author Kraken
 */
public class GUIPrincipal extends Interfaz {

    /** Creates new form GUIPrincipal */
    public GUIPrincipal() {
        if(log != null) {
            initComponents();
            setLocationRelativeTo(null);
            forms.add(this);
            menuLog.setText("Bienvenido "+log.getUser());
            addWindowListener(new ManejadorEventos());
        } else {
            salir();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuNuevaGranja = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenuItem();
        menuLog = new javax.swing.JMenu();
        menuConf = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AVISOFT");
        setIconImage(getIconImage());

        jMenu4.setText("Granja");

        menuNuevaGranja.setText("Nueva granja");
        menuNuevaGranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaGranjaActionPerformed(evt);
            }
        });
        jMenu4.add(menuNuevaGranja);

        jMenuBar3.add(jMenu4);

        jMenu2.setText("Inventario");

        jMenuItem2.setText("Proveedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Insumos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Orden de compra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Consultas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar3.add(jMenu2);

        jMenu1.setText("Ayuda");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bug.png"))); // NOI18N
        jMenuItem1.setText("Reportar errores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuAcerca.setText("Acerca de");
        menuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaActionPerformed(evt);
            }
        });
        jMenu1.add(menuAcerca);

        jMenuBar3.add(jMenu1);

        menuLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        menuConf.setText("Configurar cuenta");
        menuConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfActionPerformed(evt);
            }
        });
        menuLog.add(menuConf);

        menuSalir.setText("Cerrar sesión");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuLog.add(menuSalir);

        jMenuBar3.add(javax.swing.Box.createHorizontalGlue());
        jMenuBar3.add(menuLog);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevaGranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaGranjaActionPerformed
        // TODO add your handling code here:
        new GUIGranja(this).setVisible(true);
    }//GEN-LAST:event_menuNuevaGranjaActionPerformed

    private void menuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaActionPerformed
        // TODO add your handling code here:
        new ModalAcerca(this, true).setVisible(true);
    }//GEN-LAST:event_menuAcercaActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfActionPerformed
        // TODO add your handling code here:
        new ModalConf(this, true).setVisible(true);
    }//GEN-LAST:event_menuConfActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ModalBugs(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new GUIProveedor(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new GUIInsumo(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new GUICompra(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new GUIConsInv(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    class ManejadorEventos extends java.awt.event.WindowAdapter {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            salir();
        } 
    }
    
    @Override
    public java.awt.Image getIconImage() {
        java.awt.Image retValue = java.awt.Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/avisoft.png"));
        return retValue;
    }
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menuAcerca;
    private javax.swing.JMenuItem menuConf;
    private javax.swing.JMenu menuLog;
    private javax.swing.JMenuItem menuNuevaGranja;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
