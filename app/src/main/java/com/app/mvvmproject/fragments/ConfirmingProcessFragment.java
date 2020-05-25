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
import com.app.mvvmproject.databinding.FragmentConfirmingProcessBinding;
import com.app.mvvmproject.handlers.ConfirmingProcessFragmentHandler;
import com.app.mvvmproject.utils.Utilities;
import com.app.mvvmproject.view_models.ConfirmingProcessFragmentViewModel;
import com.app.mvvmproject.view_models.MainActivityViewModel;
import com.google.android.gms.maps.MapView;

public class ConfirmingProcessFragment extends BaseFragment implements ConfirmingProcessFragmentHandler {
    private FragmentConfirmingProcessBinding fragmentConfirmingProcessBinding;
    private MainActivityViewModel mainActivityViewModel;
    private ConfirmingProcessFragmentViewModel confirmingProcessFragmentViewModel;

    private MapView mapView;

    public ConfirmingProcessFragment(MainActivityViewModel mainActivityViewModel) {
        this.mainActivityViewModel = mainActivityViewModel;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_confirming_process, container, false);
        fragmentConfirmingProcessBinding = DataBindingUtil.bind(view);
        fragmentConfirmingProcessBinding.setActivityViewModel(mainActivityViewModel);
        confirmingProcessFragmentViewModel = Utilities
                .initConfirmingProcessFragmentViewModelInstance(this ,this);

        mapView = fragmentConfirmingProcessBinding.mapView;
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(
                (googleMap) -> confirmingProcessFragmentViewModel
                        .onMapReady(googleMap, mainActivityViewModel::onMapClicked));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


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
