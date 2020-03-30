package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorParkingDetailActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.const_parkingDetail)
    ConstraintLayout const_parkingDetail;
    @BindView(R.id.const_parkingBooking)
    ConstraintLayout const_parkingBooking;
    @BindView(R.id.const_parkingBoy)
    ConstraintLayout const_parkingBoy;
    @BindView(R.id.const_transaction)
    ConstraintLayout const_transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_parking_detail);
        ButterKnife.bind(this);
        txt_title.setText("Parking Detail");
    }

    @OnClick({R.id.img_back,R.id.const_parkingDetail,R.id.const_parkingBooking,R.id.const_parkingBoy,R.id.const_transaction})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.img_back:
                onBackPressed();
                break;
            case R.id.const_parkingDetail:
                startActivity(new Intent(OperatorParkingDetailActivity.this,CreateParkingActivity.class));
                break;
            case R.id.const_parkingBooking:
                startActivity(new Intent(OperatorParkingDetailActivity.this,OperatorBookingsActivity.class));
                break;
            case R.id.const_parkingBoy:
                startActivity(new Intent(OperatorParkingDetailActivity.this,OperatorParkingBoysActivity.class));

                break;

            case R.id.const_transaction:
                startActivity(new Intent(OperatorParkingDetailActivity.this,TotalEarningsActivity.class));
                break;

        }
    }
}
