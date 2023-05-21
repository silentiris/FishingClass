package com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable{
    @Override
    public void drinkCoffee() {
        System.out.println("ArtDecoCoffeeTable");
    }
}
