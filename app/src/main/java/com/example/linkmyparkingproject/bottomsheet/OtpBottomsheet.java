package com.example.linkmyparkingproject.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.HomeActivity;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OtpBottomsheet extends BottomSheetDialogFragment {

    private Context context;
    @BindView(R.id.txt_submit)
    TextView txt_submit;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate (R.layout.layout_otp,container,false);
        context=getContext();
        ButterKnife.bind(this,view);

        return view;
    }

    @OnClick({R.id.txt_submit})
    public void onCLick(View view){
        switch(view.getId()){
            case R.id.txt_submit:
                startActivity(new Intent(context, HomeActivity.class));
                dismiss();
                break;
        }
    }
}
