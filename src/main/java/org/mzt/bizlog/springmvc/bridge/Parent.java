package org.mzt.bizlog.springmvc.bridge;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author muzhantong
 * create on 2022/5/31 9:58 AM
 */
public class Parent<T> {
    AtomicInteger updateCount = new AtomicInteger();
    private T value;
    public void setValue(T value) {
        System.out.println("Parent.setValue called");
        this.value = value;
        updateCount.incrementAndGet();
    }

}
