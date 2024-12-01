package com.mani.example.productservices.systemdesign.Factory;

import java.util.Objects;

public class Flutter {
    public void setThem()
    {
        System.out.println("Flutter set them");
    }

    public void refresh()
    {
        System.out.println("refresh the system design");
    }

//    public UIFactory getUiFactory(String platform)
//    {
//        if(Objects.equals(platform, "Android"))
//        {
//            return new AndroidUIFactory();
//        }
//        else if(Objects.equals(platform, "iOS"))
//        {
//            return new IOSUiFactory();
//        }
//        return null;
//    }
}
