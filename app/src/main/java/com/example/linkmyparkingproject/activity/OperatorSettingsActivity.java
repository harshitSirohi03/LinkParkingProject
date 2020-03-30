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

public class OperatorSettingsActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.txt_terms)
    TextView txt_terms;
    @BindView(R.id.txt_contact)
    TextView txt_contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_settings);
        ButterKnife.bind(this);

        txt_title.setText("Settings");

    }

    @OnClick({R.id.img_back,R.id.txt_terms,R.id.txt_contact})
    public void onCLick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;

            case R.id.txt_terms:
                Intent intent=new Intent(OperatorSettingsActivity.this, OperatorAboutAppActivity.class);
                intent.putExtra("title","terms");
                startActivity(intent);
                break;

            case R.id.txt_contact:
                startActivity(new Intent(OperatorSettingsActivity.this,OperatorContactUsActivity.class));
                break;


        }
    }
}
