package com.classes.problem;
import java.io.*;
import java.util.ArrayList;
public class Driver_Employee {
     
	public void validate_option(String option) throws Exception{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 int empid = 0;
		 EmployeeBean e1 = new EmployeeBean();
		switch(option.toLowerCase()) {
			case "c":
			    
			    e1.createEmployee();
				//System.out.println("it will create an employee ");
				bot();
			case "u":
				System.out.println("Enter the Employee Id : ");
			    empid = Integer.parseInt(in.readLine());
				System.out.println("Enter the Detail to be changed : ");
				String detail = in.readLine();
				String pname = "";
				String dname = "";
				if(detail.equalsIgnoreCase("Project Name")) {
					pname = in.readLine();
				}else if(detail.equalsIgnoreCase("Deartment Name")) {
					dname = in.readLine();
				}
				e1.update(empid, pname, dname);
				System.out.println("it will create an employee");
				bot();
			case "r":
				System.out.println("Enter the Employee Id : ");
			    empid = Integer.parseInt(in.readLine());
				e1.retrieve(empid);
				//System.out.println("it will retrieve an employee!!");
				bot();
			case "d":
				System.out.println("Enter the Employee Id : ");
				empid = Integer.parseInt(in.readLine());
				e1.delete(empid);
				//System.out.println("it will delete an employee!!");
				bot();
			case "exit":
				System.err.println("You Have Exited the Code!!");
				System.exit(0);
				
		}
		
	}
	public static void main(String args[])throws Exception {
    	Driver_Employee de = new Driver_Employee();
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
    		 
    		 option = in.readLine();
    		 validate_option(option);
    		 
    		 
    	 }
     }
}
