package com.example.linkmyparkingproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.AddParkingBoyAdapter;
import com.example.linkmyparkingproject.model.AddParkingBoyModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperatorParkingBoysActivity extends AppCompatActivity {
    @BindView(R.id.rv_parkingBoys)
    RecyclerView rv_parkingBoys;
    @BindView(R.id.const_addBoy)
    ConstraintLayout const_addBoy;
    @BindView(R.id.const_noBoyAdded)
    ConstraintLayout const_noBoyAdded;
    @BindView(R.id.txt_title)
    TextView txt_title;
    @BindView(R.id.img_back)
    ImageView img_back;
    private AddParkingBoyAdapter parkingBoyAdapter;
    private List<AddParkingBoyModel> parkingBoyModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_parking_boys);
        ButterKnife.bind(this);
        txt_title.setText("Parking Boys");
        parkingBoyModelList =new ArrayList<AddParkingBoyModel>();
        setUpData();
        if (parkingBoyModelList.size()==0){
            const_noBoyAdded.setVisibility(View.VISIBLE);
        }
        else
        {

            const_noBoyAdded.setVisibility(View.GONE);
        }



    }

    @OnClick({R.id.img_back,R.id.const_addBoy})
    public void onClick(View view){
        switch(view.getId()){
            case R.id.img_back:
                onBackPressed();
                break;
            case R.id.const_addBoy:
                Intent intent=new Intent(OperatorParkingBoysActivity.this,OperatorAddParkingBoysActivity.class);
                intent.putExtra("title","Add");
                startActivity(intent);

                break;
        }
    }

    private void setUpData() {
        parkingBoyModelList.add(new AddParkingBoyModel(1));
        parkingBoyModelList.add(new AddParkingBoyModel(2));
        parkingBoyModelList.add(new AddParkingBoyModel(3));
        parkingBoyModelList.add(new AddParkingBoyModel(4));

        rv_parkingBoys.setLayoutManager(new LinearLayoutManager(this));
        parkingBoyAdapter=new AddParkingBoyAdapter(this,parkingBoyModelList);
        rv_parkingBoys.setAdapter(parkingBoyAdapter);
    }
}
