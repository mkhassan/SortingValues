package com.assigment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AgeCalculator {

	public static void main(String[] args) {
		
	    System.out.println("Do you want to calculate your age? enter Y for YES and N for NO");
	    Scanner keyboard = new Scanner(System.in);
	    
	    String start = keyboard.next();
		//ArrayList<Integer> yeararray = new ArrayList<Integer>();
	    int[] yeararray;
	    int count = 0;
	    
	    yeararray = new int[50];
	    
	    if (start.equals("Y")) {
	    	
	    	while (start.equals("Y")) {
	    
	    	System.out.println("Enter the date, month, year in format dd/mm/yyyy");
	    	
			
			
			String DateOfBirth = keyboard.next();
			String[] BirthData = DateOfBirth.split("/");
			
			int birth_day = Integer.parseInt(BirthData[0]);
			int birth_month = Integer.parseInt(BirthData[1]);
			int birth_year = Integer.parseInt(BirthData[2]);
			int age;
			System.out.println("Enter todays date in dd/mm/yyyy format");
			
			String today = keyboard.next();
			String[] todayDate = today.split("/");
			
			int today_day = Integer.parseInt(todayDate[0]);
			int today_month = Integer.parseInt(todayDate[1]);
			int today_year = Integer.parseInt(todayDate[2]);
			
			 if (birth_month > today_month && birth_day > today_day) {
				  age = today_year - birth_year - 1;
			 }
			 
			 
			 else
			 {  age = today_year - birth_year;}
			 
			 System.out.println("your age is:" + age) ;
			
		
			yeararray[count] = age;			
			count++; 
			 
		 System.out.println("Do you have more age records to enter? If yes, enter Y, or N ");
				
				start = keyboard.next();
	    	
	    
	    }
	    	System.out.println("Thanks for using the age calculator");
	    	
	    	for (int i = 0; i < count; i++){
	    		System.out.println("ages: "+yeararray[i]);
	    	}
	    }
	
		
	}

	
		
	   
		
		
		
		
		
		
		
		

	

}
