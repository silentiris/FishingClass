package com.sipc.ep1_FactoryMode.factoryPattern.Pruduct;

public class PngReader implements Reader {
    @Override
    public void read() {
        System.out.print("read png");
    }
}