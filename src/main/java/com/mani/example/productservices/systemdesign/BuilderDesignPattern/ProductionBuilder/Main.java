package com.mani.example.productservices.systemdesign.BuilderDesignPattern.ProductionBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        //Make the Builder a static inner class
        //Hide the Builder class via creating the static method in Student (get Builder)
        //In all the setter of builder return all the builder object class
        Student sb = Student.getBuilder()
                .setAge(16)
                .setYearOfGraduation(2024)
                .setUniversity("Galgotias")
                .setName("Maniket")
                .setEmail("Mani@gmail.com").build();
    }
}
