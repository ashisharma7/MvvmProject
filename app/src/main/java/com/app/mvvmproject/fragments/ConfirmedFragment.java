package com.app.mvvmproject.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mvvmproject.R;
import com.app.mvvmproject.databinding.FragmentConfirmedBinding;
import com.app.mvvmproject.handlers.ConfirmedFragmentHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.ConfirmedFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;
import com.google.android.gms.maps.MapView;
import com.google.zxing.WriterException;


public class ConfirmedFragment extends BaseFragment implements ConfirmedFragmentHandler {
    private MainActivityViewModel mainActivityViewModel;
    private MapView mapView;
    private FragmentConfirmedBinding fragmentConfirmedBinding;
    private ConfirmedFragmentViewModel confirmedFragmentViewModel;

    public ConfirmedFragment(MainActivityViewModel mainActivityViewModel) {
        this.mainActivityViewModel = mainActivityViewModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_confirmed, container, false);
        fragmentConfirmedBinding = DataBindingUtil.bind(view);

        confirmedFragmentViewModel = Utilities
                .initConfirmedFragmentViewModelInstance(this,this);

        fragmentConfirmedBinding.setActivityViewModel(mainActivityViewModel);
        fragmentConfirmedBinding.setViewModel(confirmedFragmentViewModel);

        mapView = fragmentConfirmedBinding.mapView;
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(
                (googleMap) -> confirmedFragmentViewModel
                        .onMapReady(googleMap, mainActivityViewModel::onMapClicked));
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        try {
            String otp = confirmedFragmentViewModel.generateOTP();
            fragmentConfirmedBinding.qrImageView.setImageBitmap(
                    confirmedFragmentViewModel
                            .getQRImage(otp)
            );
            confirmedFragmentViewModel.confirmedTokenGenerationModel.setOtp(otp);
        }catch (WriterException e){}

    }

    @Override
    public void onStart() {
        mapView.onStart();
        super.onStart();
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public AppCompatActivity getCurrentActivity() {
        return mainActivityViewModel.getCurrentActivity();
    }
}
