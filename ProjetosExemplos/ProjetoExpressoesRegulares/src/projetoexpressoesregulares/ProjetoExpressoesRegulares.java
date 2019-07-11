
package projetoexpressoesregulares;

import java.util.Scanner;

public class ProjetoExpressoesRegulares {

    
    public static void main(String[] args) {
        
        //exemplo para você usar o regex ou expressões regulares
        //  \d -> representa qualquer digito
        //  \D -> representa tudo, menos digito
        //  \w -> representa qualquer caractere de palavra
        //  \W -> representa tudo que não seja caractere na palavra
        //  \s->representa qualquer espaço em branco (" ", tab)
        //  \S-> representa tudo que não seja espaço em branco
        //  [a-z] -> representa qualquer letra minúscula do alfabeto
        //  [A-Z] -> representa qualquer letra maiúscula do alfabeto
        //  [a-zA-Z] -> representa qualque letra do alfabeto, ou seja, minúsculas e maiúsculas
        //  | -> representa o ou. "a|b" é valor 'a' ou 'b'
        //  . -> substitui qualquer caractere
        //  * -> o caractere anterior aparece nenhuma ou mais vezes
        //  + -> o caractere anterior aparece uma ou mais vezes
        //  {a} -> o caractere anterior se repete 'a' vezes
        //  {a,} ->o caracter anterior se repete pelo menos'a' vezes
        //  {a,b} -> o caractere anterior se repete entre 'a' e 'b' vezes
        
        //Exemplo de expressão regular
        //CEP: -> ddddd-ddd -> d é um digito e pode ser de 0 - 9
        // Expressão Regular de CEP -> "\\d\\d\\d\\d\\d-\\d\\d\\d" ou
        // "\\d{5}-\\d{3}"
        
        Scanner entradaCEP = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        String cep = entradaCEP.next();
        if(cep.matches("\\d{2}.\\d{3}-\\d{3}"))
            System.out.println("Cep válido");
        else
            System.out.println("Cep inválido");
        
        //Exemplo de expressão regular para validar cnpj
        // dd.ddd.ddd/dddd.dd
        // "\\d{2}.\\d{3}.\\d{3}/\\d{4}.\\d{2}"
        
      
    }
    
}
