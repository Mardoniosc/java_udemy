
package com.br.model.database;

import java.sql.Connection;

/**
 *
 * @author p772920
 */
public interface DataBase {
    
    //criar um metodo de conexão
    public Connection conectar();
    
    //metodo de desconectar
    public void desconectar(Connection conn);
    
}
