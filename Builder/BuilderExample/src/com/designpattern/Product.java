package com.designpattern;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("Product constructed as below : ");
        for (int i=0;i< parts.size();i++) {
            System.out.println(parts.get(i));
        }
    }
}
