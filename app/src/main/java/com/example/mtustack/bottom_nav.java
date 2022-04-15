package com.example.mtustack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottom_nav extends AppCompatActivity {
//
//    Button firstfrag, secondfrag;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);



        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


//        firstfrag = findViewById(R.id.Button_home);
//        secondfrag = findViewById(R.id.Button_pay);
//
//        firstfrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                replaceFragment(new HomeFragment());
//
//            }
//        });
//
//        secondfrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                replaceFragment(new PayFragment());
//
//            }
//        });


//        bottomNavigationView = findViewById(R.id.bottom_nav);
//        getSupportFragmentManager().beginTransaction().replace(R.id.main_container , new HomeFragment()).commit();
//
//        bottomNavigationView.setSelectedItemId(R.id.nav_home);
//
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Fragment fragment = null;
//
//                switch (item.getItemId()){
//                    case R.id.nav_home:
//                        fragment = new HomeFragment();
//                        break;
//                    case R.id.nav_wal:
//                        fragment = new WalletFragment();
//                        break;
//                    case R.id.nav_search:
//                        fragment = new searchFragment();
//                        break;
//                    case R.id.nav_pay:
//                        fragment = new PayFragment();
//                        break;
//                    case R.id.nav_set:
//                        fragment = new SetFragment();
//                        break;
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_container , fragment).commit();
//
//
//                return true;
//            }
//        });
    }

//    private void replaceFragment(Fragment fragment) {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout,fragment);
//        fragmentTransaction.commit();
//    }
}