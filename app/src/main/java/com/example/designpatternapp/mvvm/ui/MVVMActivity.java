package com.example.designpatternapp.mvvm.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.designpatternapp.R;
import com.example.designpatternapp.databinding.ActivityMvvmBinding;
import com.example.designpatternapp.mvvm.viewmodel.AppViewModel;

public class MVVMActivity extends AppCompatActivity {

    // Linking Activity with ViewModel
    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // View Binding
        ActivityMvvmBinding binding = ActivityMvvmBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Instantiating the view model
        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        // Data Binding
        binding.setViewModel(appViewModel);
        binding.setLifecycleOwner(this);
    }
}