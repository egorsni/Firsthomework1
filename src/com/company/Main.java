package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b,x,i,d;
	b = 0;
	d = 0;
	int y = 0;
        Scanner  in = new Scanner(System.in);
        a = in.nextInt();
        x=a;
        while (x >= 1 ) {
            b = b+1;
            x =  x/2;
        }
        int[] c;
        c = new int[b];
        while(a > 1)  {
            d  = d+1;
            c[d]  = a%2;
            a = a/2;
        }
        System.out.print("1");
        for (i=1;i<=d;i++){
            System.out.print(c[d-i+1]);
        }

    }
}
