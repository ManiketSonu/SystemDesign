package com.mani.example.productservices.systemdesign.BuilderDesignPattern.BasicVersion;

public class Main {
    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setAge(50);
        builder.setName("Maniket Kumar");
        builder.setEmail("Mani@gmai.com");
        builder.setUniversity("Glagotias University");
        builder.setYearOfGraduation(2021);

        Student student = new Student(builder);
        System.out.println("Student object is ready");
    }
}
