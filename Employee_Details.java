package com.classes.problem;
import java.util.*;
import java.io.*;
public class Employee_Details {
   String Emp_name;
   String Project_name;
   String Dept_name;
   int emp_id;
  
   public String getEmp_name() {
	return Emp_name;
}

public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}

public String getProject_name() {
	return Project_name;
}

public void setProject_name(String project_name) {
	Project_name = project_name;
}

public String getDept_name() {
	return Dept_name;
}

public void setDept_name(String dept_name) {
	Dept_name = dept_name;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

@Override
public String toString() {
	return "Employee_Details with Emp_name=" + Emp_name + ", Project_name=" + Project_name + ", Dept_name=" + Dept_name
			+ ", emp_id=" + emp_id ;
}


   
    
   
     
}
