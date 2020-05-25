package com.app.mvvmproject.models;

import androidx.databinding.BaseObservable;

public class LiveClosedConfirmingFragmentModel extends BaseObservable {
    private int liveStatus,holdStatus;
    private String appointmentTime,tokenStatus,date;

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
        notifyChange();
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
        notifyChange();
    }

    public void setDate(String date) {
        this.date = date;
        notifyChange();
    }

    public void setLiveStatus(int liveStatus) {
        this.liveStatus = liveStatus;
        notifyChange();
    }

    public void setHoldStatus(int holdStatus) {
        this.holdStatus = holdStatus;
        notifyChange();
    }

    public int getLiveStatus() {
        return liveStatus;
    }

    public int getHoldStatus() {
        return holdStatus;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public String getDate() {
        return date;
    }
}
