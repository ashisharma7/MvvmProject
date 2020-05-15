package com.app.mvvmproject.activities;

import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.app.mvvmproject.R;
import com.app.mvvmproject.databinding.ActivityMainBinding;
import com.app.mvvmproject.handlers.MainActivityHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.MainActivityViewModel;

public class MainActivity extends BaseActivity implements MainActivityHandler {
    private ActivityMainBinding activityMainBinding;
    private MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainActivityViewModel = Utilities.initMainActivityViewModelInstance(this);

        activityMainBinding.setViewModel(mainActivityViewModel);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
