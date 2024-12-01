package com.mani.example.productservices.systemdesign.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
//        UIFactory uif = flutter.getUiFactory("iOS");
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(Supportedplatform.ANDROID);
        Button b = uiFactory.createButton();
        b.cahngeSize();
    }
}
