package br.com.praticaweb.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class SqlConnection {

    private Connection conexao;
    private static final String connectionString = "jdbc:sqlserver://UBR3144\\SQLEXPRESS; databaseName=db_curso_unicred; user=sa;password=xongas_1234;";
    private CallableStatement comando;
    
    /**
     * inicializa a conexão
     * @param sql
     * @throws SQLException
     */
    public SqlConnection(String sql) throws SQLException {
        this.conexao = DriverManager.getConnection(connectionString);
        this.comando = conexao.prepareCall(sql);
    }
    
    /**
     * fecha a conexão
     * @throws SQLException
     */
    public void close() throws SQLException {
        this.comando.close();
        this.conexao.close();
    }
}
