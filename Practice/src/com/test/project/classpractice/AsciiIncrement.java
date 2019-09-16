package com.test.project.classpractice;
import java.util.*;
public class AsciiIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char a=sc.next().charAt(0);
int b= (int) a;
b=b+5;
char c= (char) b;
System.out.println("The incremented char is : " + c);
	}

}
