package com.codingblocks;

import java.util.Scanner;

public class Methods {
    // return, name, parameters
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        converter(start, end, step);

    }

    public static void converter( int start, int end, int step){
        for (int i = start; i <= end; i += step) {
            int f = i;
            float c = (5f / 9) * (f - 32);        //float/int = float
            System.out.println(f + " : " + c);
        }
    }
}
