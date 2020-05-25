package com.app.mvvmproject.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.app.mvvmproject.R;
import com.app.mvvmproject.handlers.ConfirmedFragmentHandler;
import com.app.mvvmproject.handlers.ConfirmingProcessFragmentHandler;
import com.app.mvvmproject.handlers.FeedbackFragmentHandler;
import com.app.mvvmproject.handlers.LiveClosedConfirmingFragmentHandler;
import com.app.mvvmproject.handlers.ProfileSettingsFragmentHandler;
import com.app.mvvmproject.handlers.MainActivityHandler;
import com.app.mvvmproject.view_models.ConfirmedFragmentViewModel;
import com.app.mvvmproject.view_models.ConfirmingProcessFragmentViewModel;
import com.app.mvvmproject.view_models.FeedbackFragmentViewModel;
import com.app.mvvmproject.view_models.LiveClosedConfirmingFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;
import com.app.mvvmproject.view_models.ProfileSettingsFragmentViewModel;

import java.util.Objects;

public class Utilities {

    public static Bitmap getResizedPointer(Context context) {
        Bitmap b = ((BitmapDrawable)context.getDrawable(R.drawable.location_pointer)).getBitmap();
        return Bitmap.createScaledBitmap(b, 80, 110, false);
    }

    public static ProfileSettingsFragmentViewModel initProfileSettingsFragmentViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner, final ProfileSettingsFragmentHandler profileSettingsFragmentHandler){
        return new ViewModelProvider(viewModelStoreOwner,new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new ProfileSettingsFragmentViewModel(profileSettingsFragmentHandler)));
            }
        }).get(ProfileSettingsFragmentViewModel.class);
    }

    public static MainActivityViewModel initTokenGenerationActivityViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner, final MainActivityHandler mainActivityHandler){
        return new ViewModelProvider(viewModelStoreOwner,new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new MainActivityViewModel(mainActivityHandler)));
            }
        }).get(MainActivityViewModel.class);
    }


    public static ConfirmingProcessFragmentViewModel initConfirmingProcessFragmentViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner,final ConfirmingProcessFragmentHandler confirmingProcessFragmentHandler){
        return new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new ConfirmingProcessFragmentViewModel(confirmingProcessFragmentHandler)));
            }
        }).get(ConfirmingProcessFragmentViewModel.class);
    }

    public static ConfirmedFragmentViewModel initConfirmedFragmentViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner, final ConfirmedFragmentHandler confirmedFragmentHandler){
        return new ViewModelProvider(viewModelStoreOwner,new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new ConfirmedFragmentViewModel(confirmedFragmentHandler)));
            }
        }).get(ConfirmedFragmentViewModel.class);
    }


    public static FeedbackFragmentViewModel initFeedbackFragmentViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner, final FeedbackFragmentHandler feedbackFragmentHandler){
        return new ViewModelProvider(viewModelStoreOwner,new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new FeedbackFragmentViewModel(feedbackFragmentHandler)));
            }
        }).get(FeedbackFragmentViewModel.class);
    }

    public static LiveClosedConfirmingFragmentViewModel initLiveClosedConfirmingFragmentViewModelInstance(final ViewModelStoreOwner viewModelStoreOwner, final LiveClosedConfirmingFragmentHandler liveClosedConfirmingFragmentHandler){
        return new ViewModelProvider(viewModelStoreOwner,new ViewModelProvider.Factory(){
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return Objects.requireNonNull(modelClass.cast(new LiveClosedConfirmingFragmentViewModel(liveClosedConfirmingFragmentHandler)));
            }
        }).get(LiveClosedConfirmingFragmentViewModel.class);
    }


}
