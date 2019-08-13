package com.br.projetoweb03;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ClienteBean {
    
    private String nome;
    private String sobrenome;
    private String mensagem_escrita;
    
    public void mensagem(){
        mensagem_escrita = "Meu nome é: " + nome + " \nE sobrenome é: " + sobrenome;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem_escrita() {
        return mensagem_escrita;
    }

    public void setMensagem_escrita(String mensagem_escrita) {
        this.mensagem_escrita = mensagem_escrita;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
}
