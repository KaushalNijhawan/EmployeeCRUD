package com.classes.company;

import java.util.*;

import java.io.*;

public class CompanyBean {
	static HashMap<Integer ,CompanyDetails> company = new HashMap<>();

	public void createCompany() throws Exception {
		CompanyDetails c1 = new CompanyDetails();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name for the company :");
		c1.setCompany_name(in.readLine());
		System.out.println("Enter the Company Id : ");
		c1.setCompany_id(Integer.parseInt(in.readLine()));
		System.out.println("Enter the Company location :");
		c1.setCompany_location(in.readLine());
		System.out.println("Enter the Company Founder :");
		c1.setCompnay_founder(in.readLine());

		company.put(c1.getCompany_id() ,c1);

	}

	public void retrieve(int cid) {
		if (company.size() == 0) {
			System.err.println("there are no Companies created yet!!");
			return;
		} else {
			boolean found = false;
			if(company.get(cid)!= null){
				
					System.out.println(company.get(cid));
					found = true;
					
				
			}
			if (!found) {
				System.err.println("No value found!!");
				return;
			}

		}
		return;

	}

	public void delete(int cid) {
		if (company.size() == 0) {
			System.err.println("there are no Companies created yet!!");
			return;
		} else {
			boolean found = false;
			
				if (company.get(cid)!= null) {
					System.out.println("Company removed with values :" + company.get(cid).toString());
					company.remove(cid);
					found = true;
					
			}
			if (!found) {
				System.err.println("No value found!!");
				return;
			}

		}
		return;
	}

	public void update(int cid, String location) {
		if (company.size() == 0) {
			System.err.println("there are no Company created yet!!");
			return;
		} else {
			boolean found = false;
					if (company.get(cid)!= null) {
						company.get(cid).Company_location = location;
					System.out.println("updated values pf employee are : " + company.get(cid).toString());
					found = true;
					
				}
			
			if (!found) {
				System.err.println("No value found!!");
				return;
			}

		}
		return;
	}

}
