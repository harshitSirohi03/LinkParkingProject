package com.example.linkmyparkingproject.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.BoyOngoingBookingAdapter;
import com.example.linkmyparkingproject.fragment.BoyCreateBookingFragment;
import com.example.linkmyparkingproject.fragment.BoyHomeFragmentFragment;
import com.example.linkmyparkingproject.fragment.BoyMyAccountFragment;
import com.example.linkmyparkingproject.fragment.BoyOngoingChildFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BoyHomeActivity extends AppCompatActivity {
    @BindView(R.id.home_frameLayout)
    FrameLayout home_frameLayout;
    @BindView(R.id.bottomNavigationView2)
    BottomNavigationView bottomNavigationView2;
    @BindView(R.id.txt_titleBoy)
    public TextView txt_titleBoy;
    @BindView(R.id.img_header)
    public ImageView img_header;

    View Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_home);
        ButterKnife.bind(this);
        bottomNavigationView2.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new BoyHomeFragmentFragment(), null).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Home = bottomNavigationView2.getMenu().getItem(1).getActionView();
            Fragment fragment = null;
            switch (menuItem.getItemId()) {
                case R.id.booking:
                    txt_titleBoy.setVisibility(View.GONE);
                    img_header.setVisibility(View.VISIBLE);

                    getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new BoyHomeFragmentFragment(), null).commit();

                    break;

                case R.id.createBook:
                    txt_titleBoy.setText("Create Booking");
                    txt_titleBoy.setVisibility(View.VISIBLE);
                    img_header.setVisibility(View.GONE);


                    getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new BoyCreateBookingFragment(), null).commit();

                    break;

                case R.id.account:
                    txt_titleBoy.setText("My Account");
                    txt_titleBoy.setVisibility(View.VISIBLE);
                    img_header.setVisibility(View.GONE);

                    getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new BoyMyAccountFragment(), null).commit();

                    break;


            }
            return true;
        }
    };


}
