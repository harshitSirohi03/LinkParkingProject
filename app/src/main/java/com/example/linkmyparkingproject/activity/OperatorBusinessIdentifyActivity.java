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

public class OperatorBusinessIdentifyActivity extends AppCompatActivity {
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_skip)
    TextView txt_skip;
    @BindView(R.id.txt_submit)
    TextView txt_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_business_identify);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_back,R.id.txt_skip,R.id.txt_submit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;

            case R.id.txt_skip:
                startActivity(new Intent(OperatorBusinessIdentifyActivity.this,HomeActivity.class));
                break;

            case R.id.txt_submit:
                startActivity(new Intent(OperatorBusinessIdentifyActivity.this,HomeActivity.class));

                break;

        }
    }
}
