/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Gabriel Carvajal Aróstegui
 */
public class Conectar {

    // Atributos
    private Connection conn = null;
    
    /**
     * Conexión a la base de datos
     * @return conexión establecida o no
     */
    public Connection conectando() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Aplicacion",
                    "admin",
                    "admin"
            );
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erros de conexión "+e.getMessage());
        }
        return conn;
    }

}
