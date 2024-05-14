
package LOGIN_MAVEN;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class LOGIN3 extends javax.swing.JFrame {

    
      private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=PPHS_puerto_plataa";
    private static final String USUARIO = "usuario22";
    private static final String CONTRASEÑA = "12345";
   
    public LOGIN3() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mover = new javax.swing.JPanel();
        panelp = new javax.swing.JPanel();
        X1 = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        inicio1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ususu = new javax.swing.JTextField();
        ususu1 = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        boton = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        contraseña1 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        mover.setBackground(new java.awt.Color(255, 255, 255));
        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });

        panelp.setBackground(new java.awt.Color(255, 255, 255));
        panelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelpMouseExited(evt);
            }
        });

        X1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        X1.setText("X");
        X1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                X1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelpLayout = new javax.swing.GroupLayout(panelp);
        panelp.setLayout(panelpLayout);
        panelpLayout.setHorizontalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelpLayout.setVerticalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moverLayout = new javax.swing.GroupLayout(mover);
        mover.setLayout(moverLayout);
        moverLayout.setHorizontalGroup(
            moverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moverLayout.createSequentialGroup()
                .addComponent(panelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 666, Short.MAX_VALUE))
        );
        moverLayout.setVerticalGroup(
            moverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 0, 0));
        inicio.setText("INICIAR SESION");

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicio1.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        inicio1.setForeground(new java.awt.Color(255, 255, 255));
        inicio1.setText("INICIAR SESION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondologin.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(255, 255, 255));
        usuario1.setText("USUARIO");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Solo ingresa si ya tienes una cuenta creada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 290, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 30));

        ususu.setBackground(new java.awt.Color(255, 255, 255));
        ususu.setText("Ingresa el usuario");
        ususu.setBorder(null);
        ususu.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(ususu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));

        ususu1.setBackground(new java.awt.Color(255, 255, 255));
        ususu1.setText("Ingrese el correo");
        ususu1.setBorder(null);
        ususu1.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(ususu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setText("******");
        pass.setBorder(null);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, -1));

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("REGISTRO");
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 100, 30));

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("INGRESAR");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 100, 30));

        contraseña1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        contraseña1.setText("CORREO ELECTRONICO");
        jPanel1.add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("CONTRASEÑA");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 210, 210));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puerto Plata", "Zamana", "Barahona", "San Cristobal", "Punta Cana", " ", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inicio1)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(inicio1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void X1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_X1MouseClicked

    private void X1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseEntered

    }//GEN-LAST:event_X1MouseEntered

    private void panelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpMouseEntered
        panelp.setBackground(Color.RED);
        X1.setForeground(Color.white);
    }//GEN-LAST:event_panelpMouseEntered

    private void panelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpMouseExited
        panelp.setBackground(Color.white);
        X1.setForeground(Color.black);
    }//GEN-LAST:event_panelpMouseExited

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged

    }//GEN-LAST:event_moverMouseDragged

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        String usuario = ususu.getText();
    String correo = ususu1.getText(); // Obtenemos el correo electrónico del JTextField ususu1
    String contraseña = new String(pass.getPassword());

    try {
        Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        String query = "SELECT * FROM Clientes WHERE nombre = ? AND gmail = ? AND contraseña = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, usuario);
        pst.setString(2, correo);
        pst.setString(3, contraseña);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String provinciaSeleccionada = (String) jComboBox1.getSelectedItem();
            switch (provinciaSeleccionada) {
                  case "Puerto Plata":
                            PRINCIPAL0 principalPanel0 = new PRINCIPAL0();
                            principalPanel0.setVisible(true);
                            dispose(); // Cierra la ventana actual
                            break;
                        case "Zamana":
                            PRINCIPAL1 principalPanel1 = new PRINCIPAL1();
                            principalPanel1.setVisible(true);
                            dispose(); // Cierra la ventana actual
                            break;
                        case "Punta Cana":
                            PRINCIPAL2 principalPanel2 = new PRINCIPAL2();
                            principalPanel2.setVisible(true);
                            dispose(); // Cierra la ventana actual
                            break;
                        case "Barahona":
                            PRINCIPAL3 principalPanel3 = new PRINCIPAL3();
                            principalPanel3.setVisible(true);
                            dispose(); // Cierra la ventana actual
                            break;
                        case "San Cristobal":
                            PRINCIPAL4 principalPanel4 = new PRINCIPAL4();
                            principalPanel4.setVisible(true);
                            dispose(); // Cierra la ventana actual
                            break;
                        default:
            }
            this.dispose(); // Cierra el JFrame actual
        } else {
            JOptionPane.showMessageDialog(this, "Usuario, correo electrónico o contraseña incorrectos");
        }

        rs.close();
        pst.close();
        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + ex.getMessage());
    }
    }//GEN-LAST:event_boton1ActionPerformed

  
    public static void main(String args[]) {
 
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X1;
    private javax.swing.JButton boton;
    private javax.swing.JButton boton1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseña1;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel inicio1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mover;
    private javax.swing.JPanel panelp;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JTextField ususu;
    private javax.swing.JTextField ususu1;
    // End of variables declaration//GEN-END:variables
}
