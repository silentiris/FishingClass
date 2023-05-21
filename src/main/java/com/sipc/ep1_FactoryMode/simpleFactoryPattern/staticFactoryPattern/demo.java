package com.sipc.ep1_FactoryMode.simpleFactoryPattern.staticFactoryPattern;

public class demo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone xiaomi = phoneFactory.makePhone("Xiaomi");
    }
}
