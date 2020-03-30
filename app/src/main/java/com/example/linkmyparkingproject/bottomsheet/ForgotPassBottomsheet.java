package com.example.linkmyparkingproject.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.HomeActivity;
import com.example.linkmyparkingproject.activity.OperatorLoginActivity;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgotPassBottomsheet extends BottomSheetDialogFragment {
    private Context context;

    TextView txt_submit;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_forgot_password, container, false);
        context = getContext();
        ButterKnife.bind(this,view);



        return view;
    }

    @OnClick({R.id.txt_submit1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_submit1:
              //  Toast.makeText(context, "submit clicked", Toast.LENGTH_SHORT).show();
               // startActivity(new Intent(context, HomeActivity.class));

                OtpBottomsheet otpBottomsheet=new OtpBottomsheet();
                otpBottomsheet.show(getFragmentManager(),"otpsheet");
                dismiss();

                break;
        }
    }





}
