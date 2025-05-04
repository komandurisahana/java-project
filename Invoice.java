/* 
Sahana Komanduri PD6
Invoice code
9/27/24
Purpose: Take the item name, price, and shipping cost to print the item name, price, shipping cost, and total
*/
import java.util.*;

public class Invoice
 {  
   public static void main (String [] args)
    {
       Scanner keyboard = new Scanner (System.in);
       
       System.out.println ("Enter the item:");
       String item = keyboard.nextLine ();
       
       System.out.println ("Enter the price:");
       double price = keyboard.nextDouble ();
       
       System.out.println ("Overnight delivery (0 == no, 1 == yes)");
       int shippingMethod = keyboard.nextInt ();
       
       printInvoice (item, price, shippingMethod);
       } //end of main
       
       /****
       pre-condition: The argument item must be a string, the price must be a double, and the shippingMethod should be an int
       post-condition: The program will return the item, it's cost, the shipping cost, and total cost
       ***/
       public static void printInvoice (String item, double price, int shippingMethod)
       {
       System.out.println ("Invoice");
       System.out.println(item + " " + price);
       int shipping;
       
       if(price<10)
       {
         shipping = 2;
       }
       else
       {
         shipping = 3;
       }
       
       if (shippingMethod == 1)
       { 
          shipping += 5;
       }
       
       System.out.println("shipping" + "  " + shipping);
       System.out.println("total" + "     " + (price + shipping));
       }
       
   } //end of Invoice
   
   
   /****Test Classes
   Input #1:
   Item: Salad
   Price: 4.0
   Overnight delivery: 0
   
   Output #1: 
   Invoice 
   Salad 4.0
   shipping  2
   total     6.0
   
   
   Input #2
   Item: Salad
   Price: 10
   Overnight delivery: 0
   
   Output #2
   Invoice
   Salad 10.0
   shipping  3
   total     13.0
   
   
   Input #3
   Item: Salad
   Price 15
   Overnight delivery: 0
   
   Output #3
   Invoice
   Salad 15.0
   shipping  3
   total     18.0
   
   
   Input #4 
   Item: Salad
   Price 5
   Overnight delivery: 1
   
   
   Output #4
   Invoice
   Salad 5.0
   shipping 7
   total    12.0
   ****/
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   
   
   


   
   
   
   
   
       
     
       
       
       
       
       
     
      
       
       
       
       
   
       
      