package com.example.linkmyparkingproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.BoyHomeActivity;
import com.example.linkmyparkingproject.fragment.ConfirmBookingFragment;
import com.example.linkmyparkingproject.fragment.OngoingBookingDetailFragment;
import com.example.linkmyparkingproject.model.BoyOngoingBookingModel;
import com.example.linkmyparkingproject.model.OngoingBookingModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BoyOngoingBookingAdapter extends RecyclerView.Adapter<BoyOngoingBookingAdapter.Viewholder> {

    private Context mcontext;
    private List<BoyOngoingBookingModel> boyOngoingBookingModelList;


    public BoyOngoingBookingAdapter(Context mcontext, List<BoyOngoingBookingModel> boyOngoingBookingModelList) {
        this.mcontext = mcontext;
        this.boyOngoingBookingModelList = boyOngoingBookingModelList;

    }

    @NonNull
    @Override
    public BoyOngoingBookingAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_ongoing, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoyOngoingBookingAdapter.Viewholder holder, int position) {

        BoyOngoingBookingModel ongoingBooking = boyOngoingBookingModelList.get(position);
        holder.img_vehicle.setImageResource(ongoingBooking.getVehicleType());
        holder.txt_numberPlate.setText(ongoingBooking.getNumberPlate());
        holder.txt_duration.setText(ongoingBooking.getDuration());
        holder.txt_time.setText(ongoingBooking.getTime());
        holder.txt_date.setText(ongoingBooking.getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                OngoingBookingDetailFragment myFragment = new OngoingBookingDetailFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, myFragment).addToBackStack(null).commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return boyOngoingBookingModelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_vehicle)
        ImageView img_vehicle;
        @BindView(R.id.txt_numberPlate)
        TextView txt_numberPlate;

        @BindView(R.id.txt_duration)
        TextView txt_duration;
        @BindView(R.id.txt_time)
        TextView txt_time;
        @BindView(R.id.txt_date)
        TextView txt_date;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
