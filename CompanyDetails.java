package com.classes.company;

public class CompanyDetails {
	String Company_name;
	String Company_location;
	int Company_id;
	String Compnay_founder;

	public String getCompany_name() {
		return Company_name;
	}

	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}

	public String getCompany_location() {
		return Company_location;
	}

	public void setCompany_location(String company_location) {
		Company_location = company_location;
	}

	public int getCompany_id() {
		return Company_id;
	}

	public void setCompany_id(int company_id) {
		Company_id = company_id;
	}

	public String getCompnay_founder() {
		return Compnay_founder;
	}

	public void setCompnay_founder(String compnay_founder) {
		Compnay_founder = compnay_founder;
	}

	@Override
	public String toString() {
		return "CompanyDetails [Company_name=" + Company_name + ", Company_location=" + Company_location
				+ ", Company_id=" + Company_id + ", Compnay_founder=" + Compnay_founder + "]";
	}

}
