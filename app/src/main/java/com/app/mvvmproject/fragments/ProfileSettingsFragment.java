package com.app.mvvmproject.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mvvmproject.R;
import com.app.mvvmproject.databinding.FragmentProfileSettingsBinding;
import com.app.mvvmproject.handlers.ProfileSettingsFragmentHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.ProfileSettingsFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;

public class ProfileSettingsFragment extends BaseFragment implements ProfileSettingsFragmentHandler {
    private FragmentProfileSettingsBinding fragmentProfileSettingsBinding;
    private ProfileSettingsFragmentViewModel profileSettingsFragmentViewModel;
    private MainActivityViewModel mainActivityViewModel;


    public ProfileSettingsFragment(MainActivityViewModel mainActivityViewModel){
        this.mainActivityViewModel = mainActivityViewModel;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_settings, container, false);
        fragmentProfileSettingsBinding = DataBindingUtil.bind(view);

        profileSettingsFragmentViewModel = Utilities.initProfileSettingsFragmentViewModelInstance(this,this);

        fragmentProfileSettingsBinding.setViewModel(profileSettingsFragmentViewModel);

        return view;
    }


    @Override
    public AppCompatActivity getCurrentActivity() {
        return mainActivityViewModel.getCurrentActivity();
    }
}
