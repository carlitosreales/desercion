package com.JavaWebApplications.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplications.Beans.EstudianteBean;
import com.JavaWebApplications.Beans.UsuarioBean;
import com.JavaWebApplications.Model.UserDB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

/**
 * Servlet implementation class PrediccionIndividual
 */
public class PrediccionIndividual extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrediccionIndividual() {
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
		String jornada = request.getParameter("jornada");
		String sexo = request.getParameter("sexo");
		int edad = Integer.parseInt(request.getParameter("edad"));				
		String estadoCarrera = request.getParameter("estadoCarrera");
		int estrato = Integer.parseInt(request.getParameter("estrato"));
		String estadoCivil = request.getParameter("estadoCivil");		
		String estudianteForaneo = request.getParameter("estudianteForaneo");
		String basesAcademicas = request.getParameter("basesAcademicas");
		String orientacionProfesional = request.getParameter("orientacionProfesional");
		String cambioPrograma = request.getParameter("cambioPrograma");
		String habitosEstrategiasAprendizaje = request.getParameter("habitosEstrategiasAprendizaje");
		String problemasAprendizaje = request.getParameter("problemasAprendizaje");
		String relacionEstudianteDocente = request.getParameter("relacionEstudianteDocente");
		String ausentismo = request.getParameter("ausentismo");
		String accesoAtic = request.getParameter("accesoAtic");
		String pagoMatricula = request.getParameter("pagoMatricula");
		String recursosManutencion = request.getParameter("recursosManutencion");
		String dificultadesAdaptacion = request.getParameter("dificultadesAdaptacion");
		String dificultadesSocializacion = request.getParameter("dificultadesAdaptacion");
		String motivacion = request.getParameter("motivacion");
		String aspectosEmocionales = request.getParameter("aspectosEmocionales");
		String violenciaSocial = request.getParameter("violenciaSocial");
		String aspectosfamiliaresCulturales = request.getParameter("aspectosfamiliaresCulturales");
		String expetactivaCalidad = request.getParameter("expetactivaCalidad");
		String procesosAdministrativosServicios = request.getParameter("procesosAdministrativosServicios");
		String condicioneslaborales = request.getParameter("condicioneslaborales");
		String condicionesSalud = request.getParameter("condicionesSalud");
		String disciplinaConvivencia = request.getParameter("disciplinaConvivencia");
		String atencionPrimariaPAE = request.getParameter("atencionPrimariaPAE");
		String seguimientoPAE = request.getParameter("seguimientoPAE");
		String tutoriaAcademicaDisciplinar = request.getParameter("tutoriaAcademicaDisciplinar");
		String laboratorioPensamientoLenguaje = request.getParameter("laboratorioPensamientoLenguaje");
		String servicioPsicopedagogia = request.getParameter("servicioPsicopedagogia");
		String servicioPsicologia = request.getParameter("servicioPsicologia");
		String servicioOptometria = request.getParameter("servicioOptometria");
		String remisionFinanzasEstudiantiles = request.getParameter("remisionFinanzasEstudiantiles");
		String ofertaCulturalDeportiva = request.getParameter("ofertaCulturalDeportiva");
		String valoracionIncentivos = request.getParameter("valoracionIncentivos");
		String perdidaAsignatura = request.getParameter("perdidaAsignatura");
		String seguimientoRemisiones = request.getParameter("seguimientoRemisiones");
		String remisionDocenteTitular = request.getParameter("remisionDocenteTitular");
		String remisionLEA = request.getParameter("remisionLEA");
		String remisionPsicopedagogia = request.getParameter("remisionPsicopedagogia");
		String remisionPsicologica = request.getParameter("remisionPsicologica");
		String situacion_carrera_estudiante = request.getParameter("situacion_carrera_estudiante");
		String nombredocumento = request.getParameter("nombredocumento");
		String tipo_estudiante = request.getParameter("tipo_estudiante");
		String perteneceCnamarca = request.getParameter("perteneceCnamarca");
		
		
		
		System.out.println("semestre: "+semestre);
		System.out.println("jornada: "+jornada);
		System.out.println("sexo: "+sexo);
		System.out.println("edad: "+edad);
		System.out.println("estadoCarrera: "+estadoCarrera);
		System.out.println("estrato: "+estrato);
		System.out.println("estadoCivil:"+estadoCivil);
		
