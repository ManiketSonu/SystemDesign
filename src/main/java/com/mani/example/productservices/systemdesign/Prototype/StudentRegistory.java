package com.mani.example.productservices.systemdesign.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistory {

    private static  StudentRegistory INSTANCE;

    private StudentRegistory()
    {
        map = new HashMap<>();
    }

    public static StudentRegistory getInstance()
    {
        if(INSTANCE==null)
        {
            INSTANCE = new StudentRegistory();
        }
        return INSTANCE;
    }

    private Map<String, Student> map;

    public void registor(String key, Student s)
    {
        map.put(key, s);
    }

    public Student get(String key)
    {
        return map.get(key);
    }
}
