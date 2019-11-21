package com.example.day010;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

class MyAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> list;

    public MyAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;
    }

    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
