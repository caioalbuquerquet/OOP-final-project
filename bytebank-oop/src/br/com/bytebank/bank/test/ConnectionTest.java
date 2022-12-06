package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Connection;


public class ConnectionTest {

	public static void main(String[] args) {
		
		try(Connection connection = new Connection()) {
			connection.readData();
		} catch(IllegalStateException ex) {
			System.out.println("Connection error");
		}
		
//		-----------------------------------
		
//		Conexao con = null;	
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		}finally {
//			System.out.println("finally");
//			if(con != null) {
//			con.close();
//			}
//		}
		
	}

}
