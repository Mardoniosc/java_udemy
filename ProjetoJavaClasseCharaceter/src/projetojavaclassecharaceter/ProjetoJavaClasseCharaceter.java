
package projetojavaclassecharaceter;


public class ProjetoJavaClasseCharaceter {

    public static void main(String[] args) {
        
        //classe Characeter
        char c = 'c';
        System.out.println(Character.isDefined(c));//checa se o caracter é Unicode
        System.out.println(Character.isDigit(c));//se é um digito
        System.out.println(Character.isLetter(c));//se é letra
        System.out.println(Character.charCount(c));//conta quanto caracteres possui
        
    }
    
}
