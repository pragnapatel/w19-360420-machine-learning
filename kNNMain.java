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
List<DataPoint> Data = DataSet.readDataSet("/Users/pragnapatel/w19-360420-machine-learning/data/iris.csv");
DataPoint point = Data.get(6);

double [] values = point.getX();
String val = Arrays.toString(values);

String label = point.getLabel();
System.out.printf ("/n label"+label + "/n values"+ val);

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset


    


    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
