package com.mani.example.productservices.systemdesign.Factory;

public class IOSUiFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
