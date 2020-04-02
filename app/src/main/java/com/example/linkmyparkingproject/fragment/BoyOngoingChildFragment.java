package com.example.linkmyparkingproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.adapter.OngoingBookingAdapter;
import com.example.linkmyparkingproject.model.OngoingBookingModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoyOngoingChildFragment extends Fragment {

    @BindView(R.id.rvBoy_ongoingBooking)
    RecyclerView rvBoy_ongoingBooking;
    private OngoingBookingAdapter ongoingBookingAdapter;
    private List<OngoingBookingModel> ongoingBookingModelList;

    public BoyOngoingChildFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_boy_ongoing_child, container, false);
        ButterKnife.bind(this, view);
        ongoingBookingModelList = new ArrayList<OngoingBookingModel>();
        setUpData();

        return view;
    }

    private void setUpData() {
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.bike, "UP 85 AV 1115", "1 hr 12min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.car, "UP 15 DA 1115", "1 hr 15min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.car, "UP 85 AV 1115", "1 hr 18min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.bus, "UP 17 MK 1115", "2 hr 12min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.auto, "UP 85 AV 1115", "3 hr 2min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.truck, "UP 18 BB 1115", "1 hr 12min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.truck, "UP 85 AV 1115", "8 hr 1min", "11:27 AM", "09/01/2020"));
        ongoingBookingModelList.add(new OngoingBookingModel(R.drawable.bike, "UP 19 MH 1115", "1 hr 12min", "11:27 AM", "09/01/2020"));

        rvBoy_ongoingBooking.setLayoutManager(new LinearLayoutManager(getContext()));
        ongoingBookingAdapter=new OngoingBookingAdapter(getContext(),ongoingBookingModelList);
        rvBoy_ongoingBooking.setAdapter(ongoingBookingAdapter);
    }
}