		System.out.println("estudianteForaneo: "+estudianteForaneo);
		System.out.println("basesAcademicas: "+basesAcademicas);
		System.out.println("orientacionProfesional: "+orientacionProfesional);
		System.out.println("cambioPrograma: "+cambioPrograma);
		System.out.println("habitosEstrategiasAprendizaje: "+habitosEstrategiasAprendizaje);
		System.out.println("problemasAprendizaje: "+problemasAprendizaje);
		System.out.println("relacionEstudianteDocente: "+relacionEstudianteDocente);
		System.out.println("ausentismo: "+ausentismo);
		System.out.println("accesoAtic: "+accesoAtic);
		System.out.println("pagoMatricula: "+pagoMatricula);
		System.out.println("recursosManutencion: "+recursosManutencion);
		System.out.println("dificultadesAdaptación: "+dificultadesAdaptacion);
		System.out.println("dificultadesSocialización: "+dificultadesSocializacion);
		System.out.println("motivacion: "+motivacion);
		System.out.println("aspectosEmocionales: "+aspectosEmocionales);
		System.out.println("violenciaSocial: "+violenciaSocial);
		System.out.println("aspectosfamiliaresCulturales: "+aspectosfamiliaresCulturales);
		System.out.println("expetactivaCalidad: "+expetactivaCalidad);
		System.out.println("procesosAdministrativosServicios: "+procesosAdministrativosServicios);
		System.out.println("condicioneslaborales: "+condicioneslaborales);
		System.out.println("condicionesSalud: "+condicionesSalud);
		System.out.println("disciplinaConvivencia: "+disciplinaConvivencia);
		System.out.println("atencionPrimariaPAE: "+atencionPrimariaPAE);
		System.out.println("seguimientoPAE: "+seguimientoPAE);
		System.out.println("tutoriaAcademicaDisciplinar: "+tutoriaAcademicaDisciplinar);
		System.out.println("laboratorioPensamientoLenguaje: "+laboratorioPensamientoLenguaje);
		System.out.println("servicioPsicopedagogia: "+servicioPsicopedagogia);
		System.out.println("servicioPsicologia: "+servicioPsicologia);
		System.out.println("servicioOptometria: "+servicioOptometria);
		System.out.println("remisionFinanzasEstudiantiles: "+remisionFinanzasEstudiantiles);
		System.out.println("ofertaCulturalDeportiva: "+ofertaCulturalDeportiva);
		System.out.println("perdidaAsignatura: "+perdidaAsignatura);
		System.out.println("seguimientoRemisiones: "+seguimientoRemisiones);
		System.out.println("remisionDocenteTitular: "+remisionDocenteTitular);
		System.out.println("remisionLEA: "+remisionLEA);
		System.out.println("remisionPsicopedagogia: "+remisionPsicopedagogia);
		System.out.println("remisionPsicologica: "+remisionPsicologica);
		System.out.println("situacion_carrera_estudiante: "+situacion_carrera_estudiante);
		System.out.println("valoracionIncentivos: "+valoracionIncentivos);
		final String[] encabezado = {"Bases academicas",
									"Orientacion Profesional",
									"Cambio de programa academico",
									"Habitos y estrategias de aprendizaje",
									"Problemas de aprendizaje",
									"Relacion Estudiante-Docente",
									"Ausentismo",
									"Acceso a TIC",
									"Pago de matricula",
									"Recursos de manutencion",
									"Dificultades adaptacion",
									"Dificultades socializacion",
									"Motivacion",
									"Aspectos emocionales",
									"Violencia social",
									"Aspectos familiares y culturales",
									"Expectativa calidad academica",
									"Procesos administrativos y servicios",
									"Condiciones laborales",
									"Condiciones de salud",
									"Disciplina y convivencia",
									"Atencion Primaria PAE",
									"Seguimiento PAE",
									"Tutoria Academica",
									"Laboratorio Pensamiento y Lenguaje",
									"Servicio de Psicopedagogia",
									"Servicio de Psicologia (BU)",
									"Servicio de Optometria (Facultad)",
									"Remision Finanzas Estudiantiles",
									"Oferta Cultural y Deportiva (BU)",
									"Valoracion Apoyo Especial (Facultad)",
									"PERDIDA DE ASIGNATURA",
									"situacion_carrera_estudiante",
									"nombredocumento",
									"estado_civil",
									"edad",
									"genero",
									"jornada",
									"estudiante",
									"estrato",
									"semestre",
									"pertenece_C/namarca",
									"recurso",
									"Desertor"
									};
        final Character delimiter = ',';//Delimitador, por defecto es ","
        String archivoCSV = "C:\\CarpetaWeka\\archivocsv.csv";//Nombre de archivo CSV

        try {
            Writer writer = Files.newBufferedWriter(Paths.get(archivoCSV));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(encabezado)
                    .withDelimiter(delimiter));

            
                csvPrinter.printRecord(Arrays.asList(
                		 basesAcademicas,
                		 orientacionProfesional,
                		 cambioPrograma,
                		 habitosEstrategiasAprendizaje,
                		 problemasAprendizaje,
                		 relacionEstudianteDocente,
                		 ausentismo,
                		 accesoAtic,
                		 pagoMatricula,
                		 recursosManutencion,
                		 dificultadesAdaptacion,
                		 dificultadesSocializacion,
                		 motivacion,
                		 aspectosEmocionales,
                		 violenciaSocial,
                		 aspectosfamiliaresCulturales,
                		 expetactivaCalidad,
                		 procesosAdministrativosServicios,
                		 condicioneslaborales,
                		 condicionesSalud,
                		 disciplinaConvivencia,
                		 atencionPrimariaPAE,
                		 seguimientoPAE,
                		 tutoriaAcademicaDisciplinar,
                		 laboratorioPensamientoLenguaje,
                		 servicioPsicopedagogia,
                		 servicioPsicologia,
                		 servicioOptometria,
                		 remisionFinanzasEstudiantiles,
                		 ofertaCulturalDeportiva,
                		 valoracionIncentivos,
                		 perdidaAsignatura,
                		 situacion_carrera_estudiante,
                		 nombredocumento,
                		 estadoCivil,
                		 edad,
                		 sexo,
                		 jornada ,
                		 tipo_estudiante,
                		 estrato,
                		 semestre,
                		 perteneceCnamarca,
                		 recurso,
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
		return us.useModel();
	} 

}
