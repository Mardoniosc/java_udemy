/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.br.model.DTO.Cidades;

/**
 *
 * @author P772920
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
    public boolean inserir(Cidades cidade)
    {
        String sql = "INSERT INTO tb_cidades () VALUES (?)";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidade.getNome_Cidades());
            
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível conectar do banco: " + ex);
            return false;  
        }
        
    }
    
    //método para alterar
    public boolean alterar(Cidades cidades)
    {
        String sql = "UPDATE tb_cidades SET nome_Cidades = ? WHERE id_Cidades = ?";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidades.getNome_Cidades());
            stmt.setInt(2, cidades.getId_Cidades());
            
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
    
    //método para buscar
    public Cidades buscar(Cidades cidades)
    {
        String sql = "SELECT * FROM tb_cidades WHERE id = ?";
        
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
    
    //Listar cidade e estados pela sigla com inerJoin
    public List<Cidades> listarCidadesEstados()
    {
        String sql = "select tb_cidades.id_Cidades, tb_cidades.nome_Cidades, "
                + "tb_estados.sigla_Estado from tb_cidades inner join " +
                "bd_imob.tb_estados on tb_cidades.id_Cidades = "
                + "tb_estados.id_Estado";
        
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
                cidades.setSigla_Estado(resultado.getString("sigla_Estado"));
                
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
    
}
