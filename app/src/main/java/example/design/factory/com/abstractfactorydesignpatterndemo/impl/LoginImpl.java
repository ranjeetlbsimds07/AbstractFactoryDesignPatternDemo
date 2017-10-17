package example.design.factory.com.abstractfactorydesignpatterndemo.impl;

import android.content.Context;

import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginAuthorization;
import example.design.factory.com.abstractfactorydesignpatterndemo.abstracts.ILoginCallBack;

/**
 * Created by Guest User on 10/17/2017.
 */

public class LoginImpl implements ILoginAuthorization {
    @Override
    public void login(Context context, ILoginCallBack.ILogin iLogin) {
        iLogin.onLogin("Success");
        iLogin.onLoginFail("failed");
    }
}
