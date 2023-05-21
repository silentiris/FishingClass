package com.sipc.ep1_FactoryMode.abstractFactory;

import com.sipc.ep1_FactoryMode.abstractFactory.Factory.FurnitureFactory;
import com.sipc.ep1_FactoryMode.abstractFactory.Factory.ModernFurnitureFactory;
import com.sipc.ep1_FactoryMode.abstractFactory.Product.Sofa.Sofa;

public class Demo {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Sofa sofa = furnitureFactory.createSofa();
        sofa.lay();
    }
}
