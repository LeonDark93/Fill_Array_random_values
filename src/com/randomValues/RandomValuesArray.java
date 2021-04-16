package com.randomValues;
import java.util.Random;
public class RandomValuesArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(50);
            System.out.print(array[i]+" ");
        }
    }
}
