package com.classes.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class EmployeeBean {
    static ArrayList<Employee_Details> emp = new ArrayList<>();
	
    public void createEmployee() throws Exception{
		   Employee_Details e1 = new Employee_Details();
		   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the name for the Employee :");
		   e1.setEmp_name(in.readLine()); 
		   System.out.println("Enter the Employee Id : ");
		   e1.setEmp_id(Integer.parseInt(in.readLine())); 
		   System.out.println("Enter the Project name :");
		   e1.setProject_name(in.readLine());
		   System.out.println("Enter the Department name :");
		   e1.setDept_name(in.readLine());
		   
		   emp.add(e1);
		   
		   
		   
	   }
	public void retrieve(int empid) {
		if(emp.size() == 0) {
			System.err.println("there are no employees created yet!!");
			return;
		}else {
			boolean found = false;
			for(Employee_Details e : emp) {
				if(e.emp_id == empid) {
					System.out.println(e.toString());
					found = true;
					break;
				}
			}
			if(!found) {
				System.err.println("No value found!!");
				return;
			}
			
		}
		return;

	}
	public void delete(int empid) {
		if(emp.size() == 0) {
			System.err.println("there are no employees created yet!!");
			return;
		}else {
			boolean found = false;
			for(Employee_Details e : emp) {
				if(e.emp_id == empid) {
					emp.remove(e);
					System.out.println("Employee removed with values :" + e.toString());
					found = true;
					break;
				}
			}
			if(!found) {
				System.err.println("No value found!!");
				return;
			}
			
		}
		return;
	}
	
	
	public void update(int empid , String pname , String dname) {
		if(emp.size() == 0) {
			System.err.println("there are no employees created yet!!");
			return;
		}else {
			boolean found = false;
			for(Employee_Details e : emp) {
				if(e.emp_id == empid) {
					if(pname.length()!= 0 && dname.length()!= 0) {
						e.Dept_name = dname;
						e.Project_name = pname;
					}else if(pname.length()!= 0) {
						e.Project_name = pname;
					}else if(dname.length()!= 0) {
						e.Dept_name = dname;
					}
					System.out.println("updated values pf employee are : " + e.toString());
					 found = true;
					 break;
				}
			}
			if(!found) {
				System.err.println("No value found!!");
				return;
			}
			
		}
		return;
	}
	
	
	 
	   
}
