package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorAdminCommissionActivity extends AppCompatActivity {

    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.txt_pay)
    TextView txt_pay;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_amount)
    TextView txt_amount;
    @BindView(R.id.txt_paid)
    TextView txt_paid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_admin_commission);
        ButterKnife.bind(this);

        txt_title.setText("Admin Commission");

        if (getIntent().getExtras() != null) {

            if (getIntent().getStringExtra("buttonName").equals("paid")) {
                txt_amount.setBackground(getResources().getDrawable(R.drawable.bg_const_light_orange_round_corner));
                txt_amount.setTextColor(getResources().getColor(R.color.colorPrimary));

                txt_paid.setVisibility(View.VISIBLE);
                txt_pay.setVisibility(View.GONE);


            }  else {
                txt_amount.setBackground(getResources().getDrawable(R.drawable.bg_const_orange_corner_8dp));
                txt_amount.setTextColor(Color.parseColor("#FFFFFF"));

                txt_paid.setVisibility(View.GONE);
                txt_pay.setVisibility(View.VISIBLE);
            }

        }
    }

    @OnClick({R.id.txt_pay, R.id.img_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_pay:
              startActivity(new Intent(OperatorAdminCommissionActivity.this,OperatorPaymentMethodActivity.class));
//                showDialogLocation();
                break;

            case R.id.img_back:
                startActivity(new Intent(OperatorAdminCommissionActivity.this,HomeActivity.class));

                break;
        }
    }


    private void showDialogLocation() {
        final Dialog dailogLocatiton = new Dialog(OperatorAdminCommissionActivity.this, android.R.style.Theme_Black_NoTitleBar);
        dailogLocatiton.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dailogLocatiton.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dailogLocatiton.setContentView(R.layout.dialog_location);
        dailogLocatiton.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dailogLocatiton.setCanceledOnTouchOutside(true);

        dailogLocatiton.show();


    }
}
