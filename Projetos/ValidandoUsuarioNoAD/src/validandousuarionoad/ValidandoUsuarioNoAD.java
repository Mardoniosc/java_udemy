/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package validandousuarionoad;
import java.util.Hashtable;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
/**
 *
 * @author p772920
 */
public class ValidandoUsuarioNoAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String userName = "A772920@corp.caixa.gov.br";
        String newPassword = "Civic63";

        Hashtable authEnv = new Hashtable(11);

        authEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
        authEnv.put(Context.PROVIDER_URL, "ldap://corp.caixa.gov.br:389");
        authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
        authEnv.put(Context.SECURITY_PRINCIPAL, userName);
        authEnv.put(Context.SECURITY_CREDENTIALS, newPassword);

       try
        {
           DirContext authContext = new InitialDirContext(authEnv);
           System.out.println("Autenticado!");

        }
        catch (AuthenticationException authEx)
        {
        System.out.println("Erro na autenticação! ");
        authEx.printStackTrace();
        }
        catch (NamingException namEx)
        {
        System.out.println("Problemas na conexão! ");
        namEx.getCause().printStackTrace();
        }
    
    }
    
}
