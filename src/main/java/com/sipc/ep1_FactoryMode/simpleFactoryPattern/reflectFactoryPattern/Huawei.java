package com.sipc.ep1_FactoryMode.simpleFactoryPattern.reflectFactoryPattern;

public class Huawei implements Phone {
    Huawei(){
        this.display();
    }
    @Override
    public void display() {
        System.out.println("4g+harmony>5g");
    }
}
