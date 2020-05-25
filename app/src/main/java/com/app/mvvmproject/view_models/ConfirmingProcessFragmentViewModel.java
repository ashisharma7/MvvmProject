package com.app.mvvmproject.view_models;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.ConfirmingProcessFragmentHandler;
import com.app.mvvmproject.models.ConfirmingTokenGenerationModel;
import com.app.mvvmproject.utils.Utilities;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ConfirmingProcessFragmentViewModel extends ViewModel {
    private ConfirmingProcessFragmentHandler confirmingProcessFragmentHandler;
    private Context context;
    public ConfirmingTokenGenerationModel confirmingTokenGenerationModel;

    public ConfirmingProcessFragmentViewModel(ConfirmingProcessFragmentHandler confirmingProcessFragmentHandler){
        this.confirmingProcessFragmentHandler=confirmingProcessFragmentHandler;
        this.context = confirmingProcessFragmentHandler.getCurrentActivity();
        confirmingTokenGenerationModel = new ConfirmingTokenGenerationModel();
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


    public void onMapClicked(LatLng latLng){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?daddr=19.0760,72.8777"));
        context.startActivity(intent);
    }

}
