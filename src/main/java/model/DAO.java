package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	/** Modulo de Conecxão **/
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbdesfazimento?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	// Metodo de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	/*
	 * teste de conecxão. public void testeConexao() { try { Connection con =
	 * conectar(); System.out.println(con); } catch (Exception e) {
	 * System.out.println(e); } }
	 */

	/** CRUD - CREATE **/

	public void inserirCadastro(JavaBeans cadastro) {
		String create = "insert into baixa (nome, quant, tomb, infor, valor) values (?,?,?,?,?)";

		try {
			// Abrir conexao com o banco
			Connection con = conectar();

			// Preparar a query para a execucao no banco de dados
			PreparedStatement pst = con.prepareStatement(create);

			// Subistituir os parametros (?) pelo os conteudos das variaveis JavaBeans
			pst.setString(1, cadastro.getNome());
			pst.setString(2, cadastro.getQuant());
			pst.setString(3, cadastro.getTomb());
			pst.setString(4, cadastro.getText());
			pst.setString(5, cadastro.getValor());

			// Executar a query

			pst.executeUpdate();

			// Encerrar a conexao com o banco

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
