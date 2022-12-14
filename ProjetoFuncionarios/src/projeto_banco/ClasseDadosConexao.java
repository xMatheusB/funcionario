package projeto_banco;

import java.sql.Connection;
import java.sql.DriverManager;
public class ClasseDadosConexao {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DATABASE_URL = "jdbc:mysql://banco:3306/banco_funcionarios";

		public static Connection criarConexao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
	}
		
	public static void main(String[] args) throws Exception {

		Connection conexao = criarConexao();
		if (conexao != null) {
			System.out.println("Conexão ok!");
			conexao.close();
		}

	}

}
