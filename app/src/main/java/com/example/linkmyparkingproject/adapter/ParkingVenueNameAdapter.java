package com.example.linkmyparkingproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.OperatorParkingDetailActivity;
import com.example.linkmyparkingproject.model.ParkingVenueNameModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ParkingVenueNameAdapter extends RecyclerView.Adapter<ParkingVenueNameAdapter.Viewholder> {

    private Context mcontext;
    private List<ParkingVenueNameModel> venueNameModelList;

    public ParkingVenueNameAdapter(Context mcontext, List<ParkingVenueNameModel> venueNameModelList) {
        this.mcontext = mcontext;
        this.venueNameModelList = venueNameModelList;
    }

    @NonNull
    @Override
    public ParkingVenueNameAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_parking_venue_name, parent, false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ParkingVenueNameAdapter.Viewholder holder, int position) {

        ParkingVenueNameModel venue=venueNameModelList.get(position);
        holder.txt_VenueName.setText(venue.getVenueName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcontext.startActivity(new Intent(mcontext, OperatorParkingDetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return venueNameModelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_VenueName)
        TextView txt_VenueName;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
