package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int b, i, d, y;
        int a, x;
        b = 0;
        d = 0;
        int n = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextByte();
        x = Math.abs(a);
        while (x >= 1) {
            b = b + 1;
            x = x / 2;
        }
        if ((b >= 0) & (b <= 8)) {
            System.out.println("byte");
            n = n + 1;
        }
        if ((b > 8) & (b <= 16)) {
            System.out.println("byte short");
            n = n + 1;
        }
        if ((b > 16) & (b <= 32)) {
            System.out.println("byte short int");
            n = n + 1;
        }
        if ((b > 32) & (b <= 64)) {
            System.out.println("byte short int long");
            n = n + 1;
        }
        if (a >= 0) {
            int[] c;
            c = new int[b];
            while (a > 1) {
                d = d + 1;
                c[d] = a % 2;
                a = a / 2;
            }
            System.out.print("1");
            for (i = 1; i <= d; i++) {
                System.out.print(c[d - i + 1]);
            }
        }
        if (a < 0) {
            if (n == 1) {
                int[] c;
                y = Math.abs(a);
                c = new int[8];
                //               for (i=0;i<(8-b);i++) {
                //                System.out.print("1");
//                }
                d = b;
                while (y >= 1) {
                    c[d] =1 - y % 2;
                    d = d - 1;
                    y = y / 2;
                }
                switch (c[b]) {
                    case 0:
                        c[b] =1;
                        break;
                    case 1:
                        c[b] = 0;
                        for (i=1;i<b-1;i++){
                            if(c[i+1] == 0)
                                break;
                            while (c[b+i] == 1){
                                c[b+1] = 0;
                            }
                        }
                        break;
                }
                    for (i = 1; i <= b; i++) {
                        System.out.print(c[i]);
                    }

                }
            }
        }
    }