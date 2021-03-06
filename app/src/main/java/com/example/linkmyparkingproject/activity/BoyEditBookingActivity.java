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

public class BoyEditBookingActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_save)
    TextView txt_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_edit_booking);
        ButterKnife.bind(this);

        txt_title.setText("Edit Booking");

    }

    @OnClick({ R.id.img_back,R.id.txt_save})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.img_back:
                onBackPressed();
                break;

            case R.id.txt_save:
                finish();
                break;
        }
    }
}
