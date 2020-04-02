package com.example.linkmyparkingproject.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.BoyEditBookingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmBookingFragment extends Fragment {

    @BindView(R.id.txt_edit)
    TextView txt_edit;

    public ConfirmBookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_confirm_booking, container, false);

        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick({R.id.txt_edit})
    public void onClick(View view){
        switch(view.getId()){
            case R.id.txt_edit:
                startActivity(new Intent(getActivity(), BoyEditBookingActivity.class));
                break;
        }
    }
}
