package com.mani.example.productservices.systemdesign.Decorator;

public class CarDecorator implements Car{

    protected Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }
    @Override
    public void assemble() {
        this.decoratedCar.assemble();
    }
}
