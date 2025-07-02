package com.autobots.java.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {
        MathOperation addition =(a,b)->a+b;
        System.out.println("5+3=" +addition.operation(5,3));
        MathOperation multi=(a,b)-> a*b;
        System.out.println("5+3=" +multi.operation(5,3));


        //prinimaet obiekt ,return boolean
        Predicate <String> isNotEmpty=s-> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("Java"));

        Function<Integer,String> toStringFun=i ->"Chislo : "+i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print =s-> System.out.println("writing: "+s);
        print.accept("Hello world");
    }
}
