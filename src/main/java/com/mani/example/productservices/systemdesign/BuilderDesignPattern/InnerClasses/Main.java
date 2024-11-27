package com.mani.example.productservices.systemdesign.BuilderDesignPattern.InnerClasses;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}
