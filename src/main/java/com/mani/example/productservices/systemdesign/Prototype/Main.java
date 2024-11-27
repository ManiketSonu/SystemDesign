package com.mani.example.productservices.systemdesign.Prototype;

public class Main {

    public static final String STUDENT_PROTOTYPE = "Student";
    public static final String INT_STUDENT_PROTOTYPE = "Student";

    public static void main(String[] args) {
        setupRegistory();
//        Student s = new Student(20,"XYZ","ABC");
//        Student copy = s.clone();
//
//        System.out.println("copy");
//
//        Student is = new IntelligentStudent(10, "XYZZ", "ABCD", 100);
//
//        Student copy2 = is.clone();
//        System.out.println("copy2");

        Student copy = StudentRegistory.getInstance().get(STUDENT_PROTOTYPE).clone();
        Student iscopt = StudentRegistory.getInstance().get(INT_STUDENT_PROTOTYPE).clone();
        System.out.println("Debug");
    }

    public static void setupRegistory(){
        StudentRegistory registory = StudentRegistory.getInstance();
        Student prototypeStudent = new Student(20,"XYZ","ABC");
        Student prototypeIntelligentStudent = new IntelligentStudent(10, "XYZZ", "ABCD", 100);

        registory.registor(STUDENT_PROTOTYPE, prototypeStudent);
        registory.registor(STUDENT_PROTOTYPE, prototypeIntelligentStudent);
    }
}
