package com.app.mvvmproject.models;

import androidx.databinding.BaseObservable;

public class ProfileSettingsFragmentModel extends BaseObservable {
    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
        notifyChange();
    }

}
