package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	 public static void main(String[] args) throws SQLException {
	        final String url = "jdbc:mysql://localhost?verifuServerCertificar";
	        final String usuario = "root";
	        final String senha = "Bianca27!";

	        Connection conexao = DriverManager.
	        		getConnection(url, usuario, senha);

	        Statement stmtStatement = conexao.createStatement();

	        stmtStatement.execute("CREATE DATABASE curso_java");
	        
	        System.out.println("Banco criado com sucesso.");
	        conexao.close();
	    }
}
