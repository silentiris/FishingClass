package com.sipc.ep1_FactoryMode.factoryPattern.Pruduct;

public class JpgReader implements Reader {
    @Override
    public void read() {
        System.out.print("read jpg");
    }
}