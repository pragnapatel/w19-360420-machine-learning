import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;


public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

	DataSet dataset = new DataSet();
	List<DataPoint> Data = DataSet.readDataSet("/Users/pragnapatel/w19-360420-machine-learning/data/breastCancer.csv");
	DataPoint point = Data.get(6);

	double [] values = point.getX();
	String val = Arrays.toString(values);

	String label = point.getLabel();
	//System.out.printf ("/n label"+label + "/n values"+ val);

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset

	List<DataPoint> trainingset = new ArrayList<DataPoint>();
	trainingset = DataSet.getTrainingSet(Data, 0.75);
	//System.out.println ("TrainingSET"+ "      ");
	//DataSet.printDataSet(trainingset);
	//System.out.println ("");

	List<DataPoint> test = new ArrayList<DataPoint>();
	test = DataSet. getTestSet(Data, 0.75);
	//System.out.println ("TestSET"+ "      ");
	//DataSet.printDataSet(test);
	//System.out.println ("");
	



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)

    //double i = DataSet.distanceEuclid(Data.get(6),Data.get(5));


    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label
     
    // KNNClassifier near = new KNNClassifier (4) ;
     //String predict = near.predict(Data,point) ;
     //System.out.println (predict);

    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.

	double c = 0 ; //number times prediction = true
	double d = 0 ; //number of iterations
	
	for ( int j = 0; j < test.size(); j++)
	{
	  String testpredict = near.predict(trainingset, test.get(j));
	  //System.out.println ("test" + testpredict + test.get(j));
	  if (testpredict.equals ( test.get(j).getLabel()))
	  {
	  c++;
	  }
	  d++;
	}
	double percentage = (c/d)* 100 ;
	  System.out.println ("Numnber of predictions = " + c);
	  System.out.println ("Numnber of iterations = " + d);
	  System.out.println ("Accuracy = " + percentage);

  }

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
