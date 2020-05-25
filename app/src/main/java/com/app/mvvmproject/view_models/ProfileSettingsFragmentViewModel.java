package com.app.mvvmproject.view_models;

import android.content.Context;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.ProfileSettingsFragmentHandler;
import com.app.mvvmproject.models.ProfileSettingsFragmentModel;

public class ProfileSettingsFragmentViewModel extends ViewModel  {
    private ProfileSettingsFragmentHandler profileSettingsFragmentHandler;
    private Context context;
    public ProfileSettingsFragmentModel profileSettingsFragmentModel;

    public ProfileSettingsFragmentViewModel(ProfileSettingsFragmentHandler profileSettingsFragmentHandler){
        this.profileSettingsFragmentHandler = profileSettingsFragmentHandler;
        this.context = profileSettingsFragmentHandler.getCurrentActivity();
        profileSettingsFragmentModel = new ProfileSettingsFragmentModel();
    }

    public void onSendOtpClicked(View view){
        profileSettingsFragmentHandler.showToast("Send OTP Clicked");
    }

    public void onLogoutClicked(View view){
        profileSettingsFragmentHandler.showToast("Logout Clicked");
    }

    public void onSaveClicked(View view){
        profileSettingsFragmentHandler.showToast("Save Clicked");
    }


}
