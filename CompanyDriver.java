package com.classes.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CompanyDriver {
     public void validate_option(String option) throws Exception{
    	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 int cid = 0;
		 CompanyBean e1 = new CompanyBean();
		switch(option.toLowerCase()) {
			case "c":
			    
			    e1.createCompany();
				//System.out.println("it will create an employee ");
				bot();
			case "u":
				System.out.println("Enter the Company Id : ");
			    cid = Integer.parseInt(in.readLine());
				System.out.println("Enter the Detail location to be changed : ");
				String location = in.readLine();
				
				e1.update(cid , location);
				//System.out.println("it will update an Company");
				bot();
			case "r":
				System.out.println("Enter the company Id : ");
			    cid = Integer.parseInt(in.readLine());
				e1.retrieve(cid);
				//System.out.println("it will retrieve an employee!!");
				bot();
			case "d":
				System.out.println("Enter the Company Id : ");
				cid = Integer.parseInt(in.readLine());
				e1.delete(cid);
				//System.out.println("it will delete an employee!!");
				bot();
			case "e":
				System.err.println("You Have Exited the Code!!");
				System.exit(0);
				
		}
	}
     public static void main(String args[])throws Exception {
     	CompanyDriver de = new CompanyDriver();
     	de.bot();
     	
      }
      public void bot()throws Exception {
     	 String option = "";
     	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     	 while(true) {
     		 
     		 System.out.println("Enter the Choices which you want to perform !!");
     		 System.out.println("C --> Create");
     		 System.out.println("U --> Update");
     		 System.out.println("R --> Retrieve");
     		 System.out.println("D --> Delete");
     		 System.out.println("E --> Exit");
     		 option = in.readLine();
     		 validate_option(option);
     		 
     		 
     	 }
      }
}
