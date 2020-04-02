package com.example.linkmyparkingproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.PastBookingAdapter;
import com.example.linkmyparkingproject.model.PastBookingModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoyPastChildFragment extends Fragment {
    @BindView(R.id.rvBoy_pastBooking)
    RecyclerView rvBoy_pastBooking;

    private PastBookingAdapter pastBookingAdapter;
    private List<PastBookingModel> pastBookingModelList;

    public BoyPastChildFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_boy_past, container, false);
        ButterKnife.bind(this, view);
        pastBookingModelList = new ArrayList<PastBookingModel>();
        setUpData();
        return  view;
    }

    private void setUpData() {

        pastBookingModelList.add(new PastBookingModel(R.drawable.bike, "UP 85 AV 1115", "1 hr 12min", "11:27 AM", "09/01/2020"));
        pastBookingModelList.add(new PastBookingModel(R.drawable.car, "UP 15 DA 1115", "1 hr 15min", "11:27 AM", "09/01/2020"));
        pastBookingModelList.add(new PastBookingModel(R.drawable.car, "UP 85 AV 1115", "1 hr 18min", "11:27 AM", "09/01/2020"));
        pastBookingModelList.add(new PastBookingModel(R.drawable.bus, "UP 17 MK 1115", "2 hr 12min", "11:27 AM", "09/01/2020"));
        pastBookingModelList.add(new PastBookingModel(R.drawable.auto, "UP 85 AV 1115", "3 hr 2min", "11:27 AM", "09/01/2020"));


        rvBoy_pastBooking.setLayoutManager(new LinearLayoutManager(getContext()));
        pastBookingAdapter=new PastBookingAdapter(getContext(),pastBookingModelList);
        rvBoy_pastBooking.setAdapter(pastBookingAdapter);
    }
}
