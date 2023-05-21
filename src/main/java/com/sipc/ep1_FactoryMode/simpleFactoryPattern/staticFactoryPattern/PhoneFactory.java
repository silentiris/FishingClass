package com.sipc.ep1_FactoryMode.simpleFactoryPattern.staticFactoryPattern;

public class PhoneFactory {
    public Phone makePhone(String phoneType){
        if(phoneType.equals("Iphone")){
            return new IPhone();
        } else if (phoneType.equals("Huawei")) {
            return new Huawei();
        }else if(phoneType.equals("Xiaomi")){
            return new Xiaomi();
        }
        return null;
    }
}
