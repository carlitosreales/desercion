package com.JavaWebApplications.Controller;

import java.io.File;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

public class TrainModel {
    		
	public void trainModel() {
		try {
			
			String rootPath="C:\\Users\\Bosca\\workspace\\ModeloWeka\\";

            CSVLoader loader = new CSVLoader();
            //loader.setOptions(new String[] {"-H"});
            //loader.setSource(new File(rootPath+"DatosTrain.csv"));
            loader.setSource(new File("App_Modelos\\pruebas1.0.csv"));
            //loader.setSource(new File("DatosTrain.csv"));
            Instances tr = loader.getDataSet(); //->	OBTIENE TODOS LOS DATOS DE UN ARCHIVO TIPO: (ARFF, CSV, XRFF)
            tr.setClassIndex(tr.numAttributes() - 1); //-> Hacer que el último atributo sea la clase.
            
            //weka.classifiers.trees.J48
            
            Classifier m = (Classifier) new J48(); //-> declaramos un clasificador Naïve Bayes 
            m.buildClassifier(tr); //-> Genera un clasificador
           
                      
            Evaluation eval = new Evaluation(tr); 
            eval.evaluateModel(m, tr);//->genera el resultado de clasificación      
            //eval.crossValidateModel(m, tr, 100,  new Random(1));
            weka.core.SerializationHelper.write("App_Modelos\\newModel.model",m);
            System.out.println(eval.toSummaryString()); //-> imprime el resultado
            System.out.println(eval.toClassDetailsString());
            System.out.println(eval.toMatrixString());
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}


