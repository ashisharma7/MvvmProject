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
import com.app.mvvmproject.databinding.FragmentFeedbackBinding;
import com.app.mvvmproject.handlers.FeedbackFragmentHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.FeedbackFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;

public class FeedbackFragment extends BaseFragment implements FeedbackFragmentHandler {
    private FragmentFeedbackBinding fragmentFeedbackBinding;
    private FeedbackFragmentViewModel feedbackFragmentViewModel;
    private MainActivityViewModel mainActivityViewModel;


    public FeedbackFragment(MainActivityViewModel mainActivityViewModel){
        this.mainActivityViewModel = mainActivityViewModel;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);
        fragmentFeedbackBinding = DataBindingUtil.bind(view);

        feedbackFragmentViewModel = Utilities
                .initFeedbackFragmentViewModelInstance(this,this);
        fragmentFeedbackBinding.setViewModel(feedbackFragmentViewModel);

        return view;
    }


    @Override
    public AppCompatActivity getCurrentActivity() {
        return mainActivityViewModel.getCurrentActivity();
    }
}
