package org.mzt.bizlog.springmvc.bridge;

import java.lang.reflect.Method;

/**
 * @author muzhantong
 * create on 2022/5/31 9:58 AM
 */
public class Child extends Parent<String>{

    public static void main(String[] args) {
        Child child1 = new Child();
        Method[] declaredMethods = child1.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + "###" + declaredMethod.isBridge());
        }
        System.out.println(declaredMethods.length);
    }

    @Override
    public void setValue(String value) {
        System.out.println("Child1.setValue called");
        super.setValue(value);
    }
}
