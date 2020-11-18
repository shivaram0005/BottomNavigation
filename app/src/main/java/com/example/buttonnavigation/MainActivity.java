package com.example.buttonnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new BlankFragment1()).commit();

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp=null;
                switch (item.getItemId())
                {
                    case R.id.accountBalance: temp=new BlankFragment1();
                    break;
                    case R.id.add: temp=new BlankFragment2();
                    break;
                    case R.id.android: temp=new BlankFragment3();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,temp).commit();
                return true;
            }
        });
    }
}