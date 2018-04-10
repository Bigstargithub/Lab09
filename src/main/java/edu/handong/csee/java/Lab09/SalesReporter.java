package edu.handong.csee.java.Lab09; // the package that consists of SalesReporter and Salesman class. 
import java.util.Scanner; // get the Scanner class from the package java.util.

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
  private Salesman[] team; // set the array variable, team.
  private int numOfSalesman; // set the integer variable, numOfSalesman.
  /**
   * this is a constructor method.</br>
   * You can input number of salesman.</br>
   * 
   */
  public SalesReporter()
  {
	  System.out.printf("Enter number of salesman : "); // display the parenthesis.
	  Scanner myScanner = new Scanner(System.in); // Prepares to read from the keyboard.
	  
	  numOfSalesman = myScanner.nextInt(); // input integer variable.
	  
	  Salesman[] team = new Salesman[numOfSalesman]; // instantiate Salesman class as a array.
	  
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
   * This method set the array length. and put the array data when you input the Salesman's name and Sales.</br>
   */
  public void getData()
  {
	  team = new Salesman[numOfSalesman]; // set the array length.
	  for(int i=0; i < numOfSalesman; i++) // From i to numberOfSalesman. the loop  is continued.
	  {
		  Scanner myScanner = new Scanner(System.in); // Prepares to read from the keyboard.
		  
		  System.out.println("Enter data for associate number " + (i+1)); // display the parenthesis and integer.
		  
		  System.out.printf("Enter name: "); // display the parenthesis.
		  String name = myScanner.nextLine(); // scan the String variable, name. 
		  
		  System.out.printf("Enter Sales: "); // display the parenthesis.
		  double sales = myScanner.nextDouble(); // scan the double variable, sales.
		  
		  Salesman mySalesman = new Salesman(); // instantiate Salesman class.
		  
		  mySalesman.setmName(name); // perform the setmName method of Salesman class.
		  mySalesman.setSales(sales); // perform the setSales method of Salesman class.
		  team[i] = mySalesman; // put the object.
	  }
	  
  }
  
  /**
   * This is a public method, calculateAveragerSales.</br>
   * This method calculates the average of Salesman's Sales.</br>
   */
  public void calculateAveragerSales()
  {
	  double sum = 0 ; // set the double variable, sum to calculate sum of Salesmen's Sales.
	  
	  for(int i=0; i<team.length; i++) // From i to numberOfSalesman. the loop is continued.
	  {
		  double sales = team[i].getSales(); // assign array variable to double variable.
		  sum = sum + sales; // set the sum variable after add the sales variable
	  }
	  
	  averageSales = sum / team.length; // calculate the average.
	  System.out.println("Average Sales per associate is $"+averageSales); // display the average.
  }
  
  
  /**
   * This is a public method, getHighestSales.</br>
   * This method calculates the Hightest sales.</br>
   * 
   */
   public void getHighestSales()
   {
	  
	   for(int i=0; i<team.length-1; i++) // From i to (numberOfSalesman-1). the loop is continued.
		  {
			 if(team[i].getSales() < team[i+1].getSales()) // if the i salesman's sales is less than (i+1) salesman's sales.
				 highestSales = team[i+1].getSales(); // set the (i+1) salesman's sales to double variable.
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
	   for(int i=0; i < team.length;i++)// From i to the length of team array, the loop is continued.
	   {
		   if(team[i].getSales() == highestSales) // if i salesman's sales is equal to hightestSales.
		   {
			   System.out.println("name: " + team[i].getName()); // display i salesman's name.
			   System.out.println("Sales: "+team[i].getSales()); // display i salesman's sales.
			   if(team[i].getSales() > averageSales) // if i salesman's sales is bigger than average of salesmen's sales
			   {
				   System.out.println(team[i].getSales()-averageSales + " above the average."); // display how many above the average.
			   }
			   else if(team[i].getSales() == averageSales) // if i salesman's sales is same as average of salesmen's sales
			   {
				   System.out.println(averageSales  + " same the average"); // display the parenthesis.
			   }
			   else // if i salesman's sales is less than average of salesmen's sales
			   {
				   System.out.println(team[i].getSales() - averageSales + " below the average"); //display how many below the average.
			   }
		   }
	   }
	   
	   System.out.println("The rest performed as follows: "); // display the parenthesis.
	   for (int i=0; i < team.length; i++) // From i to the length of team array, the loop is continued.
	   {
		   
		   if(team[i].getSales() != highestSales) // if i salesman's sales isn't equal to hightestSales.
		   {
               System.out.println("Name: " + team[i].getName()); // display i salesman's name.
               System.out.println("Sales: "+ team[i].getSales());// display i salesman's sales.
		   
		    if(team[i].getSales() > averageSales)// if i salesman's sales is bigger than average of salesmen's sales
		    {
			   System.out.println(averageSales - team[i].getSales() + " above the average.");// display how many above the average.
		    }
		    else if(team[i].getSales() == averageSales)// if i salesman's sales is same as average of salesmen's sales
		    {
			   System.out.println(averageSales  + " same the average"); // display the parenthesis.
		    }
		    else // if i salesman's sales is less than average of salesmen's sales
		    {
			   System.out.println(averageSales - team[i].getSales() + " below the average"); //display how many below the average.
		    }
		   }
	   }
	   
   }
}
