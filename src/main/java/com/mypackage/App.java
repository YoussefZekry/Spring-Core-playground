package com.mypackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("beans2.xml");

        //retrieve bean from spring container
        CalcInterface calc = context.getBean("CalcProxy",CalcInterface.class);
        System.out.println( calc.add(5, 4));
        System.out.println(calc.multi(5, 4));
        // context.registerShutdownHook();
    }
}
