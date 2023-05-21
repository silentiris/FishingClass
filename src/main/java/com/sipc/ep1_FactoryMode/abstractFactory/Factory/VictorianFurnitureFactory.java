package com.sipc.ep1_FactoryMode.abstractFactory.Factory;

import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.Chair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.VictorianChair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.CoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.VictorianCoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.Sofa;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
