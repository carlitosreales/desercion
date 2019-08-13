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
				String semestre = request.getParameter("semestre");
				String recurso = request.getParameter("recurso");
				int edad = Integer.parseInt(request.getParameter("edad"));				
				String estadoCarrera = request.getParameter("estadoCarrera");
				String estadoCivil = request.getParameter("estadoCivil");		
				int puntajeIcfes = Integer.parseInt(request.getParameter("puntajeIcfes"));		
				String estudianteForaneo = request.getParameter("estudianteForaneo");
				String basesAcademicas = request.getParameter("basesAcademicas");
				String habitosEstrategiasAprendizaje = request.getParameter("habitosEstrategiasAprendizaje");
				String pagoMatricula = request.getParameter("pagoMatricula");
				String recursosManutencion = request.getParameter("recursosManutencion");
				String atencionPrimariaPAE = request.getParameter("atencionPrimariaPAE");
				String tutoriaAcademicaDisciplinar = request.getParameter("tutoriaAcademicaDisciplinar");
				String servicioPsicologia = request.getParameter("servicioPsicologia");
				String perdidaAsignatura = request.getParameter("perdidaAsignatura");
				String situacion_carrera_estudiante = request.getParameter("situacion_carrera_estudiante");
				String tipo_estudiante = request.getParameter("tipo_estudiante");
				String perteneceCnamarca = request.getParameter("perteneceCnamarca");
				String nombredocumento = request.getParameter("nombredocumento");
				System.out.println("semestre: "+semestre);
				System.out.println("edad: "+edad);
				System.out.println("estadoCarrera: "+estadoCarrera);
				System.out.println("estadoCivil:"+estadoCivil);
				System.out.println("puntajeIcfes: "+ puntajeIcfes);
				System.out.println("estudianteForaneo: "+estudianteForaneo);
				System.out.println("basesAcademicas: "+basesAcademicas);
				System.out.println("habitosEstrategiasAprendizaje: "+habitosEstrategiasAprendizaje);
				System.out.println("pagoMatricula: "+pagoMatricula);
				System.out.println("recursosManutencion: "+recursosManutencion);
				System.out.println("atencionPrimariaPAE: "+atencionPrimariaPAE);
				System.out.println("tutoriaAcademicaDisciplinar: "+tutoriaAcademicaDisciplinar);
				System.out.println("servicioPsicologia: "+servicioPsicologia);
				
				
				final String[] encabezado = {"Bases academicas",
											"Habitos y estrategias de aprendizaje",
											"Pago de matricula",
											"Recursos de manutencion",
											"Atencion Primaria PAE",
											"Tutoria Academica",
											"Servicio de Psicologia (BU)",
											"PERDIDA DE ASIGNATURA",
											"situacion_carrera_estudiante",
											"nombredocumento",
											"estado_civil",
											"edad",
											"estudiante",
											"semestre",
											"pertenece_C/namarca",
											"recurso",
											"PuntajeGlobal_saber11",
											"Desertor"
											};
		        final Character delimiter = ',';//Delimitador, por defecto es ","
		        String archivoCSV = "C:\\CarpetaWeka\\archivocsvS.csv";//Nombre de archivo CSV

		        try {
		            Writer writer = Files.newBufferedWriter(Paths.get(archivoCSV));
		            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(encabezado)
		                    .withDelimiter(delimiter));

		            
		                csvPrinter.printRecord(Arrays.asList(
		                		 basesAcademicas,
		                		 habitosEstrategiasAprendizaje,
		                		 pagoMatricula,
		                		 recursosManutencion,
		                		 atencionPrimariaPAE,
		                		 tutoriaAcademicaDisciplinar,
		                		 servicioPsicologia,
		                		 perdidaAsignatura,
		                		 situacion_carrera_estudiante,
		                		 nombredocumento,
		                		 estadoCivil,
		                		 edad,
		                		 tipo_estudiante,
		                		 semestre,
		                		 perteneceCnamarca,
		                		 recurso,
		                		 puntajeIcfes,	
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
				UseModel us = new UseModel ();
				return us.useModelSeleccion();
			}
}
