package org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("companyName");
	}
public void companyId() {
	System.out.println("companyId");
}
public void companyAddress() {
	System.out.println("companyAddress");
}
public static void main(String[] args) {
	CompanyInfo data = new CompanyInfo ();
			data.companyAddress();
	data.companyId();
	data.companyName();
}
}
