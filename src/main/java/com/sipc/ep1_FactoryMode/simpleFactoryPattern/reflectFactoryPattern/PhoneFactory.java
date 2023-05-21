package com.sipc.ep1_FactoryMode.simpleFactoryPattern.reflectFactoryPattern;


import java.util.HashMap;
import java.util.Map;

public class PhoneFactory {
    private static final Map<String,Class> phoneMap = new HashMap<>();
    public static void addPhoneMap(String phoneType,Class newPhone){
        phoneMap.put(phoneType,newPhone);
    }

    public Phone makePhone(String phoneType) throws Exception {
        Class phoneClass = phoneMap.get(phoneType);
        return (Phone) phoneClass.newInstance();
    }
}
