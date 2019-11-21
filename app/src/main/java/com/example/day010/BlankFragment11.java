package com.example.day010;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment11 extends Fragment {
    private int a;

    public BlankFragment11(int a) {
        // Required empty public constructor
        this.a=a;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(setlayoy(), container, false);
    }

    private int setlayoy() {
        switch (a){
            case 0:
            return R.layout.fragment_blank11;
            case 1:
                return R.layout.fragment_blank11;
            case 2:
                return R.layout.fragment_blank11;
            case 3:
                return R.layout.fragment_blank11;

        }
        return 0;
    }

}
