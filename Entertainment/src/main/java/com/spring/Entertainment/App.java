package com.spring.Entertainment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Entertainment.xml");
       Entertainment Ent=(Entertainment)context.getBean("ente1");
       System.out.println(Ent);
    }
}
