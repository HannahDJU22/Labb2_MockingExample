package com.example;

import java.util.List;

public class TDDCalc {

//keeping old method for me to remember
/*    public int add(int a, int b, int... others) {
        int addingNumbers = a+b;
        for (int i:others) {
            addingNumbers +=i;
        }
        return addingNumbers;
    }*/

    public int add(List<Integer> numbers){
        Integer addingNumbers = 0;
        for (int i:numbers) {
            addingNumbers +=i;
        }
        return addingNumbers;
    }
}
