package com.app.mvvmproject.view_models;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.FeedbackFragmentHandler;

public class FeedbackFragmentViewModel extends ViewModel {
    private FeedbackFragmentHandler feedbackFragmentHandler;
    private Context context;

    public FeedbackFragmentViewModel(FeedbackFragmentHandler feedbackFragmentHandler){
        this.feedbackFragmentHandler = feedbackFragmentHandler;
        this.context= feedbackFragmentHandler.getCurrentActivity();
    }
}
