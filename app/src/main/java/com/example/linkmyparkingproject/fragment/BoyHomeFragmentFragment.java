package com.example.linkmyparkingproject.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.BoyHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoyHomeFragmentFragment extends Fragment {

    @BindView(R.id.const_onGoing)
    ConstraintLayout const_onGoing;
    @BindView(R.id.const_past)
    ConstraintLayout const_past;
    @BindView(R.id.txt_onGoing)
    TextView txt_onGoing;
    @BindView(R.id.txt_past)
    TextView txt_past;
    @BindView(R.id.booking_framelayout)
    FrameLayout booking_framelayout;


    public BoyHomeFragmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        BoyHomeActivity home=(BoyHomeActivity) getActivity();
        home.img_header.setVisibility(View.VISIBLE);
        home.txt_titleBoy.setVisibility(View.GONE);
     //   home.txt_titleBoy.setText("Booking Details");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boy_home_fragment, container, false);
        ButterKnife.bind(this, view);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.booking_framelayout, new BoyOngoingChildFragment(), null).commit();


        return view;
    }

    @OnClick({R.id.const_onGoing, R.id.const_past})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.const_onGoing:
                txt_onGoing.setTextColor(Color.parseColor("#FFFFFF"));
                const_onGoing.setBackground(getResources().getDrawable(R.drawable.bg_const_orange_2corner));
                txt_past.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                const_past.setBackground(getResources().getDrawable(R.drawable.bg_const_grey_2corner));

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.booking_framelayout, new BoyOngoingChildFragment(), null).commit();
                break;
            case R.id.const_past:
                txt_onGoing.setTextColor(getResources().getColor(R.color.colorDarkGrey));
                const_onGoing.setBackground(getResources().getDrawable(R.drawable.bg_const_ongoing));
                txt_past.setTextColor(Color.parseColor("#FFFFFF"));
                const_past.setBackground(getResources().getDrawable(R.drawable.bg_const_past));
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.booking_framelayout, new BoyPastChildFragment(), null).commit();

                break;


        }

    }
}
