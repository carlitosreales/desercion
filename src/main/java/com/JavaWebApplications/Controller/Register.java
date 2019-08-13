package com.JavaWebApplications.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplications.Beans.UsuarioBean;
import com.JavaWebApplications.Model.UserDB;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		String email = request.getParameter("email");
		
				
		
		System.out.println(usuario);
		System.out.println(clave);
		System.out.println(email);
		
		
		UsuarioBean userBean = new UsuarioBean(usuario,clave,email,1);
		UserDB userDB = new UserDB();
		String respuesta = userDB.insertUser(userBean);
		System.out.println(respuesta);
		if(respuesta.equalsIgnoreCase("user inserted")) {
			response.sendRedirect("jsp/welcome.jsp");
		}else {
			response.sendRedirect("jsp/errorLogin.jsp");
		}
	}

}
