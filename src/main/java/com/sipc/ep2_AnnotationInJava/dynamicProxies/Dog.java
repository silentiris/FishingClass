package com.sipc.ep2_AnnotationInJava.dynamicProxies;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("猫猫，香香！");
    }
}
