/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.clientepf;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author p772920
 */

@ManagedBean
@SessionScoped
public class ClienteBean {
    
    //atributo criado do objeto ClientePessoaFisica
    private ClientePessoaFisica clientePF = new ClientePessoaFisica();
    
    //Lista para listar os atributos
    private List<ClientePessoaFisica> listClientePF = new ArrayList<>();
    
    //Metodo para adicionar o clientePF na listClientePF
    public void adicionarObjetoAlist(){
        //adicionou o objeto a list
        listClientePF.add(clientePF);
        //zera o objeto
        clientePF = new ClientePessoaFisica();
        
    }

    public ClientePessoaFisica getClientePF() {
        return clientePF;
    }

    public void setClientePF(ClientePessoaFisica clientePF) {
        this.clientePF = clientePF;
    }

    public List<ClientePessoaFisica> getListClientePF() {
        return listClientePF;
    }

    public void setListClientePF(List<ClientePessoaFisica> listClientePF) {
        this.listClientePF = listClientePF;
    }
    
    
}
