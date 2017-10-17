package example.design.factory.com.abstractfactorydesignpatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstractclass.AbstractFactory;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginCallBack;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.Shape;
import example.design.factory.com.abstractfactorydesignpatterndemo.factoryclass.FactoryProducer;

public class LoginActivity extends AppCompatActivity implements ILoginCallBack.ILogin {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        shape3.draw();

        //get Login Factory
        AbstractFactory loginFactory = FactoryProducer.getFactory("LOGIN");

        ILoginAuthorization iLogin = loginFactory.getLogin("Login");
        iLogin.login(LoginActivity.this, (ILoginCallBack.ILogin) LoginActivity.this);




    }

    @Override
    public void onLogin(String msg) {

        Log.d("SUCCESS", msg);
    }

    @Override
    public void onLoginFail(String msg) {
        Log.d("Failed", msg);
    }
}
