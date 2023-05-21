package com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void drinkCoffee() {
        System.out.println("VictorianCoffeeTable");
    }
}
