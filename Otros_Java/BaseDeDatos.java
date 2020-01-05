/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class BaseDeDatos {
    //Cómo conectar a una base de datos
    
    private static Connection conn;
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USER="root";
    private static final String PASSWORD="123"; //Definir cuando instalamos MySQL
    private static final String URL="jdbc:mysql://localhost:3306/mibasededatos"; //Igual que la definida anteriormente
    
    public BaseDeDatos(){
        conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            if(conn != null){
                System.out.println("Conexión OK");
            }
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error al conectar a base de datos. "+ex);
        }
    }
    
    //Este método nos retorna la conexión
    public Connection getConnection(){
        return conn;
    }
    
    //Con este método nos desconectamos de la base de datos
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexión terminada.");
        }
    }
    
    
    
    
    
    //Método main
    public static void main(String[] args) {
        
        
        
    }
    
}
