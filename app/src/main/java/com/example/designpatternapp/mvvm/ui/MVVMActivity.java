package com.example.designpatternapp.mvvm.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.designpatternapp.R;
import com.example.designpatternapp.mvvm.viewmodel.AppViewModel;

public class MVVMActivity extends AppCompatActivity {

    TextView textView;
    // Linking Activity with ViewModel
    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        textView = findViewById(R.id.textView);

        // Instantiating the presenter
        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);
        appViewModel.mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
    }

    public void DisplayNameInApp(View view) {
        // Calling the presenter
        appViewModel.getAppName();
    }
}