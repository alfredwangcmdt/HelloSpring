package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld objA=(HelloWorld)context.getBean("helloWorld");
//        objA.setMessage("I am Object A");
//        objA.getMessage();
////
//        HelloWorld objB=(HelloWorld)context.getBean("helloWorld");
//        objB.getMessage();

//        context.registerShutdownHook();

//        TextEditor te=(TextEditor)context.getBean("textEditor");
//        te.spellCheck();
//        System.out.println("main over");

        JavaCollection jc=(JavaCollection) context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

    }
}
