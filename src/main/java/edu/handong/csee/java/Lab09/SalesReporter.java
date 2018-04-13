package edu.handong.csee.java.Lab09; // the package that consists of SalesReporter and Salesman class. 
import java.util.Scanner; // get the Scanner class from the package java.util.
import java.util.ArrayList; // get the ArrayList class froem the package java.util.


/**
 * This is a SalesReporter class.</br>
 * You can input number of salesman and each salesman's name and sales.</br>
 * Then, this class will calculate average and HighestSales.</br>
 * 
 * @author Bigstar
 *
 */
public class SalesReporter {
  private double highestSales; // set the double variable, highestSales .
  private double averageSales; // set the double variable, averageSales.
  private ArrayList<String> mName; // set the String type arraylist, mName. 
  private ArrayList<Double> salesOfsalesman; // set the Double type arraylist, salesOfsalesman.

  /**
   * this is a constructor method.</br>
   * You can input number of salesman.</br>
   * 
   */
  public SalesReporter()
  {
	   mName = new ArrayList<String>(); // instantiate ArrayList of the String type. 
	   salesOfsalesman = new ArrayList<Double>();  // instantiation ArrayList of the double type. 
  }
  
  /**
   * This is a main method of SalesReporter class.</br>
   * @param args</br>
   */

  public static void main(String[] args)
  {
	  SalesReporter myReporter = new SalesReporter(); // assign the object of SalesReporter class.
	  myReporter.getData(); // performs getdata method.
	  myReporter.calculateAveragerSales(); // performs calculateAveragerSales method.
	  myReporter.getHighestSales(); // performs getHighestSales method.
	  myReporter.printSalesman(); // performs printSalesman method.
	  
  }
  
  /**
   * This is a public method.</br>
   * This method puts the array data when you input the Salesman's name and Sales.</br>
   */
  public void getData()
  {
	  int i = 0; // set the integer variable, i that is 0.
	  while(true) // This is a infinite loop.
	  {
		  
		  String haha = ""; // set the string variable, haha that is null
		  Scanner myScanner = new Scanner(System.in); // Prepares to read from the keyboard.
		  
		   System.out.println("Enter data for associate number " + (i+1)); // display the parenthesis and integer.
		   i++;
		   System.out.printf("Enter name: "); // display the parenthesis.
		   String name = myScanner.nextLine(); // scan the String variable, name. 
		   
		   System.out.printf("Enter Sales: "); // display the parenthesis.
		   double sales = myScanner.nextDouble(); // scan the double variable, sales.
		
		   mName.add(name); // add a name variable to the arraylist, mName.
		   salesOfsalesman.add(sales);// add a sales variable to the arraylist, mName.
		 
		   System.out.print("Do you want to add the salesman?(Yes/No): "); // display the parenthesis. 
		   haha = myScanner.next(); // scan the String variable, haha.
		   
		   if(!haha.equals("yes")) // if haha is not equal to "yes"
		    {
			  break; // the loop is quit.
		    }
	   }
  }
  
  /**
   * This is a public method, calculateAveragerSales.</br>
   * This method calculates the average of Salesman's Sales.</br>
   */
  public void calculateAveragerSales()
  {
	  double sum = 0 ; // set the double variable, sum to calculate sum of Salesmen's Sales.
	  
	  for(int i=0; i<mName.size(); i++) // From i to the size of mName arraylist. the loop is continued.
	  {
		  sum = sum + salesOfsalesman.get(i); // set the sum variable after add the sales variable.
	  }
	  
	  averageSales = sum / mName.size(); // calculate the average.
	  System.out.println("Average Sales per associate is $"+averageSales); // display the average.
  }
  
  
  /**
   * This is a public method, getHighestSales.</br>
   * This method calculates the Hightest sales.</br>
   * 
   */
   public void getHighestSales()
   {
	   
	   for(int i=0; i < salesOfsalesman.size()-1; i++) // From i to (the size of salesOfsalesman arraylist) - 1. the loop is continued.
	      {
			 if(salesOfsalesman.get(i) < salesOfsalesman.get(i+1)) // if the i salesman's sales is less than (i+1) salesman's sales.
				 highestSales = salesOfsalesman.get(i+1); // set the (i+1) salesman's sales to double variable.
		  }
		  
		  System.out.println("The highest sales figure is $" + highestSales); // display the Hightest sales.
   }
  /**
   * This is a public method, printSalesman.</br>
   * This method displays the salesman of the hightest sales.</br>
   * And, The rest salesmen are displayed next.</br>
   */
   public void printSalesman()
   {
	   System.out.println("The following had the highest sales: "); // display the parenthesis.
	   for(int i=0; i < mName.size();i++)// From i to the size of mName arraylist, the loop is continued.
	   {
		   if(salesOfsalesman.get(i) == highestSales) // if i salesman's sales is equal to hightestSales.
		   {
			   System.out.println("name: " + mName.get(i)); // display i salesman's name.
			   System.out.println("Sales: "+ salesOfsalesman.get(i)); // display i salesman's sales.
			   if(salesOfsalesman.get(i) > averageSales) // if i salesman's sales is bigger than average of salesmen's sales
			   {
				   System.out.println(salesOfsalesman.get(i)-averageSales + " above the average."); // display how many above the average.
			   }
			   else if(salesOfsalesman.get(i) == averageSales) // if i salesman's sales is same as average of salesmen's sales
			   {
				   System.out.println(averageSales  + " same the average"); // display the parenthesis.
			   }
			   else // if i salesman's sales is less than average of salesmen's sales
			   {
				   System.out.println(salesOfsalesman.get(i) - averageSales + " below the average"); //display how many below the average.
			   }
		   }
	   }
	   
	   System.out.println("The rest performed as follows: "); // display the parenthesis.
	   for (int i=0; i < mName.size(); i++) // From i to the size of mName arraylist, the loop is continued.
	   {
		   
		   if(salesOfsalesman.get(i) != highestSales) // if i salesman's sales isn't equal to hightestSales.
		   {
               System.out.println("Name: " + mName.get(i)); // display i salesman's name.
               System.out.println("Sales: "+ salesOfsalesman.get(i));// display i salesman's sales.
		   
		    if(salesOfsalesman.get(i) > averageSales)// if i salesman's sales is bigger than average of salesmen's sales
		    {
			   System.out.println(averageSales - salesOfsalesman.get(i) + " above the average.");// display how many above the average.
		    }
		    else if(salesOfsalesman.get(i) == averageSales)// if i salesman's sales is same as average of salesmen's sales
		    {
			   System.out.println(averageSales  + " same the average"); // display the parenthesis.
		    }
		    else // if i salesman's sales is less than average of salesmen's sales
		    {
			   System.out.println(averageSales - salesOfsalesman.get(i) + " below the average"); //display how many below the average.
		    }
		   }
	   }
	   
   }
}
