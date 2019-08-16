
package com.br.model.database;

import java.sql.Connection;

/**
 *
 * @author fschi
 */
public interface Database {
    //método de conexão
    public Connection conectar();
    //método de desconectar
    public void desconectar(Connection conn);
    
}
