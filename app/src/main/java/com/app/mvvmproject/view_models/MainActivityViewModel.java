package com.app.mvvmproject.view_models;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.fragments.ProfileSettingsFragment;
import com.app.mvvmproject.fragments.ConfirmedFragment;
import com.app.mvvmproject.fragments.ConfirmingProcessFragment;
import com.app.mvvmproject.fragments.FeedbackFragment;
import com.app.mvvmproject.fragments.LiveClosedConfirmingFragment;
import com.app.mvvmproject.handlers.MainActivityHandler;
import com.google.android.gms.maps.model.LatLng;

public class MainActivityViewModel extends ViewModel {
    private MainActivityHandler mainActivityHandler;
    private Context context;
    private ConfirmingProcessFragment confirmingProcessFragment;
    private ConfirmedFragment confirmedFragment;

    // 0 for confirming & 1 for confirmed
    private int currentState;

    public MainActivityViewModel(MainActivityHandler mainActivityHandler) {
        this.mainActivityHandler = mainActivityHandler;
        context = mainActivityHandler.getCurrentActivity();

        confirmingProcessFragment = new ConfirmingProcessFragment(this);
        confirmedFragment = new ConfirmedFragment(this);

        setState(0);
        mainActivityHandler.moveToFragmentWithBackStack(new LiveClosedConfirmingFragment(this));

        mainActivityHandler.moveToFragmentWithBackStack(new FeedbackFragment(this));

        mainActivityHandler.moveToFragmentWithBackStack(new ProfileSettingsFragment(this));

    }


    private void setState(int state) {
        if (state == 0)
            mainActivityHandler.moveToFragment(confirmingProcessFragment);
        else
            mainActivityHandler.moveToFragment(confirmedFragment);
        currentState = state;
    }

    public Fragment getState() {
        if (currentState == 0)
            return confirmingProcessFragment;
        else
            return confirmedFragment;
    }

    public void onConfirmButtonClick(View view) {
        setState(1);
    }

    public void onCancelAppointmentClicked(View view){
        setState(0);
    }

    public void onCancelorCloseButtonClick(View view) {
        mainActivityHandler.closeActivity();
    }


    public void onMapClicked(LatLng latLng){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?daddr=28.609290,77.172692"));
        context.startActivity(intent);
    }

    public AppCompatActivity getCurrentActivity(){
        return mainActivityHandler.getCurrentActivity();
    }



}
