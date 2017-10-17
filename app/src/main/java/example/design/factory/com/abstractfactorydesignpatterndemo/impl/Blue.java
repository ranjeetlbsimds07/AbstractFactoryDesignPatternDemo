package example.design.factory.com.abstractfactorydesignpatterndemo.impl;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Color;

/**
 * Created by Guest User on 10/17/2017.
 */

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
