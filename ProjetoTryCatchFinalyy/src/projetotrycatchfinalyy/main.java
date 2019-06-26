
package projetotrycatchfinalyy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {

   
    public static void main(String[] args) {
        
        //Tratamento de exceções e erros
        // try{
        //      //digitar o código que pode acontecer algum tipo de erro
        //    }
        
        //try verifica se o que você criou no bloco está sendo executado corretamente
        
        //  catch(ClasseDaexeceção instânciaDaExeceção)
        //  {
        //      //tratamento da exceção
        //      tratamentoData();//método criado pelo programador para usar no tratamento de exceção
        //  }
        // toString(); converte so dados da execeçãopara vizualizar em String
        // printStackTrace(); que imprimi no console, mas usa mais para o programador testar
        // getCaus(); retorna a causa da execeção
        // getMessage(); retorna uma String com o erro
        // familly
        // {
        //      //código a ser executado mesmo que uma exeeção se ja lançada
        // }
        
        //exemplo prático
        String a = "fabiano";
        try{
            
            Integer i = new Integer(a);
            System.out.println("A variável i vale: " + i);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Não é possível atribuir a string " + a + 
            " a um Objeto Inteiro. \n" + 
            "A seguinte mensagem foi retornada: " + nfe.getMessage()) ;
        }
        
                
        System.out.println("");
        System.out.println("");
        
        System.out.println("Outro bloco try");
        try{
            FileInputStream fis = new FileInputStream("casa.txt");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Foi executado o bloco finally");
        }
        
        
        
        //como exemplode busca de tratamento de exceção será com conexões com banco de dados
        
    }
    
    public void tratamentoData()
    {
        //retornar ao método tal.....
        //metodoTal();
    }
    
}
