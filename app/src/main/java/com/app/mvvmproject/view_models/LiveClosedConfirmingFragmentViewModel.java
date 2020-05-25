package com.app.mvvmproject.view_models;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.app.mvvmproject.handlers.LiveClosedConfirmingFragmentHandler;
import com.app.mvvmproject.models.LiveClosedConfirmingFragmentModel;

public class LiveClosedConfirmingFragmentViewModel extends ViewModel {
    private LiveClosedConfirmingFragmentHandler liveClosedConfirmingFragmentHandler;
    public LiveClosedConfirmingFragmentModel liveClosedConfirmingFragmentModel;

    public LiveClosedConfirmingFragmentViewModel(LiveClosedConfirmingFragmentHandler liveClosedConfirmingFragmentHandler){
        this.liveClosedConfirmingFragmentHandler=liveClosedConfirmingFragmentHandler;

        liveClosedConfirmingFragmentModel = new LiveClosedConfirmingFragmentModel();
    }



    public void onChangeStatusClicked(View view){
        if (liveClosedConfirmingFragmentModel.getLiveStatus()==0)
            liveClosedConfirmingFragmentModel.setLiveStatus(1);
        else
            liveClosedConfirmingFragmentModel.setLiveStatus(0);
    }

    public void onHoldandStartClicked(View view){
        if (liveClosedConfirmingFragmentModel.getHoldStatus()==0)
            liveClosedConfirmingFragmentModel.setHoldStatus(1);
        else
            liveClosedConfirmingFragmentModel.setHoldStatus(0);
    }

}
