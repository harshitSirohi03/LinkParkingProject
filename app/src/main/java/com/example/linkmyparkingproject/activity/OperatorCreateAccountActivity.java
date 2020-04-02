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

public class OperatorCreateAccountActivity extends AppCompatActivity {
    @BindView(R.id.txt_signUp)
    TextView txt_signUp;
    @BindView(R.id.txt_terms)
    TextView txt_terms;
    @BindView(R.id.imageView6)
    ImageView imageView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_create_account);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.txt_signUp,R.id.txt_terms,R.id.imageView6})
    public void onClick( View view){
        switch(view.getId()){
            case R.id.txt_signUp:
                startActivity(new Intent(OperatorCreateAccountActivity.this,OperatorPersonalIdentificationActivity.class));
                break;

            case R.id.txt_terms:
                Intent intent=new Intent(OperatorCreateAccountActivity.this,OperatorAboutAppActivity.class);
                intent.putExtra("title","createAccount");
                startActivity(intent);

            case R.id.imageView6:
                onBackPressed();
                break;
        }
    }
}
