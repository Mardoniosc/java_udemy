
package projetoimob.model.database;

/**
 *
 * @author p772920
 */
public class DataBaseFactory {
    
    //metodo para escolher o tipo de banco de dados.
    // neste caso podera optar por Mysql ou PostGreSql
    
    public static DataBase getDataBase(String nome){
        if(nome.equals("postgresql")){
            return new DataBasePostgreSQL();
        }
        else if(nome.equals("mysql")){
            return new DataBaseMySQL();
            
        }
        return null;
    }
}
