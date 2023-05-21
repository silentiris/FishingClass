package com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void drinkCoffee() {
        System.out.println("ModernCoffeeTable");
    }
}
