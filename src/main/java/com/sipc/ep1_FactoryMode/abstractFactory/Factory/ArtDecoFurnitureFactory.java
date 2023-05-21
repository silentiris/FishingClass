package com.sipc.ep1_FactoryMode.abstractFactory.Factory;

import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.ArtDecoChair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Chair.Chair;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.ArtDecoCoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.CoffeeTable.CoffeeTable;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.ArtDecoSofa;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
