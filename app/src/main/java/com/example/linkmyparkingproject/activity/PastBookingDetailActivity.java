package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PastBookingDetailActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_home)
    ImageView img_home;
    @BindView(R.id.img_back)
    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_booking_detail);
        ButterKnife.bind(this);

        txt_title.setText("Bookings Details");
    }

    @OnClick({R.id.img_home, R.id.img_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_home:

                startActivity(new Intent(PastBookingDetailActivity.this, OperatorParkingDetailActivity.class));
                break;

            case R.id.img_back:
                onBackPressed();
                break;
        }
    }
}
