 /*write a program that prompts the user
   to enter distance to drive
   fuel efficiency of the car MPG
   price per gallon and displays 
   the cost of a the trip
   */
   
   //importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class DrivingCost {
   
   //Main Method
   public static void main(String[] args) {
         
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      //prompting user on miles to be driven
      System.out.println("Miles to be driven: ");
      
      //displaying how many miles were driven
      double miles = scanner.nextDouble();
      
      //prompting user on miles per gallon
      System.out.println("Miles per gallon: ");
      
      //displaying miles per gallon
      double perGallon = scanner.nextDouble();
            
      //prompting the user on price per gallon
      System.out.println("Price per gallon: ");
      
      //displaying price per gallon
      double priceGallon = scanner.nextDouble();
            
      //calculating cost
      double cost  = (miles / perGallon)* priceGallon; 
          
      //using to format cost to two decimal places
      String cost_string = String.format("%5.2f", cost);
      
      //displaying cost of driving
      System.out.println("The cost of driving is $"+ cost_string);
   
   }//end of main block
}//end class DrivingCost