package com.JavaWebApplications.Controller;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		//TrainModel tm = new TrainModel();
		//UseModel um = new UseModel();
		ExcelToCsv ex = new ExcelToCsv();
		//tm.trainModel();
		//um.useModelGroup();
		//System.out.println (new File (".").getAbsolutePath ());
		String myfile = "Plantilla.xlsx";
		try {
			ex.convertSelectedSheetInXLXSFileToCSV(myfile, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
