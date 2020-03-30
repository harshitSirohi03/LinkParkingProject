package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.ParkingVenueNameAdapter;
import com.example.linkmyparkingproject.model.ParkingVenueNameModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.rv_venueName)
    RecyclerView rv_venueName;
    @BindView(R.id.const_noData)
    ConstraintLayout const_noData;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer_layout;
    @BindView(R.id.img_menu)
    ImageView img_menu;
    @BindView(R.id.const_createParking)
    ConstraintLayout const_createParking;
    private ParkingVenueNameAdapter parkingVenueNameAdapter;
    private List<ParkingVenueNameModel> venueNameModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        venueNameModelList = new ArrayList<ParkingVenueNameModel>();
        setUpData();
        if (venueNameModelList.size() == 0) {
            const_noData.setVisibility(View.VISIBLE);
        } else {
            const_noData.setVisibility(View.GONE);

        }
        navigationDrawer();


    }

    @OnClick({R.id.const_createParking})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.const_createParking:
                startActivity(new Intent(HomeActivity.this,CreateParkingActivity.class));
                break;
        }
    }

    private void navigationDrawer() {

        drawer_layout = findViewById(R.id.drawer_layout);
        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(GravityCompat.START);
            }
        });

        TextView txt_home = findViewById(R.id.txt_home);
        TextView txt_profile = findViewById(R.id.txt_profile);
        TextView txt_identify = findViewById(R.id.txt_identify);
        TextView txt_earning = findViewById(R.id.txt_earning);
        TextView txt_adminCommission = findViewById(R.id.txt_adminCommission);
        TextView txt_setting = findViewById(R.id.txt_setting);
        TextView txt_feedback = findViewById(R.id.txt_feedback);
        TextView txt_about = findViewById(R.id.txt_about);
        TextView txt_logOut = findViewById(R.id.txt_logOut);
        ImageView img_menuNav = findViewById(R.id.img_menuNav);

        txt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
            }
        });

        txt_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, OperatorMyProfileActivity.class));
            }
        });
        txt_earning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, TotalEarningsActivity.class));

            }
        });

        txt_adminCommission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, OperatorAdminCommissionActivity.class));

            }
        });
        txt_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, OperatorSettingsActivity.class));

            }
        });

        txt_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                Intent intent=new Intent(HomeActivity.this, OperatorAboutAppActivity.class);
                intent.putExtra("title","about");
                startActivity(intent);

            }
        });

        txt_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, OperatorFeedbackActivity.class));


            }
        });

        txt_identify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, OperatorPersonalIdentificationActivity.class));


            }
        });

        txt_logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(HomeActivity.this, RoleSelectionActivity.class));


            }
        });

        img_menuNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawer_layout.closeDrawer(GravityCompat.START);
                    }
                });
            }
        });



    }

    private void setUpData() {
        venueNameModelList.add(new ParkingVenueNameModel("Parking Venue Name 1"));
        venueNameModelList.add(new ParkingVenueNameModel("Parking Venue Name 2"));
        venueNameModelList.add(new ParkingVenueNameModel("Parking Venue Name 3"));
        venueNameModelList.add(new ParkingVenueNameModel("Parking Venue Name 4"));
        rv_venueName.setLayoutManager(new LinearLayoutManager(this));
        parkingVenueNameAdapter = new ParkingVenueNameAdapter(this, venueNameModelList);
        rv_venueName.setAdapter(parkingVenueNameAdapter);

    }
}
