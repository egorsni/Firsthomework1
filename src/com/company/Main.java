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
        a = in.nextInt();
        x = Math.abs(a);
        while (x >= 1) {
            b = b + 1;
            x = x / 2;
        }
        if ((b > 0) & (b <= 8)) {
            System.out.println("byte short int long");
            n = 1;
        }
        if ((b > 8) & (b <= 16)) {
            System.out.println("short int long");
            n = 2;
        }
        if ((b > 16) & (b <= 32)) {
            System.out.println("int long");
            n = 3;
        }
        if ((b > 32) & (b <= 64)) {
            System.out.println("long");
            n = 4;
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
                               for (i=0;i<(8-b);i++) {
                                System.out.print("1");
               }
                d = b;
                int[] c;
                y = Math.abs(a);
                c = new int[b+1];
                while ((y > 1) & (d>=0)){
                    c[d] =1 - y % 2;
                    d = d - 1;
                    y = y / 2;
                }
                switch (c[b]) {
                    case 0:
                        c[b] =1;
                        break;
                    case 1:
                        c[b] = 2;
                        break;
                }
                for (i=b;i>1;i--)
                        if(c[i] == 2){
                            c[i] = 0;
                            c[i-1] = c[i-1] +1;
                        }

                    for (i = 1; i <= b; i++) {
                        System.out.print(c[i]);
                    }

                }
            if (n == 2) {
                for (i=0;i<(16-b);i++) {
                    System.out.print("1");
                }
                d = b;
                int[] c;
                y = Math.abs(a);
                c = new int[b+1];
                while ((y > 1) & (d>=0)){
                    c[d] =1 - y % 2;
                    d = d - 1;
                    y = y / 2;
                }
                switch (c[b]) {
                    case 0:
                        c[b] =1;
                        break;
                    case 1:
                        c[b] = 2;
                        break;
                }
                for (i=b;i>1;i--)
                    if(c[i] == 2){
                        c[i] = 0;
                        c[i-1] = c[i-1] +1;
                    }

                for (i = 1; i <= b; i++) {
                    System.out.print(c[i]);
                }

            }
            if (n == 3) {
                for (i=0;i<(32-b);i++) {
                    System.out.print("1");
                }
                d = b;
                int[] c;
                y = Math.abs(a);
                c = new int[b+1];
                while ((y > 1) & (d>=0)){
                    c[d] =1 - y % 2;
                    d = d - 1;
                    y = y / 2;
                }
                switch (c[b]) {
                    case 0:
                        c[b] =1;
                        break;
                    case 1:
                        c[b] = 2;
                        break;
                }
                for (i=b;i>1;i--)
                    if(c[i] == 2){
                        c[i] = 0;
                        c[i-1] = c[i-1] +1;
                    }

                for (i = 1; i <= b; i++) {
                    System.out.print(c[i]);
                }

            }
            if (n == 4) {
                for (i=0;i<(64-b);i++) {
                    System.out.print("1");
                }
                d = b;
                int[] c;
                y = Math.abs(a);
                c = new int[b+1];
                while ((y > 1) & (d>=0)){
                    c[d] =1 - y % 2;
                    d = d - 1;
                    y = y / 2;
                }
                switch (c[b]) {
                    case 0:
                        c[b] =1;
                        break;
                    case 1:
                        c[b] = 2;
                        break;
                }
                for (i=b;i>1;i--)
                    if(c[i] == 2){
                        c[i] = 0;
                        c[i-1] = c[i-1] +1;
                    }

                for (i = 1; i <= b; i++) {
                    System.out.print(c[i]);
                }

            }
            }
        }
    }