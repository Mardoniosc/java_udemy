
package com.br.clientePF;

import com.br.model.dao.EstadosDAO;
import com.br.model.database.Database;
import com.br.model.database.DatabaseFactory;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EstadosBean {
    
    //criado do objeto 
    private Estados estados = new Estados();
    
    
    //Atributos para manipulação de Banco de Dados
    private final Database database = DatabaseFactory.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final EstadosDAO estadosDAO = new EstadosDAO();
    
    //lista para listar os atributos
    private List<Estados> listEstados = new ArrayList<>();
    
   
    
    
    //método para adiciona o bjeto clientePf na list
    public void inseir()
    {
        
        //conexão com o banco de dados
        estadosDAO.setConnection(connection);
        
        //inserir os dados
        estadosDAO.inserir(estados);
        
//        //adicionou o bjeto a list
//        listEstados.add(estados);       
        
//        //zera o objeto para não ficar carregado na memória
//        estados = new Estados();
        
    }
    
    public void listarEstados()
    {
        //conexão com o banco de dados
        estadosDAO.setConnection(connection);
        
        //jogar na list do banco de dodos através da classe EsatdosDAO 
        listEstados = estadosDAO.lista();
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public List<Estados> getListEstados() {
        return listEstados;
    }

    public void setListEstados(List<Estados> listEstados) {
        this.listEstados = listEstados;
    }
    
    
    
}
