package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String baseDatos = "test_java";
    private String usuario = "root";
    private String password = "";
    private String host = "jdbc:mysql://localhost:3306/" + baseDatos;
    Connection  con = null;
    public Conexion(){
            try{
                //Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(host, usuario, password);
                
            /*}catch(ClassNotFoundException e){
                System.out.println("Ocurrió una excepción" + e.getMessage());
            */}catch(SQLException e){
                System.out.println("Ocurrió una excepción" + e.getMessage());
            }
    }
    
    public Connection getConnection(){
        return con;
    }
}
