package com.mani.example.productservices.systemdesign.Decorator;

public class Main {
    public static void main(String[] args) {
        Car sportcar = new BasicCar();
        Car airBagDecorator = new AirBagDecorator(sportcar);
        Car airBagDecoratorwithGearBox = new AirBagDecorator(airBagDecorator);
        airBagDecoratorwithGearBox.assemble();
    }
}
