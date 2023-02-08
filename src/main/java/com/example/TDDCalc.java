package com.example;

public class TDDCalc {


    public int add(int a, int b, int... others) {
        int addingNumbers = a+b;
        for (int i:others) {
            addingNumbers +=i;
        }
        return addingNumbers;
    }
}
