/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author p772920
 */
public class DataBasePostgreSQL implements DataBase{

    private Connection connection;

    @Override
    public Connection conectar() {
        try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection("jdbc:postgresql://DF7562NT713:3306/sd_chamados", "sd", "sd");
                return this.connection;
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar "
                        + "ao banco PostreSQL\nErro: " + ex);
                return null;
            }
    }

    @Override
    public void desconectar(Connection connection) {

        try {
                connection.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel desconectar "
                        + "do banco PostreSQL\nErro: " + ex);
                
            }
    }
    
}
