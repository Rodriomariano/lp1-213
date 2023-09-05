package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Database Connection
// - Conjunto de interface e classe para acesso a SGBDs

// App Java   ----->  MySQL
// Como abrir a conexão?
// Como executar um código SQL?
// Qual o formato de resultados de uma consulta SELECT * FROM ...

// App Java    ------> Driver PostgreSQL   ---> PostgreSQL

//Java App ---> JDBC  ----> Driver (biblioteca que implementa JDBC) ---> SGBD
//App Desktop  -->  JDBC  --> Driver MySQL

public class Main {
    public static void main(String[] args) throws SQLException {
        // 1. criar a conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);
        // 2. Executar a consulta SQL
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);
        // 3. fechar conexão
        stm.close();
        conn.close();

    }
}