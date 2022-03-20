package com.learnJava.methodreferences;

import com.learnJava.data.Student;

import java.util.function.Supplier;

public class SupplierMethodReferenceExample {


    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get());
    }
}
