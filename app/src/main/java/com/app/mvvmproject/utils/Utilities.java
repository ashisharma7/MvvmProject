package com.app.mvvmproject.utils;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.app.mvvmproject.activities.MainActivity;
import com.app.mvvmproject.handlers.MainActivityHandler;
import com.app.mvvmproject.view_models.MainActivityViewModel;

import java.util.Objects;

public class Utilities {

    public static MainActivityViewModel initMainActivityViewModelInstance(final MainActivityHandler mainActivityHandler){
        return new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new MainActivityViewModel(mainActivityHandler)));
            }
        }.create(MainActivityViewModel.class);
    }
}
