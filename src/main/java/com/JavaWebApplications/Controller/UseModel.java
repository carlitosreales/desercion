package com.JavaWebApplications.Controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import weka.classifiers.Classifier;
import weka.classifiers.meta.CVParameterSelection;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

public class UseModel {
	
	
	ExcelToCsv exc;
	public  String useModelSeleccion(){
		String myPath = getPath("windows");
		String predictions = "";
		Classifier cls = null;
		try {
			String rootPath="App_Modelos\\";
			cls = (Classifier) weka.core.SerializationHelper.read(myPath+"ModelSelectedVar.model");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CSVLoader loader = new CSVLoader();
		try {
			loader.setSource(new File(myPath+"archivocsvS.csv"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Instances originalTrain=null;
		try {
			originalTrain = loader.getDataSet();	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		originalTrain.setClassIndex(originalTrain.numAttributes() - 1); 
		int s1=0;  
		for(int i=0; i<originalTrain.size(); i++) {
			double[] predictionDistribution  =null;
			try {    
		        predictionDistribution = cls.distributionForInstance(originalTrain.instance(i)); 
		        System.out.println(predictionDistribution.length);
		        	//predictions += "<li> "+ ("i:" + (i + 1) + " " + "Probabilidad no desertor:"+ (predictionDistribution[0]*100)) +"%"+" </li>";
		        predictions += "<li class=\"list-group-item\">" + ("i: " + (i + 1) + ") <br> " + "Probabilidad no desertor: <br> "+ (predictionDistribution[0]*100)) +"%"+" </li>  " +  " <li> Probabilidad desertor: <br>"+ (100 - predictionDistribution[0]*100) +"%"+ " </li>";
		        
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
		}
		return predictions;
  }

	public  String useModel(){
		String myPath = getPath("windows");
		String predictions = "";
		Classifier cls = null;
		try {
			String rootPath="App_Modelos\\";
			cls = (Classifier) weka.core.SerializationHelper.read(myPath+"ModelFullVar.model");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CSVLoader loader = new CSVLoader();
		try {
			loader.setSource(new File(myPath+"archivocsv.csv"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Instances originalTrain=null;
		try {
			originalTrain = loader.getDataSet();	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		originalTrain.setClassIndex(originalTrain.numAttributes() - 1); 
		int s1=0;  
		for(int i=0; i<originalTrain.size(); i++) {
			double[] predictionDistribution  =null;
			try {    
		        predictionDistribution = cls.distributionForInstance(originalTrain.instance(i)); 
//		        System.out.println("i:" + (i + 1) + " " + "Predicción:"+ getPrediction(predictionDistribution[0]));
		        predictions += "<li class=\"list-group-item\">" + ("i: " + (i + 1) + ") <br> " + "Probabilidad no desertor: <br> "+ (predictionDistribution[0]*100)) +"%"+" </li>  " +  " <li> Probabilidad desertor: <br>"+ (100 - predictionDistribution[0]*100) +"%"+ " </li>";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
		}
		return predictions;
  }
	
	public  String useModelGroup() {
		String predictions = "";
		String myPath = getPath("windows");
		Classifier cls = null;
		try {
			cls = (Classifier) weka.core.SerializationHelper.read(myPath+"ModelFullVar.model"); // local
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CSVLoader loader = new CSVLoader();
		try {
			loader.setSource(new File(myPath+"prediccionGrupal.csv"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Instances originalTrain=null;
		try {
			originalTrain = loader.getDataSet();	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		originalTrain.setClassIndex(originalTrain.numAttributes() - 1);
		int s1=0;
		for(int i=0; i<originalTrain.size(); i++) {
			double[] predictionDistribution ;
			try {
	
				//String trueClassLabel = originalTrain.instance(i).toString(originalTrain.classIndex());
				
		        predictionDistribution = cls.distributionForInstance(originalTrain.instance(i));
		       
		    
		        
		       System.out.println(predictionDistribution[0]);
		        //System.out.println(trueClassLabel);
		
		       predictions += "<li class=\"list-group-item\">" + ("i: " + (i + 1) + ") <br> " + "Probabilidad no desertor: <br> "+ (predictionDistribution[0]*100)) +"%"+" </li>  " +  " <li> Probabilidad desertor: <br>"+ (100 - predictionDistribution[0]*100) +"%"+ " </li>";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		return predictions;
  }
	
	private String getPath(String filename) {
		String Path = "";
		if(filename.equalsIgnoreCase("windows")) {
			return Path += "C:\\CarpetaWeka\\";
		}
		Path += "other/";
		return Path;
	}
	
}
