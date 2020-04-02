package com.example.linkmyparkingproject.fragment;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoyMyAccountFragment extends Fragment {
    @BindView(R.id.img_rightArrow)
    ImageView img_rightArrow;
    @BindView(R.id.txt_profile)
    TextView txt_profile;
    @BindView(R.id.img_downArrrow)
    ImageView img_downArrrow;
    @BindView(R.id.const_profileInfo)
    ConstraintLayout const_profileInfo;

    public BoyMyAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_boy_my_account, container, false);
        ButterKnife.bind(this,view);

        return view;
    }

    @OnClick({R.id.txt_profile,R.id.img_rightArrow,R.id.img_downArrrow})
    public void onClick(View view){
        switch(view.getId()){
            case R.id.txt_profile:
                const_profileInfo.setVisibility(View.VISIBLE);
                img_downArrrow.setVisibility(View.VISIBLE);
                img_rightArrow.setVisibility(View.GONE);
                break;

            case R.id.img_downArrrow:
                const_profileInfo.setVisibility(View.GONE);
                img_rightArrow.setVisibility(View.VISIBLE);
                img_downArrrow.setVisibility(View.GONE);

                break;
        }
    }
}
