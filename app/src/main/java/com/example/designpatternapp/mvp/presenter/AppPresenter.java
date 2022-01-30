package com.example.designpatternapp.mvp.presenter;

import com.example.designpatternapp.mvp.callback.AppView;
import com.example.designpatternapp.util.MyModel;

/**
 * Created by DevayaSid on 30/01/22.
 */
public class AppPresenter {

    // This act as a bridge b/w Presenter and MainActivity
    AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    // This act as a bridge b/w Presenter and Model
    public MyModel GetAppFromModel(){
        return new MyModel("My Design Pattern App", 1000000,4);
    }

    // Calling the interface
    public void getAppName(){
        appView.onGetAppName(GetAppFromModel().getAppName());
    }
}
