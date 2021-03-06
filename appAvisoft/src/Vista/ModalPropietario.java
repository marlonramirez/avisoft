/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * registroCliente.java
 *
 * Created on 2/11/2011, 07:04:23 PM
 */

package Vista;
import Modelo.Persona;

/**
 *
 * @author Adobe
 */
public class ModalPropietario extends Interfaz {

    private boolean guardar = true;
    private boolean establecer = true;
    private Persona persona;
    private GUIGranja g;
    /** Creates new form registroCliente */
    public ModalPropietario(GUIPrincipal parent) {
        construct(parent);
    }
    
    public ModalPropietario (GUIGranja granja) {
        this.g = granja;
        construct(granja.getPrincipal());
    }
    
    private void construct (GUIPrincipal p) {
        p.forms.add(this);
        initComponents();
        setLocationRelativeTo(null);
        btnEstablecer.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        direccionc = new javax.swing.JTextField();
        telefonoc = new javax.swing.JTextField();
        apellidoc = new javax.swing.JTextField();
        nombrec = new javax.swing.JTextField();
        cedulac = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAction = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEstablecer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Propietario de granja");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Telefono:");

        direccionc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccioncFocusLost(evt);
            }
        });

        telefonoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonocFocusLost(evt);
            }
        });
        telefonoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonocKeyTyped(evt);
            }
        });

        apellidoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidocFocusLost(evt);
            }
        });

        nombrec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombrecFocusLost(evt);
            }
        });

        cedulac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulacFocusLost(evt);
            }
        });
        cedulac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulacKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionc, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(cedulac, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(apellidoc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombrec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(telefonoc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cedulac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user.png"))); // NOI18N
        btnAction.setToolTipText("Registrar propietario");
        btnAction.setPreferredSize(new java.awt.Dimension(48, 48));
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clear.png"))); // NOI18N
        btnClear.setToolTipText("Limpiar campos");
        btnClear.setPreferredSize(new java.awt.Dimension(48, 48));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prop_user.png"))); // NOI18N
        btnEstablecer.setToolTipText("Establecer como propietario");
        btnEstablecer.setPreferredSize(new java.awt.Dimension(48, 48));
        btnEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstablecer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Granjas"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dirección", "Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        // TODO add your handling code here:
        String cedula = cedulac.getText().trim();
        String nombre = nombrec.getText().trim();
        String apellido = apellidoc.getText().trim();
        String direccion = direccionc.getText().trim();
        String telefono = telefonoc.getText().trim();
        boolean error = false;
        
        if(cedula.isEmpty()){
            showError(cedulac, "No se ha digitado la cedula del propietario");
            error=true;
        }
        if(nombre.isEmpty()){
            showError(nombrec, "No se han digitado los nombres del propietario");
            error=true;
        }
        if(direccion.isEmpty()){
            showError(direccionc, "No se ha digitado la dirección del propietario");
            error=true;
        }
        if(apellido.isEmpty()){
            showError(apellidoc, "No se han digitado los apellidos del propietario");
            error=true;
        }
        if(telefono.isEmpty()){
            showError(telefonoc, "No se ha digitado el teléfono del propietario");
            error=true;
        } else if (!isPhone(telefono)) {
            showError(telefonoc, "No se ha digitado un número telefonico valido");
            error = true;
        }
        
        if(error) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor revise los campos", "Error en el formulario", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (guardar) {
            this.crearUsuario(cedula, nombre, apellido, direccion, telefono);
        } else {
            this.actualizarUsuario(nombre, apellido, direccion, telefono);
        }
        if (this.g != null) {
            this.g.cargarPropietarios();
        }
    }//GEN-LAST:event_btnActionActionPerformed

    private void cedulacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulacFocusLost
        // TODO add your handling code here:
        String cedula = cedulac.getText();
        if (!cedula.isEmpty()) {
            persona = Persona.existe(cedula);
            if (persona != null) {
                normalizeInput(apellidoc);
                normalizeInput(nombrec);
                normalizeInput(direccionc);
                normalizeInput(telefonoc);
                this.apellidoc.setText(persona.getApellidos());
                this.nombrec.setText(persona.getNombres());
                this.direccionc.setText(persona.getDireccion());
                this.telefonoc.setText(persona.getTelefono());
                btnAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_user.png")));
                btnAction.setToolTipText("Modificar datos");
                cedulac.setEditable(false);
                if (persona.isPropietario()) {
                    btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nprop_user.png")));
                    establecer = !establecer;
                }
                btnEstablecer.setVisible(true);
                guardar = false;
            }
        }
        normalizeInput(cedulac);
    }//GEN-LAST:event_cedulacFocusLost

    private void nombrecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombrecFocusLost
        // TODO add your handling code here:
        if(!nombrec.getText().isEmpty()){
            normalizeInput(nombrec);
        }
    }//GEN-LAST:event_nombrecFocusLost

    private void apellidocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidocFocusLost
        // TODO add your handling code here:
        if(!apellidoc.getText().isEmpty()){
            normalizeInput(apellidoc);
        }
    }//GEN-LAST:event_apellidocFocusLost

    private void direccioncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccioncFocusLost
        // TODO add your handling code here:
        if(!direccionc.getText().isEmpty()){
            normalizeInput(direccionc);
        }
    }//GEN-LAST:event_direccioncFocusLost

    private void telefonocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonocFocusLost
        // TODO add your handling code here:
        if(!telefonoc.getText().isEmpty()){
            normalizeInput(telefonoc);
        }
    }//GEN-LAST:event_telefonocFocusLost

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerActionPerformed
        // TODO add your handling code here:
        persona.setPropietario(establecer);
        if (establecer) {
            btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nprop_user.png")));
        } else {
            btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prop_user.png")));
        }
        if (this.g != null) {
            this.g.cargarPropietarios();
        }
        establecer = !establecer;
    }//GEN-LAST:event_btnEstablecerActionPerformed

    private void telefonocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonocKeyTyped
        // TODO add your handling code here:
        soloNum(evt);
    }//GEN-LAST:event_telefonocKeyTyped

    private void cedulacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulacKeyTyped
        // TODO add your handling code here:
        soloNum(evt);
    }//GEN-LAST:event_cedulacKeyTyped
    
    private void limpiar () {
        cedulac.setText(null);
        nombrec.setText(null);
        apellidoc.setText(null);
        direccionc.setText(null);
        telefonoc.setText(null);
        cedulac.setEditable(true);
        btnAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user.png")));
        btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prop_user.png")));
        guardar = true;
        establecer = true;
        btnEstablecer.setVisible(false);
        cedulac.requestFocus();
    }
    
    private void actualizarUsuario (String nombre, String apellido, String direccion, String telefono) {
        boolean ac = false;
        
        if (!persona.getDireccion().equals(direccion)) {
            persona.setDireccion(direccion);
            ac = true;
        }
        if (!persona.getNombres().equals(nombre)) {
            persona.setNombres(nombre);
            ac = true;
        }
        if (!persona.getApellidos().equals(apellido)) {
            persona.setDireccion(direccion);
            ac = true;
        }
        if (!persona.getTelefono().equals(telefono)) {
            persona.setTelefono(telefono);
            ac = true;
        }
        
        if (ac) {
            javax.swing.JOptionPane.showMessageDialog(this, "Sus datos han sido actualizados correctamente");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha modificado ningún dato", "Datos no modificados", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    private void crearUsuario (String cedula, String nombre, String apellido, String direccion, String telefono) {
        Persona.create(cedula, nombre, apellido, direccion, telefono);
        javax.swing.JOptionPane.showMessageDialog(this, "Se ha creado el propietario exitosamente");
        btnEstablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nprop_user.png")));
        btnEstablecer.setVisible(true);
        establecer = false;
    }
    
    @Override
    public java.awt.Image getIconImage() {
        java.awt.Image retValue = java.awt.Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/prop_user.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoc;
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEstablecer;
    private javax.swing.JTextField cedulac;
    private javax.swing.JTextField direccionc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombrec;
    private javax.swing.JTextField telefonoc;
    // End of variables declaration//GEN-END:variables

}
