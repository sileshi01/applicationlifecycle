package com.example.springdocker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-05-17
 * Time:
 * Project:springdocker
 * Copyright: MIT
 */
class MyMathCalcTest {

   MyMathCalc m = new MyMathCalc();
    @Test
    void add() {
        //MyMathCalc m = new MyMathCalc();
        int actual = m.add(4,2);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        //MyMathCalc m = new MyMathCalc();
        int actual = m.multiply(4,2);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        //MyMathCalc m = new MyMathCalc();
        double actual = m.divide(4,2);
        int expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    void divide_throws() {
        //MyMathCalc m = new MyMathCalc();
        //m.divide(4,2);
        assertThrows(ArithmeticException.class,()->m.divide(4,0));
    }
}