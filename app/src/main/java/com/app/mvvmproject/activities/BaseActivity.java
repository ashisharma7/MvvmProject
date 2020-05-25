package com.app.mvvmproject.activities;

import android.annotation.SuppressLint;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.mvvmproject.handlers.BaseActivityHandler;

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity implements BaseActivityHandler {
    @Override
    public void showToast(String message) {
        Toast.makeText(getCurrentActivity(),message,Toast.LENGTH_SHORT).show();
    }
}
