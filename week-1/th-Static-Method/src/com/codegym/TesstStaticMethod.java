package com.codegym;
public class TesstStaticMethod {
    public static void main(String args[]) {
        Student.change();
        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(111,"Khanh");
        Student s3 = new Student(111,"Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
