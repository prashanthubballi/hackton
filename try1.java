import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import weka.classifiers.Classifier;
import weka.classifiers.WekaWrapper;
import weka.core.Instances;

public class try1 {
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;
 
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}
 
		return inputReader;
	}
	public static void main(String[] args) throws Exception {
		 //load model
//		String rootPath="/some/where/"; 
		//Classifier cls = (Classifier) weka.core.SerializationHelper.read("C:\\Users\\phubc\\Desktop\\Od_Input.model");
		BufferedReader datafile = readDataFile("C:\\Users\\phubc\\Desktop\\sam_test.csv.arff");
		//predict instance class values
		Instances data = new Instances(datafile);

		//which instance to predict class value
		int s1=0;  
		Classifier cls=new WekaWrapper();
		data.setClassIndex(data.numAttributes() - 1);
		cls.buildClassifier(data);
		//System.out.println(cls.toString());
		//perform your prediction
		
		
		for (int i = 0; i < data.numInstances(); i++) {
			double value=cls.classifyInstance(data.instance(i));

			//get the name of the class value
			String prediction=data.classAttribute().value((int)value);
			System.out.println("The predicted value of instance "+Double.toString(value)+": "+prediction); 
		}
		
	}
}
