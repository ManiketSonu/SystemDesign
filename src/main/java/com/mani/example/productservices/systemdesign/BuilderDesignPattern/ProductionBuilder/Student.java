package com.mani.example.productservices.systemdesign.BuilderDesignPattern.ProductionBuilder;

public class Student {
    //Compulsory
    String name;
    String email;
    int age; //condition is age > 18

    //optional
    String university;
    int yearOfGraduation;

    public static Builder getBuilder()
    {
        return new Builder();
    }

    private Student(Builder builder)
    {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }
    static class Builder{
        //Compulsory
        String name;
        String email;
        int age; //condition is age > 18

        //optional
        String university;
        int yearOfGraduation;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setYearOfGraduation(int yearOfGraduation) {
            this.yearOfGraduation = yearOfGraduation;
            return this;
        }

        public Student build() throws Exception {
            //validation here
            if(age<18)
            {
                throw new Exception("Age is not valid");
            }

            if(!(name!=null && email==null))
            {
                throw new Exception("Compulsory attributes are be present");
            }
            //call then constructor of student and return the student object
            return new Student(this);
        }
    }
}
