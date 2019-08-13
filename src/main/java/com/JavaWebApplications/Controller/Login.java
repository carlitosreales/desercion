package com.JavaWebApplications.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplications.Beans.UsuarioBean;
import com.JavaWebApplications.Model.UserDB;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		System.out.println(usuario);
		System.out.println(clave);
		UsuarioBean userBean = new UsuarioBean();
		userBean.setUsuario(usuario);
		userBean.setClave(clave);
		System.out.println(userBean.getUsuario());
		System.out.println(userBean.getClave());
		UserDB userDB = new UserDB();
		String respuesta = userDB.readData(userBean);
		
		System.out.println(respuesta);
		if(respuesta.equalsIgnoreCase("Success")) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario", userBean.getUsuario());
			session.setAttribute("clave", userBean.getClave());
			//request.getRequestDispatcher(WEB.WELCOME).forward(request, response);
			response.sendRedirect("jsp/welcome.jsp");
		}else {
			//request.getRequestDispatcher(WEB.ERRORLOGIN).forward(request, response);
			response.sendRedirect("jsp/errorLogin.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
