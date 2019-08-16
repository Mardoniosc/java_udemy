/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.model.dao;

import com.br.clientePF.Cidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author fschi
 */
public class CidadesDAO {
    
    private Connection connection;
    
    //get e set da conexao
    public Connection getConnection()
    {
        return connection;
    }
    
    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }
    
    //método inserir
    public boolean inserir(Cidades cidades)
    {
        String sql = "INSERT INTO tb_cidades (nome_Cidades, tb_estados_id_Estados) VALUES (?, ?)";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidades.getNome_Cidades());
            stmt.setInt(2, cidades.getId_Estados());
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível inserir do banco: " + ex);
            return false;  
        }
        
    }
    
    //método para alterar
    public boolean alterar(Cidades cidades)
    {
        String sql = "UPDATE tb_cidades SET nome_Cidades = ?, tb_estados_id_Estados = ? WHERE id_Cidades = ?";
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidades.getNome_Cidades());
            stmt.setInt(2, cidades.getId_Estados());
            stmt.setInt(3, cidades.getId_Cidades());           
            
            
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível alterar do banco: " + ex);
            return false;  
        }
    }
    
    //método para remover
    public boolean remover(Cidades cidades)
    {
        String sql = "DELETE FROM tb_cidades WHERE id_Cidades = ?";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cidades.getId_Cidades());
            
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível remover do banco: " + ex);
            return false;  
        }
    }
    
    //método para listar
    public List<Cidades> lista()
    {
        String sql = "SELECT * FROM tb_cidades";
        
        List<Cidades> retorno = new ArrayList<>();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next())
            {
                Cidades cidades = new Cidades();
                cidades.setId_Cidades(resultado.getInt("id_Cidades"));
                cidades.setNome_Cidades(resultado.getString("nome_Cidades"));
                
                //vamos adicionando a liss retorno
                retorno.add(cidades);
            }        
                      
           
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível listar do banco: " + ex);
              
        }
        
        return retorno;
        
    }
    
    //método para listar cidades e estado pela sigla do estado com inner join
    public List<Cidades> listaCidadesEsatdos()
    {
        String sql = "SELECT cidades.id_Cidades, cidades.nome_Cidades, estados.sigla_Estado, estados.id_Estado"
                + " FROM tb_cidades AS cidades INNER JOIN tb_estados AS estados ON "
                + "cidades.tb_estados_id_Estados = estados.id_Estado";
        
        List<Cidades> retorno = new ArrayList<>();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next())
            {
                Cidades cidades = new Cidades();
                
                cidades.setId_Cidades(resultado.getInt("cidades.id_Cidades"));
                cidades.setNome_Cidades(resultado.getString("cidades.nome_Cidades"));
                cidades.setSigla_Estado(resultado.getString("estados.sigla_Estado"));
                cidades.setId_Estados(resultado.getInt("estados.id_Estado"));
                //vamos adicionando a liss retorno
                retorno.add(cidades);
            }        
                      
           
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível listar do banco: " + ex);
              
        }
        
        return retorno;
        
    }
    
    //método para buscar
    public Cidades buscar(Cidades cidades)
    {
        String sql = "SELECT * FROM tb_cidades WHERE id_Cidades = ?";
        
        Cidades retorno = new Cidades();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cidades.getId_Cidades());
            stmt.setString(2, cidades.getNome_Cidades());
            
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado.next())
            {
                cidades.setId_Cidades(resultado.getInt("id_Cidades"));
                cidades.setNome_Cidades(resultado.getString("nome_Cidades"));
                
                retorno = cidades;
            }
            
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível buscar do banco: " + ex);
             
        }
        
        return retorno;
    }
    
}
