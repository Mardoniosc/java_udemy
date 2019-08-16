
package com.br.clientePF;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ClienteBean {
    
    //criado do objeto clientePF de ClientePessoaFisica
    private ClientePessoaFisica clientePF = new ClientePessoaFisica();
    
    //lista para listar os atributos
    private List<ClientePessoaFisica> listClientePF = new ArrayList<>();
    
    //método para adiciona o bjeto clientePf na list
    public void adicionarObjetoAList()
    {
        
        //adicionou o bjeto a list
        listClientePF.add(clientePF);
        //zera o objeto para não ficar carregado na memória
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
