package com.test.project.training;
import java.util.*;
public class DataSegregation {
	String Town;
	String Name;
	String Address;
	String Gender;
	int Contact;
	
	@SuppressWarnings("resource")
	void GetData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the town");
		Town=sc.nextLine();
		System.out.println("Enter the Name");
		Name=sc.nextLine();
		System.out.println("Enter the Address");
		Address=sc.nextLine();
		System.out.println("Enter the Gender");
		Gender=sc.nextLine();
		System.out.println("Enter the Contact");
		Contact=sc.nextInt();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of records to be stored");
		int n=sc.nextInt();
		DataSegregation[] D= new DataSegregation[n];
		for(int i=0;i<n;i++) {
			D[i]=new DataSegregation();
		}
		for(int i=0;i<n;i++) {
			D[i].GetData();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(D[i]);
		}
		
	String Male[]=new String[n];
	    String Female[]=new String[n];
		int i;
		for(i=0;i<n;i++) {
			if(D[i].Gender=="Male" || D[i].Gender=="male" || D[i].Gender=="m" || D[i].Gender=="M") {
				Male[i]= D[i].toString();
				System.out.println(Male[i]);
			}
			else if(D[i].Gender=="Female" || D[i].Gender=="female" || D[i].Gender=="f" || D[i].Gender=="F") {
				Female[i]= D[i].toString();
				System.out.println(Female[i]);
			}
		}
	}
}
