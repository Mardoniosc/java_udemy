
package com.br.clientePF;

/**
 *
 * @author fschi
 */
public class Estados {
   
    //atributos
    private int id_Estado;
    private String nome_Estado;
    private String sigla_Estado;
    
    //get e set
    public int getId_Estado() {
        return id_Estado;
    }

    public void setId_Estado(int id_Estado) {
        this.id_Estado = id_Estado;
    }

    public String getNome_Estado() {
        return nome_Estado;
    }

    public void setNome_Estado(String nome_Estado) {
        this.nome_Estado = nome_Estado;
    }

    public String getSigla_Estado() {
        return sigla_Estado;
    }

    public void setSigla_Estado(String sigla_Estado) {
        this.sigla_Estado = sigla_Estado;
    }

    @Override
    public String toString() {
        return getSigla_Estado();
    }
    
    
    
    
}
