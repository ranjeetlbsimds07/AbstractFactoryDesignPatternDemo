package example.design.factory.com.abstractfactorydesignpatterndemo.factoryclass;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass.AbstractFactory;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Color;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Circle;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Rectangle;
import example.design.factory.com.abstractfactorydesignpatterndemo.impl.Square;

/**
 * Created by Guest User on 10/17/2017.
 */

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public ILoginAuthorization getLogin(String login) {
        return null;
    }

}
