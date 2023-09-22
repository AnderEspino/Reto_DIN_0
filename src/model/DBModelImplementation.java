/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Ander Espino, Adrian Moreno
 */
public class DBModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ResourceBundle configFichero;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String passwordBD;

    private final String getGreeting = "select * from hello";

    // Metodo para conectarnos a la base de datos
    public DBModelImplementation() {
        this.configFichero = ResourceBundle.getBundle("modelo.propertiesMessage");
        this.driverBD = this.configFichero.getString("Driver");
        this.urlBD = this.configFichero.getString("Conn");
        this.userBD = this.configFichero.getString("DBUser");
        this.passwordBD = this.configFichero.getString("DBPass");
    }

    /**
     * Este metodo sirve para abrir la conexion con la base de datos
     *
     * @author Ander, Adrian
     *
     */
    private void openConnection() {
        try {
            // Class.forName(this.driverBD);
            con = (Connection) DriverManager.getConnection(this.urlBD, this.userBD, this.passwordBD);
        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se ha abierto la base de datos");
            e.printStackTrace();
        }
    }

    /**
     * Este metodo sirve para cerrar la conexion con la base de datos
     *
     * @author Ander, Adrian
     *
     */
    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

    /**
     * Metodo el cual sirve para recibir el saludo de la base de datos
     */
    public String getGreeting() {
        ResultSet rs = null;
        String greeting = null;
        
        this.openConnection();
        try {
            stmt = con.prepareStatement(getGreeting);
            rs=stmt.executeQuery();
            if(rs.next()){
                greeting=rs.getString(1);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeConnection();
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return greeting;
    }
}
