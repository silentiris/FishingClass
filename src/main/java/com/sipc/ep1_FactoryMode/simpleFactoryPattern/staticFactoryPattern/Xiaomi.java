package com.sipc.ep1_FactoryMode.simpleFactoryPattern.staticFactoryPattern;

public class Xiaomi implements Phone{
    Xiaomi(){
        this.display();
    }
    @Override
    public void display() {
        System.out.println("xiaomi");
    }
}
