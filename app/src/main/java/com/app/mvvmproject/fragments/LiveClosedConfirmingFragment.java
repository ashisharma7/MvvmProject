package com.app.mvvmproject.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mvvmproject.R;
import com.app.mvvmproject.databinding.FragmentLiveClosedConfirmingBinding;
import com.app.mvvmproject.handlers.LiveClosedConfirmingFragmentHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.LiveClosedConfirmingFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiveClosedConfirmingFragment extends BaseFragment implements LiveClosedConfirmingFragmentHandler {
    private MainActivityViewModel mainActivityViewModel;
    private FragmentLiveClosedConfirmingBinding fragmentLiveClosedConfirmingBinding;
    private LiveClosedConfirmingFragmentViewModel liveClosedConfirmingFragmentViewModel;


    public LiveClosedConfirmingFragment(MainActivityViewModel mainActivityViewModel) {
        this.mainActivityViewModel = mainActivityViewModel;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_live_closed_confirming, container, false);
        fragmentLiveClosedConfirmingBinding = DataBindingUtil.bind(view);
        liveClosedConfirmingFragmentViewModel = Utilities
                .initLiveClosedConfirmingFragmentViewModelInstance(this,this);


        fragmentLiveClosedConfirmingBinding.setViewModel(liveClosedConfirmingFragmentViewModel);
        return view;
    }

    @Override
    public AppCompatActivity getCurrentActivity() {
        return mainActivityViewModel.getCurrentActivity();
    }
}
