package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RoleSelectionActivity extends AppCompatActivity {
    @BindView(R.id.img_operator)
    ImageView img_operator;
    @BindView(R.id.img_parkingBoy)
    ImageView img_parkingBoy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);
        ButterKnife.bind(this);
        img_operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(RoleSelectionActivity.this, OperatorLoginActivity.class));
                Intent intent =new Intent(RoleSelectionActivity.this,OperatorLoginActivity.class);
                intent.putExtra("activity","operator");
                startActivity(intent);
            }
        });

        img_parkingBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(RoleSelectionActivity.this,OperatorLoginActivity.class);
                intent.putExtra("activity","boy");
                startActivity(intent);
//                startActivity(new Intent(RoleSelectionActivity.this, BoyHomeActivity.class));

            }
        });
    }
}
