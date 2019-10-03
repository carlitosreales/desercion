package com.JavaWebApplications.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 * Servlet implementation class PrediccionIndividualSeleccion
 */
public class PrediccionIndividualSeleccion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrediccionIndividualSeleccion() {
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
				System.out.println("!!");
				doGet(request, response);
				String predictions = "";
				PrintWriter out = response.getWriter();
				String pagoMatricula = request.getParameter("pagoMatricula");
				String aspectosEmocionales = request.getParameter("aspectosEmocionales");
				String expetactivaCalidad = request.getParameter("expetactivaCalidad");
				String procesosAdministrativosServicios = request.getParameter("procesosAdministrativosServicios");
				String valoracionIncentivos = request.getParameter("valoracionIncentivos");
				String nombredocumento = request.getParameter("nombredocumento");
				String estadoCivil = request.getParameter("estadoCivil");
				int edad = Integer.parseInt(request.getParameter("edad"));
				String jornada = request.getParameter("jornada");
				String semestre = request.getParameter("semestre");
				String tipo_estudiante = request.getParameter("tipo_estudiante");
				
				final String[] encabezado = {
						"Pago de matricula",
						"Aspectos emocionales",
						"Expectativa calidad academica",
						"Procesos administrativos y servicios",
						"Valoracion Apoyo Especial (Facultad)",
						"nombredocumento",
						"estado_civil",
						"edad",
						"jornada",
						"tipo_estudiante",
						"semestre",
						"Desertor"
						};
		        final Character delimiter = ',';//Delimitador, por defecto es ","
		        String archivoCSV = "C:\\CarpetaWeka\\archivocsvS.csv";//Nombre de archivo CSV

		        try {
		            Writer writer = Files.newBufferedWriter(Paths.get(archivoCSV));
		            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(encabezado)
		                    .withDelimiter(delimiter));

		            
		                csvPrinter.printRecord(Arrays.asList(
		                		pagoMatricula,
		                		aspectosEmocionales,
		                		expetactivaCalidad,
		                		procesosAdministrativosServicios,
		                		valoracionIncentivos,
		                		nombredocumento,
		                		estadoCivil,
		                		edad,
		                		jornada,
		                		tipo_estudiante,
		                		semestre,
		                		 "?"
		                		));
		            
		            csvPrinter.flush();
		            System.out.println("Archivo CSV creado.\n");
		            csvPrinter.close();
		            ;
		            
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		        try {
		        	predictions =usarModelo();
		        	HttpSession session = request.getSession();
		        	session.setAttribute("predictions", predictions);
		        	response.sendRedirect("jsp/welcome.jsp");
					
				} catch (Exception e) {
					// TODO: handle exception
					 e.printStackTrace();
				}
		             
			}
			
			public String usarModelo()  {
				System.out.println("hola");
				UseModel us = new UseModel ();
				return us.useModelSeleccion();
			}
}
