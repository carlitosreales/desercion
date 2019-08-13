package com.JavaWebApplications.Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

/**
 * Servlet implementation class PrediccinGrupal
 */
@MultipartConfig
public class PrediccinGrupal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrediccinGrupal() {
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
		
		
		String predictions = "";
		Part filePart = request.getPart("file"); // Obtiene el archivo
	    if(filePart == null) {
	    	return;
	    }
		String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	    System.out.println(fileName);
	    String path="C:\\CarpetaWeka\\prediccionGrupal.xlsx"  ;
	    File uploads = new File(path); //Carpeta donde se guardan los archivos
	    uploads.mkdirs(); //Crea los directorios necesarios
	    File file = new File(path);
	    try (InputStream input = filePart.getInputStream()){
	        Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        
	    }
	    try {
	    	ExcelToCsv ex = new ExcelToCsv();
			String myfile = "C:\\CarpetaWeka\\prediccionGrupal.xlsx";
			try {
				ex.convertSelectedSheetInXLXSFileToCSV(myfile, 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	predictions = usarModelo();
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
		return us.useModelGroup();
	}

}
