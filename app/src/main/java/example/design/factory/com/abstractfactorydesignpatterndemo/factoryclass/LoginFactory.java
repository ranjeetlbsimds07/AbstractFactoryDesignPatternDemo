package example.design.factory.com.abstractfactorydesignpatterndemo.factoryclass;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass.AbstractFactory;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Color;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Circle;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.LoginImpl;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Rectangle;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Square;

/**
 * Created by Guest User on 10/17/2017.
 */

public class LoginFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public ILoginAuthorization getLogin(String login) {

        if(login == null){
            return null;
        }
        if(login.equalsIgnoreCase("Login")) {
            return new LoginImpl();

        }
        return null;
    }
}
