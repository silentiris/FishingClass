package com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair;

public class ModernChair implements Chair{
    @Override
    public void set() {
        System.out.println("ModernChair");
    }
}
