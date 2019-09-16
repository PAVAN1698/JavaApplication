package com.spring.banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext app=new ClassPathXmlApplicationContext("banking.xml");
		Accountoperations A=(Accountoperations)app.getBean("Savings");
		 A.deposite();
		 A.interest();
    	 A=(Accountoperations)app.getBean("Current");
		 A.deposite();
		 A.interest();
		
    }
}
