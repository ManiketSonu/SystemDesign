package com.mani.example.productservices.systemdesign.Factory;

public class IOSButton implements Button{
    @Override
    public void cahngeSize() {
        System.out.println("IOS button size is changing");
    }
}
