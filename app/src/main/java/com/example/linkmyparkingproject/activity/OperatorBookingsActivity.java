package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.fragment.OngoingBookingFragment;
import com.example.linkmyparkingproject.fragment.PastBookingFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorBookingsActivity extends AppCompatActivity {
    @BindView(R.id.frameLayout_booking)
    FrameLayout frameLayout_booking;
    @BindView(R.id.const_onGoing)
    ConstraintLayout const_onGoing;
    @BindView(R.id.const_past)
    ConstraintLayout const_past;
    @BindView(R.id.txt_onGoing)
    TextView txt_onGoing;
    @BindView(R.id.txt_past)
    TextView txt_past;
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_bookings);
        ButterKnife.bind(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_booking, new OngoingBookingFragment(), null).commit();

        txt_title.setText("Bookings");


    }

    @OnClick({R.id.const_onGoing, R.id.const_past, R.id.img_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.const_onGoing:
                txt_onGoing.setTextColor(Color.parseColor("#FFFFFF"));
                const_onGoing.setBackground(getResources().getDrawable(R.drawable.bg_const_orange_2corner));
                txt_past.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                const_past.setBackground(getResources().getDrawable(R.drawable.bg_const_grey_2corner));

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_booking, new OngoingBookingFragment(), null).commit();
                break;
            case R.id.const_past:
                txt_onGoing.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                const_onGoing.setBackground(getResources().getDrawable(R.drawable.bg_const_ongoing));
                txt_past.setTextColor(Color.parseColor("#FFFFFF"));
                const_past.setBackground(getResources().getDrawable(R.drawable.bg_const_past));
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_booking, new PastBookingFragment(), null).commit();

                break;

            case R.id.img_back:
                onBackPressed();
                break;


        }

    }


}
