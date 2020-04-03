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
import com.example.linkmyparkingproject.fragment.OngoingBookingDetailFragment;
import com.example.linkmyparkingproject.fragment.PastBookingDetailFragment;
import com.example.linkmyparkingproject.model.BoyPastBookingModel;
import com.example.linkmyparkingproject.model.PastBookingModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BoyPastBookingAdapter extends RecyclerView.Adapter<BoyPastBookingAdapter.Viewholder> {
    private Context mcontext;
    private List<BoyPastBookingModel> boypastBookingModelList;

    public BoyPastBookingAdapter(Context mcontext, List<BoyPastBookingModel> boypastBookingModelList) {
        this.mcontext = mcontext;
        this.boypastBookingModelList = boypastBookingModelList;
    }

    @NonNull
    @Override
    public BoyPastBookingAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_past_booking, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoyPastBookingAdapter.Viewholder holder, int position) {

        BoyPastBookingModel pastBooking = boypastBookingModelList.get(position);

        holder.img_pastVehicle.setImageResource(pastBooking.getVehicleType());
        holder.txt_pastNumberPlate.setText(pastBooking.getNumberPlate());
        holder.txt_pastDuration.setText(pastBooking.getDuration());
        holder.txt_pastTime.setText(pastBooking.getTime());
        holder.txt_pastDate.setText(pastBooking.getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                PastBookingDetailFragment myFragment = new PastBookingDetailFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.home_frameLayout, myFragment).addToBackStack(null).commit();

            }
        });


    }

    @Override
    public int getItemCount() {
        return boypastBookingModelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_pastVehicle)
        ImageView img_pastVehicle;
        @BindView(R.id.txt_pastNumberPlate)
        TextView txt_pastNumberPlate;

        @BindView(R.id.txt_pastDuration)
        TextView txt_pastDuration;
        @BindView(R.id.txt_pastTime)
        TextView txt_pastTime;
        @BindView(R.id.txt_pastDate)
        TextView txt_pastDate;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
