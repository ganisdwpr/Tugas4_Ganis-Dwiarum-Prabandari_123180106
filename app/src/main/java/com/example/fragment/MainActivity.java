package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView main_navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_navbar = findViewById(R.id.main_navbar);
        main_navbar.setOnNavigationItemSelectedListener(this);

        loadFragment(new Fragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
       Fragment fragment = null;

       switch (item.getItemId()){
           case R.id.home:
               fragment = new HomeFragment();
               break;
           case R.id.user:
               fragment = new ProfileFragment();
               break;
       }
            return loadFragment(fragment);
    }
}