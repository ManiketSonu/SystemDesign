package com.mani.example.productservices.systemdesign.BuilderDesignPattern.BasicVersion;

public class Student {

    //Compulsory
    String name;
    String email;
    int age; //condition is age > 18

    //optional
    String university;
    int yearOfGraduation;

    public Student(Builder helper) throws Exception
    {
        if(helper.age<18)
        {
            throw new Exception("Age should be greater than 18");
        }

        if(!(helper.name!=null && helper.email!=null))
        {
            throw new Exception("Name and email should not be null");
        }

        this.name = helper.name;
        this.email = helper.email;
        this.age = helper.age;
        this.university = helper.university;
        this.yearOfGraduation = helper.yearOfGraduation;
    }
}
