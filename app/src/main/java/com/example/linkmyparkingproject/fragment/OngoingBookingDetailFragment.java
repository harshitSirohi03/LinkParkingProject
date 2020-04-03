package com.example.linkmyparkingproject.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.BoyHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class OngoingBookingDetailFragment extends Fragment {
    @BindView(R.id.txt_endParking)
    TextView txt_endParking;
    @BindView(R.id.txt_message)
    TextView txt_message;
    @BindView(R.id.img_edit)
    ImageView img_edit;

    public OngoingBookingDetailFragment() {
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
        View view = inflater.inflate(R.layout.fragment_ongoing_booking_detail, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick({R.id.txt_endParking, R.id.txt_message, R.id.img_edit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_endParking:
                showDialogEndParking();
                break;

            case R.id.txt_message:
                showDialogNotification();

                break;

            case R.id.img_edit:
                showDialogEditNumber();
                break;

        }

    }

    private void showDialogEditNumber() {
        final Dialog dialogEditNumber = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogEditNumber.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEditNumber.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogEditNumber.setContentView(R.layout.dialog_edit_number);
        dialogEditNumber.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogEditNumber.setCanceledOnTouchOutside(true);

        TextView txt_no = dialogEditNumber.findViewById(R.id.txt_no);
        TextView txt_yes = dialogEditNumber.findViewById(R.id.txt_yes);

        txt_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogEditNumber.dismiss();

            }
        });

        txt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogEnterNumber();
                dialogEditNumber.dismiss();
            }
        });
        dialogEditNumber.show();

    }

    private void showDialogEnterNumber() {

        final Dialog dialogEnterNumber = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogEnterNumber.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEnterNumber.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogEnterNumber.setContentView(R.layout.dialog_enter_number);
        dialogEnterNumber.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogEnterNumber.setCanceledOnTouchOutside(true);

        TextView txt_save = dialogEnterNumber.findViewById(R.id.txt_save);

        txt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogEnterNumber.dismiss();

            }
        });
        dialogEnterNumber.show();


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

    private void showDialogEndParking() {

        final Dialog dialogEndParking = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogEndParking.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEndParking.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogEndParking.setContentView(R.layout.dialog_end_parking);
        dialogEndParking.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogEndParking.setCanceledOnTouchOutside(true);


        TextView txt_no = dialogEndParking.findViewById(R.id.txt_no);
        TextView txt_yes = dialogEndParking.findViewById(R.id.txt_yes);

        txt_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogEndParking.dismiss();
            }
        });

        txt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogCollectMoney();
                dialogEndParking.dismiss();
            }
        });


        dialogEndParking.show();

    }

    private void showDialogCollectMoney() {

        final Dialog dialogCollectMoney = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogCollectMoney.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogCollectMoney.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogCollectMoney.setContentView(R.layout.dialog_collect_money);
        dialogCollectMoney.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogCollectMoney.setCanceledOnTouchOutside(true);


        RadioButton radio_cash = dialogCollectMoney.findViewById(R.id.radio_cash);
        RadioButton radio_paytm = dialogCollectMoney.findViewById(R.id.radio_paytm);

        TextView txt_proceed = dialogCollectMoney.findViewById(R.id.txt_proceed);

        txt_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radio_cash.isChecked()) {
                    showDialogPaymentReceived();
                    dialogCollectMoney.dismiss();

                } else if (radio_paytm.isChecked()) {

                } else {

                }
            }
        });

        dialogCollectMoney.show();
    }


    private void showDialogPaymentReceived() {

        final Dialog dialogPaymentReceived = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar);
        dialogPaymentReceived.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogPaymentReceived.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogPaymentReceived.setContentView(R.layout.dialog_payment_received);
        dialogPaymentReceived.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogPaymentReceived.setCanceledOnTouchOutside(true);

        TextView txt_received = dialogPaymentReceived.findViewById(R.id.txt_received);

        txt_received.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new PastBookingDetailFragment(), null).addToBackStack(null).commit();
                dialogPaymentReceived.dismiss();

            }
        });
        dialogPaymentReceived.show();


    }
}
