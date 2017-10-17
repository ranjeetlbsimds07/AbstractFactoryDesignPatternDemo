package example.design.factory.com.abstractfactorydesignpatterndemo.factoryclass;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass.AbstractFactory;

/**
 * Created by Guest User on 10/17/2017.
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }else if(choice.equalsIgnoreCase("LOGIN")){
            return new LoginFactory();
        }

        return null;
    }

}
