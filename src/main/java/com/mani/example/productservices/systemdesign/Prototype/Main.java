package com.mani.example.productservices.systemdesign.Prototype;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(20,"XYZ","ABC");
        Student copy = s.clone();

        System.out.println("copy");

        Student is = new IntelligentStudent(10, "XYZZ", "ABCD", 100);

        Student copy2 = is.clone();
        System.out.println("copy2");
    }
}
