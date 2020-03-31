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

public class TotalEarningsActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.const_parkingName)
    ConstraintLayout const_parkingName;
    @BindView(R.id.const_select)
    ConstraintLayout const_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_earnings);
        ButterKnife.bind(this);
        txt_title.setText("Total Earnings");

        if (getIntent().getExtras()!=null){
            if (getIntent().getStringExtra("topConst").equals("transaction")){
                const_parkingName.setVisibility(View.VISIBLE);
                const_select.setVisibility(View.GONE);
            }
            else if (getIntent().getStringExtra("topConst").equals("earnings")){
                const_parkingName.setVisibility(View.GONE);
                const_select.setVisibility(View.VISIBLE);
            }
            else {

            }
        }
    }

    @OnClick({ R.id.img_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;
        }
    }
}
