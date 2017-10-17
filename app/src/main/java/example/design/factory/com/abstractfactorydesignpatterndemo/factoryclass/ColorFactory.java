package example.design.factory.com.abstractfactorydesignpatterndemo.factoryclass;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass.AbstractFactory;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Color;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Blue;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Green;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Red;

/**
 * Created by Guest User on 10/17/2017.
 */

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public ILoginAuthorization getLogin(String login) {
        return null;
    }
}
