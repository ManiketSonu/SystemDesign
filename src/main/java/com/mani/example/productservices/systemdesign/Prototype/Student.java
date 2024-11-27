package com.mani.example.productservices.systemdesign.Prototype;

public class Student {
    private int age;
    public String name;
    public String univerSity;

    public Student(int age, String name, String univerSity) {
        this.age = age;
        this.name = name;
        this.univerSity = univerSity;
    }

    public Student(Student original)
    {
        this.age = original.age;
        this.name = original.name;
        this.univerSity = original.univerSity;
    }

    public Student clone()
    {
        return new Student(this);
    }
}
