package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorAboutAppActivity extends AppCompatActivity {
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_about_app);
        ButterKnife.bind(this);

        if (getIntent().getExtras() != null) {
            if (getIntent().getStringExtra("title").equals("about")) {
                txt_title.setText("About This App");
            } else if (getIntent().getStringExtra("title").equals("terms")) {
                txt_title.setText("Terms and Conditions");

            } else if (getIntent().getStringExtra("title").equals("createAccount")) {
                txt_title.setText("Terms and Conditions");
            } else txt_title.setText("");
        }
    }

    @OnClick({R.id.img_back})
    public void onCLick(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                onBackPressed();
                break;


        }
    }
}
