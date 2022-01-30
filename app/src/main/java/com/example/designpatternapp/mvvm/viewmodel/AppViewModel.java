package com.example.designpatternapp.mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.designpatternapp.util.MyModel;

/**
 * Created by DevayaSid on 30/01/22.
 */
public class AppViewModel extends ViewModel {

    // Live Data
    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    // This act as a bridge b/w ViewModel and Model
    public MyModel GetAppFromModel(){
        return new MyModel("My Design Pattern App", 1000000,4);
    }

    // This act as a bridge b/w ViewModel and View
    public void getAppName(){
        String appName = GetAppFromModel().getAppName();
        mutableLiveData.setValue(appName);
    }

}
