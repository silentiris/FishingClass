package com.sipc.ep2_AnnotationInJava.dynamicProxies;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        AnimalHandler animalHandler = new AnimalHandler(new Cat());
        Animal cat = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),new Class[]{Animal.class},animalHandler);
        cat.eat();
        AnimalHandler doghandler = new AnimalHandler(new Dog());
        Animal dog = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),new Class[]{Animal.class},doghandler);
        dog.eat();
    }
}
