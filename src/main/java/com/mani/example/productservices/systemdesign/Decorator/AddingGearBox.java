package com.mani.example.productservices.systemdesign.Decorator;

public class AddingGearBox extends CarDecorator{
    public AddingGearBox(Car car) {
        super(car);
    }

    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Gear Box feature");
    }
}
