package com.sipc.ep1_FactoryMode.abstractFactory.Factory;

import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.Chair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.ModernChair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.CoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.ModernCoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.ModernSofa;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
