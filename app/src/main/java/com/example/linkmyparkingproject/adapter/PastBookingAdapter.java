package com.example.linkmyparkingproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.OngoingBookingDetailActivity;
import com.example.linkmyparkingproject.activity.PastBookingDetailActivity;
import com.example.linkmyparkingproject.model.OngoingBookingModel;
import com.example.linkmyparkingproject.model.PastBookingModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PastBookingAdapter extends RecyclerView.Adapter<PastBookingAdapter.Viewholder> {
    private Context mcontext;
    private List<PastBookingModel> pastBookingModelList;

    public PastBookingAdapter(Context mcontext, List<PastBookingModel> pastBookingModelList) {
        this.mcontext = mcontext;
        this.pastBookingModelList = pastBookingModelList;
    }

    @NonNull
    @Override
    public PastBookingAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_past_booking, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PastBookingAdapter.Viewholder holder, int position) {
        PastBookingModel pastBooking = pastBookingModelList.get(position);
//        holder.txt_duration.setBackgroundColor(mcontext.getResources().getColor(R.color.colorGreyBooking));
//        holder.txt_duration.setTextColor(mcontext.getResources().getColor(R.color.colorDarkGrey));
        holder.img_pastVehicle.setImageResource(pastBooking.getVehicleType());
        holder.txt_pastNumberPlate.setText(pastBooking.getNumberPlate());
        holder.txt_pastDuration.setText(pastBooking.getDuration());
        holder.txt_pastTime.setText(pastBooking.getTime());
        holder.txt_pastDate.setText(pastBooking.getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcontext.startActivity(new Intent(mcontext, PastBookingDetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return pastBookingModelList.size();
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
