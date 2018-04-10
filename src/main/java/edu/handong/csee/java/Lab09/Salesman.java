package edu.handong.csee.java.Lab09; // the package that consists of SalesReporter and Salesman class. 

/**
 * This is a Salesman class.</br>
 * This class consists of constructor.</br>
 * @author Bigstar
 *
 */
public class Salesman 
{
  private double sales; // set the double variable, sales.
  private String name; // set the String variable, name.
  /**
   * this method is constructor.</br>
   * This instantiates the object, Salesman class.</br>
   */
  public Salesman()
  {
	  name=""; // call to initial String, name.
	  sales = 0; // call to initial double. sales.
  }
  
  /**
   * This method is constructor.</br>
   * @param name</br>
   * @param sales</br>
   */
  public void Salesman(String name, double sales)
  {
	  this.name=name; // the this keyword. this name variable points itself.
	  this.sales=sales; // the this keyword. this sales variable points itself.
  }
  /**
   * This method returns double , sales.</br>
   * 
   * @return
   */
  public double getSales()
  {
	  return sales; // return the double variable.
  }
  
  /**
   * This method return String, getName.</br>
   * @return</br>
   */
  public String getName()
  {
	  return name; // return the String variable.
  }
  
  /**
   * This method points out instance variable (sales) itself.</br>
   * @param sales</br>
   */
  public void setSales(double sales)
  {
	  this.sales = sales; // instance double variable (sales) itself.
  }
  
  /**
   * This method points out instance variable (name) itself.</br>
   * @param name</br>
   */
  public void setmName(String name)
  {
	  this.name = name; // instance String variable (name) itself.
  }
  

}


