package com.JavaWebApplications.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.JavaWebApplications.Beans.UsuarioBean;

public class UserDB {
	String s1 = null;
	public String insertUser(UsuarioBean usuarioBean) {
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try {
			Statement stat = con.createStatement();
			System.out.println("!");
			stat.executeUpdate("insert into usuario (usuario,clave,email,rol_id) values ('"+usuarioBean.getUsuario()+"','"+usuarioBean.getClave()+"','"+usuarioBean.getEmail()+"','"+usuarioBean.getRolId()+"')");
			s1 = "user inserted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}
	public String readData(UsuarioBean usuario){
		s1="error";
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from usuario where usuario='"+usuario.getUsuario()+"' and clave = '"+usuario.getClave() +"'");
			rs.next();
			System.out.println(rs.getString("usuario"));
			s1 = "Success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s1;

	}

}
//stat.executeUpdate("insert into usuario (usuario,clave,email,rol_id,fecha_creacion) values ('"+usuarioBean.getUsuario()+"','"+usuarioBean.getClave()+"','"+usuarioBean.getEmail()+"','"+usuarioBean.getRolId()+"','"+usuarioBean.getFechaCreacion()+"')");