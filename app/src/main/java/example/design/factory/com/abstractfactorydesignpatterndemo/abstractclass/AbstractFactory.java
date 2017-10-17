package example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Color;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;

/**
 * Created by Guest User on 10/17/2017.
 */

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
    public abstract ILoginAuthorization getLogin(String login);
}
