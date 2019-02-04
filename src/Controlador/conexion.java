/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.*; 

public class conexion {
    public conexion(){
    }
    
    public static void main(String[] args) throws ClassNotFoundException{
        String driver = "postgresql-8.3-603.jdbc4.jar";
        String connectString = "jdbc:postgresql://localhost:5432/BaseXYZ/";
        String user = "postgres";
        String password = "zasertyq";
        
            try{
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(connectString, user, password);
                System.out.println("Conexion con la base de datos exitosa");
            }catch(SQLException e){
                System.out.println("Se ha producido un error en la conexion con la base de datos");
            }
    }
}
