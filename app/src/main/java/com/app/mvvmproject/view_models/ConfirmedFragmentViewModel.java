package com.app.mvvmproject.view_models;

import android.content.Context;
import android.graphics.Bitmap;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.ConfirmedFragmentHandler;
import com.app.mvvmproject.models.ConfirmedTokenGenerationModel;
import com.app.mvvmproject.utils.Utilities;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.util.Random;

public class ConfirmedFragmentViewModel extends ViewModel {
    private ConfirmedFragmentHandler confirmedFragmentHandler;
    private Context context;
    public ConfirmedTokenGenerationModel confirmedTokenGenerationModel;

    public  ConfirmedFragmentViewModel(ConfirmedFragmentHandler confirmedFragmentHandler){
        this.confirmedFragmentHandler=confirmedFragmentHandler;
        this.context=confirmedFragmentHandler.getCurrentActivity();
        confirmedTokenGenerationModel = new ConfirmedTokenGenerationModel();
    }


    public void onMapReady(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        googleMap.setOnMapClickListener(onMapClickListener);
        googleMap.getUiSettings().setAllGesturesEnabled(false);

        LatLng mumbai = new LatLng(28.609290, 77.172692);
        googleMap.addMarker(new MarkerOptions()
                .position(mumbai)
                .icon(BitmapDescriptorFactory.fromBitmap(
                        Utilities.getResizedPointer(context)
                ))
        );
        CameraPosition cameraPosition = new CameraPosition.Builder().
                target(mumbai).
                tilt(40).
                zoom(16).
                bearing(0).
                build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }



    public Bitmap getQRImage(String content) throws WriterException {
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        return barcodeEncoder
                .encodeBitmap(content, BarcodeFormat.QR_CODE, 300, 300);
    }

    public String generateOTP(){
        int randomInt =  new Random().nextInt(9999);
        if (randomInt < 1000) randomInt+=1000;
        return randomInt+"";
    }

}
