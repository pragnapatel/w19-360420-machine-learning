# Report Analysis
## Introduction to Programming - Section  02
## Pragna Patel

## Distributions of Model Accuracy


	There is a different accuracy each time ,because the getTestset () method in class DataSet shuffles the data in the test dataset each time the code runs.
This further impacts the string prediction because no two datapoints are compared twice in the predict function. Therefore, this affects the number of correct 
predictions which inherently influences the accuracy percentage of the model.The accuracy percentage is around 97.21%.

 A sensible baseline to compare our model's performances is the frequency of certain datapoints and results.   	
 

## Analysis of different error types

False positive error indicates data that satisfies a condition, when it does not in reality. 
A false negative error indicates data that does not satisfies a condition , when in reality  it does.

Recall is the ratio of false positive data points over a limited section of relative datapoint.
Recall retains more relevant items, since the ratio focuses on an isolated segment of the dataset.
A sensible baseline for the recall is the standard od deviation of the dataset.

Precision is the ratio of relevant false positive data points over the total amount datapoints in the dataset.
Precision has less relevance, since the ratio is diluted , since we consider all data instead of a selected few.
A sensible baseline for precision is the mean value of the dataset.

The hyperparameter k helps the program speeds up its process, by reducing the number of points it needs to sort through.
The nearest neighbour method in class KNNClassifier shortens datasets, by regrouping datapoints to it's neareast identical neighbour.
The predict method in class KNNClassifier then checks for data frequencies in that shortened dataset.