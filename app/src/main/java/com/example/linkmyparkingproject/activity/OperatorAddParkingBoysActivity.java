package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorAddParkingBoysActivity extends AppCompatActivity {
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_home)
    ImageView img_home;
    @BindView(R.id.txt_save)
    TextView txt_save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_add_parking_boys);
        ButterKnife.bind(this);

        if (getIntent().getExtras() != null) {

            if (getIntent().getStringExtra("title").equals("Edit")) {
                txt_title.setText("Edit Parking Boys");


            } else if (getIntent().getStringExtra("title").equals("Add")) {
                txt_title.setText("Add Parking Boys");

            } else {
                txt_title.setText("Add Parking Boys");
            }

        }


    }


    @OnClick({R.id.img_back, R.id.img_home, R.id.txt_save})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;
            case R.id.img_home:
                startActivity(new Intent(OperatorAddParkingBoysActivity.this, OperatorParkingDetailActivity.class));
                break;
            case R.id.txt_save:
                showDialogParkingBoyAdded();
                break;
        }
    }

    private void showDialogParkingBoyAdded() {
        final Dialog boyAdded = new Dialog(OperatorAddParkingBoysActivity.this, android.R.style.Theme_Black_NoTitleBar);
        boyAdded.requestWindowFeature(Window.FEATURE_NO_TITLE);
        boyAdded.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        boyAdded.setContentView(R.layout.dialog_new_boy_added);
        boyAdded.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        boyAdded.setCanceledOnTouchOutside(true);


        TextView txt_ok = boyAdded.findViewById(R.id.txt_ok);


        txt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorAddParkingBoysActivity.this, OperatorParkingBoysActivity.class));
            }
        });


        boyAdded.show();

    }

}
