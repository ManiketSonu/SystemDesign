package com.mani.example.productservices.systemdesign.Decorator;

public class AirBagDecorator extends CarDecorator {

    public AirBagDecorator(Car car) {
        super(car);
    }

    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Air Bag feature in a car");
    }
}
