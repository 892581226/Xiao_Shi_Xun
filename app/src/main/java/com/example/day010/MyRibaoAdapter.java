package com.example.day010;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyRibaoAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> list;
    private ArrayList<String> tab;

    public MyRibaoAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> list, ArrayList<String> tab) {
        super(fm);
        this.list = list;
        this.tab = tab;
    }

    public MyRibaoAdapter(@NonNull FragmentManager fm) {
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab.get(position);
    }
}
