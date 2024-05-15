
package LOGIN_MAVEN;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class REGISTRO extends javax.swing.JFrame {

 int xMouse, yMouse;
    
    public REGISTRO() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        ususu = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        boton = new javax.swing.JButton();
        contraseña1 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        contraseña2 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        contraseña3 = new javax.swing.JLabel();
        ususu2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        contraseña5 = new javax.swing.JLabel();
        ususu3 = new javax.swing.JTextField();
        codigo1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio1.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        inicio1.setForeground(new java.awt.Color(255, 255, 255));
        inicio1.setText("REGISTRARSE");
        getContentPane().add(inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("USUARIO");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        ususu.setBackground(new java.awt.Color(255, 255, 255));
        ususu.setText("Ingrese el correo");
        ususu.setBorder(null);
        ususu.setCaretColor(new java.awt.Color(204, 204, 204));
        ususu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ususuMousePressed(evt);
            }
        });
        jPanel1.add(ususu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 20));

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("CODIGO POSTAL");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setText("******");
        pass.setBorder(null);
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 20));

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("LOGIN");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        contraseña1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        contraseña1.setText("CORREO ELECTRONICO");
        jPanel1.add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("INGRESAR");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ya tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        contraseña2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contraseña2.setForeground(new java.awt.Color(255, 255, 255));
        contraseña2.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pass2.setBackground(new java.awt.Color(255, 255, 255));
        pass2.setText("******");
        pass2.setBorder(null);
        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pass2MousePressed(evt);
            }
        });
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel1.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 20));

        contraseña3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña3.setForeground(new java.awt.Color(255, 255, 255));
        contraseña3.setText("CONTRASEÑA");
        jPanel1.add(contraseña3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        ususu2.setBackground(new java.awt.Color(255, 255, 255));
        ususu2.setText("dd/mm/yyyy");
        ususu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ususu2.setCaretColor(new java.awt.Color(204, 204, 204));
        ususu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ususu2MousePressed(evt);
            }
        });
        ususu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ususu2ActionPerformed(evt);
            }
        });
        jPanel1.add(ususu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 210, 210));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puerto Plata", "Zamana", "Barahona", "San Cristobal", "Punta Cana", " ", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 110, -1));

        contraseña5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña5.setForeground(new java.awt.Color(255, 255, 255));
        contraseña5.setText("CONFIRMA CONTRASEÑA");
        jPanel1.add(contraseña5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        ususu3.setBackground(new java.awt.Color(255, 255, 255));
        ususu3.setText("Ingresa su usuario");
        ususu3.setBorder(null);
        ususu3.setCaretColor(new java.awt.Color(204, 204, 204));
        ususu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ususu3MousePressed(evt);
            }
        });
        jPanel1.add(ususu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 20));

        codigo1.setBackground(new java.awt.Color(255, 255, 255));
        codigo1.setText("Ingrese aqui");
        jPanel1.add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondologin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ususuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ususuMousePressed
        if (ususu.getText().equals("Ingrese el usuario")){
            ususu.setText("");
            ususu.setForeground(Color.black);
        }

        if (String.valueOf(pass.getPassword()).isEmpty()) {
            pass.setText("***********");
            ususu.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ususuMousePressed

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        if (String.valueOf(pass.getPassword()).equals("******")) {
            pass.setText("");
            ususu.setForeground(Color.black);
        }

        if (ususu.getText().isEmpty()) {
            ususu.setText("Ingrese su nombre de usuario");
            ususu.setForeground(Color.gray);
        }

    }//GEN-LAST:event_passMousePressed

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
    }//GEN-LAST:event_botonMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
    }//GEN-LAST:event_passActionPerformed

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
            
      
       

    
    }//GEN-LAST:event_boton1MouseClicked

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        LOGIN3 newframe = new LOGIN3();
        
        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botonActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
 
   String url = "jdbc:sqlserver://localhost:1433;databaseName=PPHS_puerto_plataa";
    String usuarioSQL = "usuario22";
    String contraseñaSQL = "12345";

    String password = pass2.getText();
    String confirmPassword = pass.getText();
    
    if (!password.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try (Connection connection = DriverManager.getConnection(url, usuarioSQL, contraseñaSQL)) {
        String correo = ususu.getText();
        String fechaNacimientoString = ususu2.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fechaNacimiento = null;
        
        try {
            fechaNacimiento = LocalDate.parse(fechaNacimientoString, formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha de nacimiento incorrecto. Utilice el formato d/M/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);

        if (edad.getYears() < 18) {
            JOptionPane.showMessageDialog(null, "Debe ser mayor de 18 años para registrarse", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String fechaNacimientoSql = fechaNacimiento.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String provincia = (String) jComboBox1.getSelectedItem();
        String codigoPostal = codigo1.getText();
        
        // Validar el código postal si es necesario
        
        String query = "INSERT INTO Clientes (nombre, gmail, contraseña, fecha_nacimiento, Provincia, codigo_postal) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, ususu3.getText());
            statement.setString(2, correo);
            statement.setString(3, password);
            statement.setString(4, fechaNacimientoSql);
            statement.setString(5, provincia);
            statement.setString(6, codigoPostal);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                redirectToMainPanel(provincia);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        System.err.println("Error al conectar a la base de datos o al ejecutar la consulta: " + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos o al ejecutar la consulta", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void redirectToMainPanel(String provincia) {
    switch(provincia) {
        case "Puerto Plata":
            new PRINCIPAL_USUARIO1().setVisible(true);
            break;
        case "Zamana":
            new PRINCIPAL_USUARIO2().setVisible(true);
            break;
        case "Punta Cana":
            new PRINCIPAL_USUARIO3().setVisible(true);
            break;
        case "Barahona":
            new PRINCIPAL_USUARIO4().setVisible(true);
            break;
        case "San Cristobal":
            new PRINCIPAL_USUARIO4().setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Provincia no válida", "Error", JOptionPane.ERROR_MESSAGE);
            break;
    }
    }//GEN-LAST:event_boton1ActionPerformed

    private void pass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2MousePressed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void ususu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ususu2MousePressed

    }//GEN-LAST:event_ususu2MousePressed

    private void ususu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ususu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ususu2ActionPerformed

    private void ususu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ususu3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ususu3MousePressed

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
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton boton1;
    private javax.swing.JTextField codigo1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseña1;
    private javax.swing.JLabel contraseña2;
    private javax.swing.JLabel contraseña3;
    private javax.swing.JLabel contraseña5;
    private javax.swing.JLabel inicio1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField ususu;
    private javax.swing.JTextField ususu2;
    private javax.swing.JTextField ususu3;
    // End of variables declaration//GEN-END:variables
}
