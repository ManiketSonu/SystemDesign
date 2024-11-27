package com.mani.example.productservices.systemdesign.Prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(IntelligentStudent original) {
        super(original);
        this.iq = original.iq;
    }

    public IntelligentStudent(int age, String name, String univerSity, int iq) {
        super(age, name, univerSity);
        this.iq = iq;
    }
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
