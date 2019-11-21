package com.example.day010;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private ArrayList<Fragment> fragments;
    private MyRibaoAdapter myAdapter;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TabLayout tab = getView().findViewById(R.id.tab1);
        ViewPager viewPage = getView().findViewById(R.id.viewPage1);
        fragments = new ArrayList<>();
        ArrayList<String> tablist = new ArrayList<>();
        tablist.add("日报");
        tablist.add("主题");
        tablist.add("专栏");
        tablist.add("热门");
        for (int i = 0; i <4 ; i++) {
            BlankFragment11 blankFragment11 = new BlankFragment11(i);
            fragments.add(blankFragment11);
        }
        myAdapter = new MyRibaoAdapter(getChildFragmentManager(), fragments,tablist);
        viewPage.setAdapter(myAdapter);
        tab.setupWithViewPager(viewPage);


    }
}
