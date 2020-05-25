package com.app.mvvmproject.handlers;

import androidx.fragment.app.Fragment;

public interface MainActivityHandler extends BaseActivityHandler {
    void moveToFragment(Fragment fragment);

    void moveToFragmentWithBackStack(Fragment fragment);

    void closeActivity();
}
