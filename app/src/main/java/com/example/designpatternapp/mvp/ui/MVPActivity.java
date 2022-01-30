package com.example.designpatternapp.mvp.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.designpatternapp.R;
import com.example.designpatternapp.mvp.callback.AppView;
import com.example.designpatternapp.mvp.presenter.AppPresenter;

public class MVPActivity extends AppCompatActivity implements AppView {

    TextView textView;
    // Linking Activity with Presenter
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        textView = findViewById(R.id.textView);

        // Instantiating the presenter
        appPresenter = new AppPresenter(this);
    }

    public void DisplayNameInApp(View view) {
        // Calling the presenter
        appPresenter.getAppName();
    }

    @Override
    public void onGetAppName(String string) {
        textView.setText(string);
    }
}