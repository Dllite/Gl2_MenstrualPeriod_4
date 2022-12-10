package com.litetech.menstrualperiod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.litetech.menstrualperiod.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button skip;
    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
                //openAddAccount();
            }

        });
    }

    public void openHome() {
        Intent intent = new Intent(this, homeActivity.class);
        startActivity(intent);
    }

}
