package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
/**Modulo de Conecxão**/
	//Parâmetros de conexão
	private String driver ="com.mysql.cj.jdbc.Driver"; 
	private String url ="jdbc:mysql://localhost:3306/dbdesfazimento?useTimezone=true&serverTimezone=UTC";
	private String user ="root";
	private String password ="";
	//Metodo de conexão
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
	/*teste de conecxão.
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/
}
