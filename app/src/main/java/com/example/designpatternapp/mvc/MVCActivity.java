package com.example.designpatternapp.mvc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.designpatternapp.R;
import com.example.designpatternapp.util.MyModel;

public class MVCActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        textView = findViewById(R.id.textView);
    }

    public MyModel GetAppFromModel(){
        return new MyModel("My Design Pattern App", 1000000,4);
    }

    public void DisplayNameInApp(View view) {
        textView.setText(GetAppFromModel().getAppName() + " Downloads " + GetAppFromModel().getAppDownloads() + " Rating " + GetAppFromModel().getAppRating());
    }
}