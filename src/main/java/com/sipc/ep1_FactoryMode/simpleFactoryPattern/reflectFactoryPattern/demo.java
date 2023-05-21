package com.sipc.ep1_FactoryMode.simpleFactoryPattern.reflectFactoryPattern;

import static com.sipc.ep1_FactoryMode.simpleFactoryPattern.reflectFactoryPattern.PhoneFactory.addPhoneMap;

public class demo {
    public static void main(String[] args) throws Exception {
        addPhoneMap("IPhone", IPhone.class);
        addPhoneMap("Xiaomi", Xiaomi.class);
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iphone = phoneFactory.makePhone("IPhone");
        Phone xiaomi = phoneFactory.makePhone("Xiaomi");
    }
}
