package com.example.zack.myapplication;

import android.app.DialogFragment;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zack on 9/10/2017.
 */

public class ImageDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dialog, container, false);
        getDialog().setTitle("Simple Dialog");
        return rootView;
    }
}
