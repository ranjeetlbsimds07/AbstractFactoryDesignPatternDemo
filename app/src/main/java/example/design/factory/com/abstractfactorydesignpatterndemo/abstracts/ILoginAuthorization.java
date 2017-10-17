package example.design.factory.com.abstractfactorydesignpatterndemo.abstracts;

import android.content.Context;

/**
 * Created by Guest User on 10/16/2017.
 */

public interface ILoginAuthorization {
    void login(Context context, ILoginCallBack.ILogin iLogin);
}
