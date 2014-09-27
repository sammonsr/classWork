/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*  
*  Roxy Sammons
*  27 September 2014
**/

import java.util.Scanner;

public class TemperatureChangerTest {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a temperature followed by either F for farenheit or C for celcius (no spaces):");
    
    String temp = input.next();
    
    if(temp.length() > 1) {
    
    String lastchar = temp.substring(temp.length()-1, temp.length());
    
    String number = temp.substring(0,temp.length()-1);
    
    double numtemp = Double.parseDouble(number);
    
    if (lastchar.equals("F")) {
      double celcius = (numtemp-32)/1.80;
      System.out.println(numtemp + " farenheit is equivalent to " + celcius + " celcius.");
    } else if (lastchar.equals("C")) {
      double farenheit = 1.80*(numtemp) + 32;
      System.out.println(numtemp + " celcius is equivalent to " + farenheit + " farenheit.");
    } else {
      System.out.println("I'm sorry, I do not understand what you entered.");
    }
    } else {
      System.out.println("I'm sorry, I do not understand what you entered.");
    }
    
  }
  
}
