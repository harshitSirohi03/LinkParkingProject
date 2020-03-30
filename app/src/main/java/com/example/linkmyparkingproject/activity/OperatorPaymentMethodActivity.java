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

public class OperatorPaymentMethodActivity extends AppCompatActivity {

    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_proceed)
    TextView txt_proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_payment_method);
        ButterKnife.bind(this);
        txt_title.setText("Payment Method");
    }

    @OnClick({ R.id.img_back,R.id.txt_proceed})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;

            case R.id.txt_proceed:
                Intent intent=new Intent(OperatorPaymentMethodActivity.this,OperatorAdminCommissionActivity.class);
                intent.putExtra("buttonName","paid");
                startActivity(intent);
                break;


        }
    }
}
