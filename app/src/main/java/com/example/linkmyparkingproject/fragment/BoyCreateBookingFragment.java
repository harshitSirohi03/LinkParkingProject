package com.example.linkmyparkingproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.VehicleTypeAdapter;
import com.example.linkmyparkingproject.model.VehicleType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoyCreateBookingFragment extends Fragment {
    @BindView(R.id.rv_vehicleType)
    RecyclerView rv_vehicleType;
    @BindView(R.id.txt_create)
    TextView txt_create;
    private VehicleTypeAdapter vehicleTypeAdapter;
    private List<VehicleType> vehicleTypeList;


    public BoyCreateBookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boy_create_booking, container, false);
        ButterKnife.bind(this,view);

        vehicleTypeList = new ArrayList<VehicleType>();
        setUpData();

        return view;
    }

    @OnClick({R.id.txt_create})
    public void onClick(View view){
        switch(view.getId()){
            case R.id.txt_create:

              getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, new ConfirmBookingFragment(), null).addToBackStack(null).commit();
                break;
        }
    }

    private void setUpData() {
        vehicleTypeList.add(new VehicleType(R.drawable.bike));
        vehicleTypeList.add(new VehicleType(R.drawable.auto));
        vehicleTypeList.add(new VehicleType(R.drawable.car));
        vehicleTypeList.add(new VehicleType(R.drawable.bus));
        vehicleTypeList.add(new VehicleType(R.drawable.truck));

        rv_vehicleType.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        vehicleTypeAdapter = new VehicleTypeAdapter(getActivity(), vehicleTypeList);
        rv_vehicleType.setAdapter(vehicleTypeAdapter);

    }
}
