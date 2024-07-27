package com.pkg;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int n=10;
        int f = 0;
        int s = 1;

        for(int i=0;i<n;i++){
            System.out.print(f+" ");
            int next = f + s;
            f = s;
            s = next;
        }

    }
}
