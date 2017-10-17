package example.design.factory.com.abstractfactorydesignpatterndemo.impl;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;

/**
 * Created by Guest User on 10/17/2017.
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
