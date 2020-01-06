package com.aakriti.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.Adapter;

import com.aakriti.fragments.Adapter.ViewPagerAdapter;
import com.aakriti.fragments.Fragments.FirstFragment;
import com.aakriti.fragments.Fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager= findViewById(R.id.viewPager);
        tabLayout= findViewById(R.id.tabId);


        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"Load First Fragment");
        viewPagerAdapter.addFragment(new SecondFragment(),"Load Second Fragment");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
