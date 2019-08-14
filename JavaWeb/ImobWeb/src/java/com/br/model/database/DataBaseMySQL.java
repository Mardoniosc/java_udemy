/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author p772920
 */
public class DataBaseMySQL implements DataBase{
   
    private Connection connection;

    @Override
    public Connection conectar() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.getConnection("jdbc:mysql://DF7562NT713:3306/bd_imob", "sd", "sd");
                return this.connection;
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar "
                        + "ao banco MySQL\nErro: " + ex);
                return null;
            }
    }

    @Override
    public void desconectar(Connection connection) {

        try {
                connection.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel desconectar "
                        + "do banco MySQL\nErro: " + ex);
                
            }
    }
}
    

