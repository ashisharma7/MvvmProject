package com.app.mvvmproject.handlers;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public interface BaseActivityHandler {
    void showToast(String message);

    AppCompatActivity getCurrentActivity();
}
