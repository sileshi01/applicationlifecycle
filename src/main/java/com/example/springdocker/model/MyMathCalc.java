package com.example.springdocker.model;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-05-14
 * Time: 12:45
 * Project:springdocker
 * Copyright: MIT
 */
public class MyMathCalc {


    public int add(int a,int b){

        return a + b;
    }
    public int multiply(int a,int b){

        return a*b;
    }

    public double divide(double a, double b){
        if (b==0)
            throw new ArithmeticException("get error division by " + 0);


        return a/b;
    }
}
