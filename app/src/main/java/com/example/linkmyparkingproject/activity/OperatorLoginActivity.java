package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.bottomsheet.ForgotPassBottomsheet;
import com.example.linkmyparkingproject.bottomsheet.OtpBottomsheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorLoginActivity extends AppCompatActivity {
    @BindView(R.id.txt_login)
    TextView txt_login;
    @BindView(R.id.txt_createAccount)
    TextView txt_createAccount;
    @BindView(R.id.txt_forgot)
    TextView txt_forgot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_login);
        ButterKnife.bind(this);

        if (getIntent().getExtras() != null) {
            if (getIntent().getStringExtra("activity").equals("operator")) {
                txt_createAccount.setVisibility(View.VISIBLE);
                txt_forgot.setVisibility(View.VISIBLE);

                txt_login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(OperatorLoginActivity.this, HomeActivity.class));
                    }
                });


            } else if (getIntent().getStringExtra("activity").equals("boy")) {
                txt_createAccount.setVisibility(View.GONE);
                txt_forgot.setVisibility(View.GONE);

                txt_login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(OperatorLoginActivity.this, BoyHomeActivity.class));
                    }
                });
            } else {

            }
        }


    }

    @OnClick({R.id.txt_createAccount, R.id.txt_forgot})
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.txt_login:
//                startActivity(new Intent(OperatorLoginActivity.this, HomeActivity.class));
//                break;

            case R.id.txt_createAccount:
                startActivity(new Intent(OperatorLoginActivity.this, OperatorCreateAccountActivity.class));
                break;

            case R.id.txt_forgot:
                ForgotPassBottomsheet forgotPassBottomsheet = new ForgotPassBottomsheet();
//                filterBottomSheet.callInterfaceFilter(this);
                forgotPassBottomsheet.show(((OperatorLoginActivity.this).getSupportFragmentManager()), "Filter");
                break;
        }
    }


}
