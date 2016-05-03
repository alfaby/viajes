/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Toshiba
 */
public class Conexion {
    Connection connect =null;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
    //connect = DriverManager.getConnection("jdbc:mysql://localhost:802/deber","root","");//2 parametros el jdbc y el msql      
            connect = DriverManager.getConnection("jdbc:mysql://localhost/deber","root","");//2 parametros el jdbc y el msql      
    JOptionPane.showMessageDialog(null, "SE CONECTO A LA BASE DE DATOS");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
       return connect;
    }
    
}
