package com.practice;

import java.util.stream.Collectors;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem 1 
//		There is a string with letters. At max only one of the letter will repeat twice.  
//		Write code preferably using Stream API to return that twice repeated letter 

		String string = "LOKENDRAA";
		string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(charac -> charac, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 2)
				.forEach(entry -> System.out.println(entry.getKey()));

		
	//Problem 2
//		There is an array of products and need to find total amount. Each element in that array has product details format like productName ,  
//		ProductQuantity, ProductPrice seperated with space each.  
//		For example  
//		["apple 5 20","mango 2 100"], so the total amount is sum of all productQuantity * productPrice,  
//		here total amount is 5*20+ 2*100 which is 300. And if any product/element in that array has negative price / quantity or invalid format , 
//		 then that product should be not considered while calculating total amount 
		
		 int totalAmount = 0;
		  
			String[] stringArray = {"apple -5 20","mango 2 100"};
			
			for(String s : stringArray) {
				String[] splitString = s.split(" ");
				if(Integer.valueOf(splitString[1])>0 || Integer.valueOf(splitString[1])>0) {
				totalAmount +=  Integer.valueOf(splitString[1])* Integer.valueOf(splitString[2]);
				}
			}
			
			System.out.println(totalAmount);
	}

}
