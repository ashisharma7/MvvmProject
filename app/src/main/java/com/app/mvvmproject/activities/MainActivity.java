package com.app.mvvmproject.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

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
        mainActivityViewModel = Utilities.initTokenGenerationActivityViewModelInstance(this,this);

       // showToast("Helllo");
    }


    @Override
    public AppCompatActivity getCurrentActivity() {
        return this;
    }

    @Override
    public void moveToFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityFragmentHolder,fragment)
                .commit();
    }

    @Override
    public void moveToFragmentWithBackStack(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityFragmentHolder,fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void closeActivity() {
        finish();
    }
}
