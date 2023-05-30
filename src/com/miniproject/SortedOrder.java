package com.miniproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedOrder {
	
	//static int choice;
	public static void main(String[] args)
	{
     // Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Product Id : ");
		int id = sc.nextInt();
		for(int i = 1;i<=input;i++){
			if(input<=10){
				System.out.println("Product is available");
			}else {
				System.out.println("Product is not available");
				break;
			}
			}
		System.out.println("Product name : ");
		String name = sc.next();
		System.out.println("Product Description: ");
		String desc = sc.next();
		System.out.println("Available Quantity : ");
		int qty = sc.nextInt();
		System.out.println("Price: ");
		float price = sc.nextFloat();
		}
	}

