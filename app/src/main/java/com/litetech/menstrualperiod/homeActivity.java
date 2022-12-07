package com.litetech.menstrualperiod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.litetech.menstrualperiod.databinding.ActivityMainBinding;

public class home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        bottomNavigationView=findViewById(R.id.navigationView);
        //bottomNavigationView.setBackground(null);

        binding.
        //replaceFragment(new HomeFragment());
    }

}