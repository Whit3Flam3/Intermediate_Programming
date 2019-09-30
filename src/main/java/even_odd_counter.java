/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
import java.util.Random;

public class even_odd_counter {
    
    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Random r = new Random();

        int even = 0, odd = 0;

        for (int i = 0; i < 100; ++i) {

            int num = r.nextInt();

            if (isEven(num)) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.println("Number of Even numbers: " + even);

        System.out.println("Number of Odd numbers: " + odd);

    }
    
}
