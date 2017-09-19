package com.tutorialspoint;

/**
 * Created by AlfredWang on 2017/9/19.
 */
public class HelloWorld {
    private String messagePri;
    public void setMessage(String messageIn){
    this.messagePri=messageIn;
}


    public void getMessage(){
        System.out.println("Your Message : "+messagePri);
    }

    public void init(){
        System.out.println("Bean is going through init");
    }

    public void destroy(){
        System.out.println("Bean will destroy now");
    }
}
