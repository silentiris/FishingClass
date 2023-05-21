package com.sipc.ep1_FactoryMode.abstractFactory.Factory;

import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.Chair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.CoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
