package com.app.mvvmproject.models;

import androidx.databinding.BaseObservable;

import com.google.android.gms.maps.model.LatLng;

public class ConfirmingTokenGenerationModel extends BaseObservable {
    private String appointmentTime,slotFillings,shopAddress,shopDistance;
    private LatLng mapLocationLatLng;

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
        notifyChange();
    }

    public String getSlotFillings() {
        return slotFillings;
    }

    public void setSlotFillings(String slotFillings) {
        this.slotFillings = slotFillings;
        notifyChange();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
        notifyChange();
    }

    public String getShopDistance() {
        return shopDistance;
    }

    public void setShopDistance(String shopDistance) {
        this.shopDistance = shopDistance;
        notifyChange();
    }

    public LatLng getMapLocationLatLng() {
        return mapLocationLatLng;
    }

    public void setMapLocationLatLng(LatLng mapLocationLatLng) {
        this.mapLocationLatLng = mapLocationLatLng;
    }
}
