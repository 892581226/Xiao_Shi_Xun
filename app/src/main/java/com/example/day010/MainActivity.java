package com.example.day010;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private Toolbar toolbar;
    private LinearLayout lin;
    private NavigationView nav;
    private DrawerLayout dra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        lin = findViewById(R.id.lin);
        nav = findViewById(R.id.nav);
        dra = findViewById(R.id.dra);
        toolbar.setTitle("toolbar");
        setSupportActionBar(toolbar);
        nav.setItemIconTintList(null);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, dra, toolbar, R.string.open, R.string.close);
        actionBarDrawerToggle.syncState();
        dra.addDrawerListener(actionBarDrawerToggle);
        dra.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                lin.setX(nav.getWidth()*slideOffset);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.lin22,new BlankFragment(),BlankFragment.class.getSimpleName()).commit();
        nav.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (itemId){
            case R.id.add1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.lin22,new BlankFragment(),BlankFragment.class.getSimpleName()).commit();
                dra.closeDrawers();
                break;
            case R.id.add2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.lin22,new BlankFragment2(),BlankFragment2.class.getSimpleName()).commit();
                dra.closeDrawers();
                break;
            case R.id.add3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.lin22,new BlankFragment3(),BlankFragment3.class.getSimpleName()).commit();
                dra.closeDrawers();
                break;
            case R.id.add4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.lin22,new BlankFragment4(),BlankFragment4.class.getSimpleName()).commit();
                dra.closeDrawers();
                break;
            case R.id.add5:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.lin22,new BlankFragment5(),BlankFragment5.class.getSimpleName()).commit();
                dra.closeDrawers();
                break;


        }
        return true;
    }
}
