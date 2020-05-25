package com.app.mvvmproject.fragments;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.app.mvvmproject.handlers.BaseFragmentHandler;

public abstract class BaseFragment extends Fragment implements BaseFragmentHandler {

    @Override
    public void showToast(String message) {
        Toast.makeText(getCurrentActivity(),message,Toast.LENGTH_SHORT).show();
    }

}
