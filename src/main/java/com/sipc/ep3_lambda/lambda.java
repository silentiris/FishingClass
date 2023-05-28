package com.sipc.ep3_lambda;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.function.Function;
public class lambda {
    public void lambda(LambdaInterface lambdaInterface){
    }


    public static void add(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Function<String, Integer> s = Integer::parseInt;
        Integer i = s.apply("10");
        System.out.println(i);
        LambdaInterface lam = lambda::add;
        lam.lambdaTest(5);
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("jello");
                    }
                }
        ).start();
        Function<String,String> f01=(password)-> Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(f01.apply("123456"));
    }


}
