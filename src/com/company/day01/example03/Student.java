package com.company.day01.example03;

import java.util.Scanner;

public class Student {
    private String name;
    private String birth;
    private String gender;
    private float gpa;
    private String moralClassifi;
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your birthday: ");
        birth = scanner.nextLine();
        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter gpa: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();//delete space
        System.out.println("Enter moral classification: ");
        moralClassifi = scanner.nextLine();
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Birthday: "+birth);
        System.out.println("Gender: "+gender);
        System.out.println("Gpa: "+gpa);
        System.out.println("Moral classification: "+moralClassifi);
    }
}
