package com.app.mvvmproject.models;

import androidx.databinding.BaseObservable;

import com.google.android.gms.maps.model.LatLng;

public class ConfirmedTokenGenerationModel extends BaseObservable {
    private String appointmentTime,yourTokenNumber,yourTokenStatus,shopDistance,shopAddress,lastTokenNumberCalled,otp;
    private LatLng mapLocationLatLng;


    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
        notifyChange();
    }

    public void setYourTokenNumber(String yourTokenNumber) {
        this.yourTokenNumber = yourTokenNumber;
        notifyChange();
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
        notifyChange();
    }

    public void setYourTokenStatus(String yourTokenStatus) {
        this.yourTokenStatus = yourTokenStatus;
        notifyChange();
    }

    public void setShopDistance(String shopDistance) {
        this.shopDistance = shopDistance;
        notifyChange();
    }

    public void setLastTokenNumberCalled(String lastTokenNumberCalled) {
        this.lastTokenNumberCalled = lastTokenNumberCalled;
        notifyChange();
    }

    public void setMapLocationLatLng(LatLng mapLocationLatLng) {
        this.mapLocationLatLng = mapLocationLatLng;
    }

    public void setOtp(String otp) {
        this.otp = otp;
        notifyChange();
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getYourTokenNumber() {
        return yourTokenNumber;
    }

    public String getYourTokenStatus() {
        return yourTokenStatus;
    }

    public String getShopDistance() {
        return shopDistance;
    }

    public String getLastTokenNumberCalled() {
        return lastTokenNumberCalled;
    }

    public LatLng getMapLocationLatLng() {
        return mapLocationLatLng;
    }

    public String getOtp() {
        return otp;
    }

    public String getShopAddress() {
        return shopAddress;
    }
}
