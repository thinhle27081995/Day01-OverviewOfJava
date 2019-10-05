package com.company.day01.example01;

import java.util.Scanner;

public class Trapezium {
    //Enter in 3 edge
    static int a;
    static int b;
    static int h;

    static Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Enter the a edge: ");
        a=scanner.nextInt();
        System.out.println("Enter the b edge: ");
        b=scanner.nextInt();
        System.out.println("Enter the high h: ");
        h=scanner.nextInt();
    }
    public void show(){
        System.out.println("Edge a: "+a);
        System.out.println("Edge b: "+b);
        System.out.println("High a: "+h);
        System.out.printf("Area : %.2f",area());
    }
    public float area(){
        return (float)(a+b)*h/2;
    }
}
