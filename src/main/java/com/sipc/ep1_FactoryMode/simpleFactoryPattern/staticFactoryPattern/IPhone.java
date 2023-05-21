package com.sipc.ep1_FactoryMode.simpleFactoryPattern.staticFactoryPattern;

public class IPhone implements Phone {
    IPhone(){
        this.display();
    }
    @Override
    public void display() {
        System.out.println("60hz+ios>120hz");
    }
}
