
package projetoclassejavastringbuilder;


public class ProjetoClasseJavaStringBuilder {

    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("123456789");
        System.out.println(sb.capacity());//capacidade da StingBuilder
        System.out.println(sb.length());//tamanho da StringBuilder
        System.out.println(sb.append(0));//adiciona
        System.out.println(sb.reverse());//inverte as posições dos caracteres
        
    }
    
}
