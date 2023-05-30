package com.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;

public class ProductBill {
	
	 private String pname;  
     private int qty;  
     private double price;  
     private double totalPrice;  
        
       
      ProductBill(String productName,  int qty, double price, double totalPrice){  
    	  
         this.pname = pname;  
         this.qty = qty;  
         this.price = price;  
         this.totalPrice = totalPrice;  
     }  
          
             public String getPname()   
             {  
                 return pname;  
             }  
             public int getQty()   
             {  
                 return qty;  
             }  
             public double getPrice()   
             {  
                 return price;  
             }  
             public double getTotalPrice()
             {  
                 return totalPrice;  
             }  
              
         public static void Bill()   
                {  
                
                    String productName = null;  
                    int quantity = 0;   
                    double price = 0.0;  
                    double totalPrice = 0.0;  
                    double overAllPrice = 0.0;  
                    double  subtotal=0.0;  
                    char choice = '0';  
                    
                    Scanner sc = new Scanner(System.in);  
                    System.out.print("Enter the Customer Name: ");  
                    String customername=sc.nextLine();  
  
                    List<ProductBill> product = new ArrayList<ProductBill>();  
     
                do   
                   {  
                             
                     System.out.println("Enter the product details: ");  
                     System.out.print("Name: ");  
                     productName=sc.nextLine();       
                     System.out.print("Quantity: ");  
                     quantity = sc.nextInt();  
                     System.out.print("Price (per item): ");  
                     price = sc.nextDouble();  
                              
                     totalPrice = price * quantity;  
                           
                     overAllPrice = overAllPrice + totalPrice;  
                            
                    product.add( new ProductBill(productName, quantity, price, totalPrice) );  
                        
                            System.out.print("Want to add more items? (y or n): ");  
                            
                            choice = sc.next().charAt(0);  
                        }   
                    while (choice == 'y' || choice == 'Y');  
                       System.out.println("Total Price="+overAllPrice);
                       sc.close();
                  
                     
                }

}
