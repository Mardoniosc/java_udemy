
package projetostrings;


public class ProjetoStrings {

    
    public static void main(String[] args) {
        
        //tipo primitivo para caracteres é o char
        
        char[] charString = {'F', 'a', 'b', 'i', 'a', 'n', 'o'};
        System.out.println(charString);
        
        //modificado charString para String
        String string1 = new String(charString);
        
        //objeto String
        String string2 = "Fabiano";
        String espaco = " ";
        String string3 = "Schincariol";  
        
        //concatenar String
        String string4 = string2 + espaco + string3;
        System.out.println(string4);
        
        //obter o tamanho da string4
        System.out.println(string4.length());
        
        //tudo para maiusculo
        System.out.println(string4.toUpperCase());
        
        //tudo para minusculo
        System.out.println(string4.toLowerCase());
        
        //comparação
        System.out.println(string2.equals(string3) ? "sim" : "não");
        
        //comparar o inicio e o fim da string
        String string5 = "www.google.com";
        
        if(string5.startsWith("www.", 0))
        {
            System.out.println("está certo o ínicio");
        }
        if(string5.endsWith(".com"))
        {
            System.out.println("está certo o final");
        }
        
        //pegar um caracter em determinada posição
        char c = string5.charAt(3);
        System.out.println(c);
        
        //substituir parte da string5
        System.out.println(string5.replace("google", "yahoo"));
        
        //trabalhando com substring
        
        String url = "www.google.com.br";
        String dominio = url.substring(4);
        System.out.println(dominio);
        
        int numero = 23456789;
        String  num = Integer.toString(numero);
        System.out.println(num.substring(3));
        
        
        
        
    }
    
}
