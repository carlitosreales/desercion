package com.JavaWebApplications.Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToCsv {
	
	 public  void  convertSelectedSheetInXLXSFileToCSV(String Path, int sheetIdx) throws Exception {
		    String csv = "";
		    File myFile = new File(Path);
	        FileInputStream fileInStream = new FileInputStream(myFile);
	 
	        // Open the xlsx and get the requested sheet from the workbook
	        XSSFWorkbook workBook = new XSSFWorkbook(fileInStream);
	        XSSFSheet selSheet = workBook.getSheetAt(sheetIdx);
	 
	        // Iterate through all the rows in the selected sheet
	        Iterator<Row> rowIterator = selSheet.iterator();
	        while (rowIterator.hasNext()) {
	 
	            Row row = rowIterator.next();
	 
	            // Iterate through all the columns in the row and build ","
	            // separated string
	            Iterator<Cell> cellIterator = row.cellIterator();
	            StringBuffer sb = new StringBuffer();
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                if (sb.length() != 0) {
	                    sb.append(",");
	                }
	                 
	                // If you are using poi 4.0 or over, change it to
	                // cell.getCellType
	                switch (cell.getCellTypeEnum()) {
	                case STRING:
	                    sb.append(cell.getStringCellValue());
	                    break;
	                case NUMERIC:
	                    sb.append(cell.getNumericCellValue());
	                    break;
	                case BOOLEAN:
	                    sb.append(cell.getBooleanCellValue());
	                    break;
	                default:
	                }
	            }
	            System.out.println(sb.toString());
	            csv += sb.toString() + "\n";
	        }
	        workBook.close();
	        String ruta = "C:\\CarpetaWeka\\prediccionGrupal.csv";
	        File archivo = new File(ruta);
	        BufferedWriter bw;
	        if(archivo.exists()) {
	            bw = new BufferedWriter(new FileWriter(archivo));
	            bw.write(csv);
	        } else {
	            bw = new BufferedWriter(new FileWriter(archivo));
	            bw.write(csv);
	        }
	        bw.close();
	 }
}