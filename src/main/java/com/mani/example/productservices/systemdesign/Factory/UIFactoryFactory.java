package com.mani.example.productservices.systemdesign.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Supportedplatform platform) {
        return switch (platform)
        {
            case IOS -> new IOSUiFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
