package com.example.sandeshApp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tabLayout1;
    TabItem mhome,msports,mhealth,mscience,mtech;
    PagerAdapter1 pagerAdapter1;
    Toolbar mtoolbar1;
    String api="876c76a0a09e499486beda0724148507";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mtoolbar1=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar1);
        mhome=findViewById(R.id.home);
        msports=findViewById(R.id.sports);
        mhealth=findViewById(R.id.health);
        mscience=findViewById(R.id.science);
        mtech=findViewById(R.id.tech);
        ViewPager viewPager1=findViewById(R.id.fragmentcontainer);
        tabLayout1=findViewById(R.id.include1);

        pagerAdapter1=new PagerAdapter1(getSupportFragmentManager(),5);
        viewPager1.setAdapter(pagerAdapter1);
        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 ||tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4) {
                    pagerAdapter1.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));






    }
}
