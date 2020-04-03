package com.example.linkmyparkingproject.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.BoyHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class PastBookingDetailFragment extends Fragment {

    @BindView(R.id.txt_send)
    TextView txt_send;

    public PastBookingDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        BoyHomeActivity home = (BoyHomeActivity) getActivity();
        home.img_header.setVisibility(View.GONE);
        home.txt_titleBoy.setVisibility(View.VISIBLE);
        home.txt_titleBoy.setText("Booking Details");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_past_booking_detail, container, false);
        ButterKnife.bind(this, view);


        return view;
    }

    @OnClick({R.id.txt_send})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_send:
                showDialogNotification();
                break;
        }
    }

    private void showDialogNotification() {

        final Dialog dialogNotification = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogNotification.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogNotification.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogNotification.setContentView(R.layout.dialog_notification);
        dialogNotification.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogNotification.setCanceledOnTouchOutside(true);

        TextView txt_enterMessage = dialogNotification.findViewById(R.id.txt_enterMessage);

        txt_enterMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogMessage();
                dialogNotification.dismiss();

            }
        });
        dialogNotification.show();
    }

    private void showDialogMessage() {

        final Dialog dialogMessage = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogMessage.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogMessage.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogMessage.setContentView(R.layout.dialog_enter_message);
        dialogMessage.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogMessage.setCanceledOnTouchOutside(true);

        TextView txt_send = dialogMessage.findViewById(R.id.txt_send);

        txt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogMessage.dismiss();

            }
        });
        dialogMessage.show();
    }
}
