package com.test.project.classpractice;
import java.util.*;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int b=0,a = 0, temp = 0,sum=0;
int i, n;
System.out.println("Enter the size");
n=sc.nextInt();

for(i=1;i<n;i++) {
//System.out.println("Enter the number");
b=i;
while(b>0) {
	a=b%10;
	b=b/10;
	sum=sum+(a*a*a);
}

if(i==sum)
	System.out.println(i);
	sum=0;
}
	}
	}