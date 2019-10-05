package com.company.day01.example02;

import java.util.Scanner;

public class Triangle {
    static float a;
    static float b;
    static float c;

    static Scanner scanner = new Scanner(System.in);

    public void inputEdge(){
        System.out.println("Enter the a: ");
        a = scanner.nextInt();
        System.out.println("Enter the b: ");
        b = scanner.nextInt();
        System.out.println("Enter the c: ");
        c = scanner.nextInt();
    }
    public void show(){
        System.out.println("The a: "+a);
        System.out.println("The b: "+b);
        System.out.println("The c: "+c);
        System.out.printf("P = %.2f",perimeter());
        System.out.printf("S = %.2f",area());
    }
    public static float perimeter(){
        return a+b+c;
    }
    public static float area(){
        float p = perimeter()/2;
        float area = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
