package com.example.it_ch.demonstrationapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it_ch.demonstrationapp.R;

/**
 * Created by ${chengguo} on 2017/12/7.
 */
public class ChangeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.change_fragment,container,false);
        return view;
    }

}