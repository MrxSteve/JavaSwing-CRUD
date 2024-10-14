package com.ejemplo.crud.crudApp.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private String server = "localhost:3306";
    private String baseDatos = "labds1tg1";
    private String usuario = "steve";
    private String clave = "pa55word";
    private String url = "jdbc:mysql://" + server + "/" + baseDatos + "";
	
	private Connection Con;
	
	public Connection getCon() {
		return Con;
	}
	
	public void setCon(Connection con) {
		Con = con;
	}
	
	public Connection Conectar() {
		try {
			setCon(DriverManager.getConnection(url, usuario, clave));
			System.out.println("Conectado");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return getCon(); // Devolver la conexión
	}
	
	public void Desconectar() {
		try {
			if (getCon() != null && !getCon().isClosed()) {
				getCon().close();
				System.out.println("Desconectado");
			}
		} catch (SQLException e) {
			System.err.println("Error al desconectar: " + e.getMessage());
		}
	}
	
	public Conexion() {
		Conectar();
	}
	
	

}
