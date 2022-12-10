package com.litetech.menstrualperiod;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.litetech.menstrualperiod.databinding.ActivityHomeBinding;
import com.litetech.menstrualperiod.databinding.ActivityMainBinding;

public class homeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    //HomeFragment homeFragment = new HomeFragment();

    //ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_home);

        replaceFragment(new HomeFragment());

        //setContentView(binding.getRoot());

       bottomNavigationView = findViewById(R.id.bottomNavigationView);
       bottomNavigationView.setBackground(null);

       bottomNavigationView.setOnItemSelectedListener(item -> {
           switch (item.getItemId()){
               case R.id.home:
                   replaceFragment(new HomeFragment());
                   break;
               case R.id.calendar:
                   replaceFragment(new CalendarFragment());
                   break;
               case R.id.journal:
                   replaceFragment(new LotFragment());
                   break;
               case R.id.setting:
                   replaceFragment(new SettingFragment());
                   break;
               default:
           }
           return  true;
       });


    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_view,fragment);
        fragmentTransaction.commit();
    }


}