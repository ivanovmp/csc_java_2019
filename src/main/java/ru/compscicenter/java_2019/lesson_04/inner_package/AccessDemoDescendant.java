package ru.compscicenter.java_2019.lesson_04.inner_package;

import ru.compscicenter.java_2019.lesson_04.AccessDemo;

public class AccessDemoDescendant extends AccessDemo {

    public AccessDemoDescendant(int packageField, int privateField, int publicField, int protectedField) {
        super(packageField, privateField, publicField, protectedField);
    }

    public int testAccessToProtectedField(){
        return protectedField;
    }
}
