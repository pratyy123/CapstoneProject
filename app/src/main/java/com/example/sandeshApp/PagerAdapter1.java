package com.example.sandeshApp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter1 extends FragmentPagerAdapter {
    int tabcount1;


    public PagerAdapter1(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount1=behavior;


    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new TechFragment();
            default:
                return null;








        }
    }
    @Override
    public int getCount() {
        return tabcount1;
    }
}
