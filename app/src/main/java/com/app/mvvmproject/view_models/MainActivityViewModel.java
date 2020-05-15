package com.app.mvvmproject.view_models;

import android.content.Context;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.MainActivityHandler;
import com.app.mvvmproject.models.RegistrationModel;

public class MainActivityViewModel extends ViewModel  {
    private MainActivityHandler mainActivityHandler;
    private Context context;
    private RegistrationModel registrationModel;

    public MainActivityViewModel(MainActivityHandler mainActivityHandler){
        this.mainActivityHandler=mainActivityHandler;
        this.context = mainActivityHandler.getContext();
        registrationModel = new RegistrationModel();
        registrationModel.setShopName("Grocery Shop");
    }

    public void clickToUploadPics(){}

    public void showSelectedPic(){}

    public void deleteSelectedPic(){}

    public void showUploadPicsError(){}

    public String getTime(){
        return "time";
    }

    public int getTotalCapacity(){
        return 1;
    }

    public String getPerSlotTime(){
        return "time";
    }

    public void setSlotsAndTimings(){}

    public void deleteSelectedSlot(){}

    public void getLocation(){}

    public void showLocationErrors(){}

    public void sendOtp(){}

    public void submitTheRegistration(){}

    public RegistrationModel getRegistrationModel() {
        return registrationModel;
    }
}
