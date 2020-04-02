package com.example.linkmyparkingproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.model.VehicleType;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VehicleTypeAdapter extends RecyclerView.Adapter<VehicleTypeAdapter.Viewholder> {

    private Context context;
    private List<VehicleType> vehicleTypeList;
    private int selected_position = -1;

    public VehicleTypeAdapter(Context context, List<VehicleType> vehicleTypeList) {
        this.context = context;
        this.vehicleTypeList = vehicleTypeList;
    }

    @NonNull
    @Override
    public VehicleTypeAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_vehicle, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleTypeAdapter.Viewholder holder, int position) {

        VehicleType type=vehicleTypeList.get(position);
        holder.img_vehicle.setImageResource(type.getVehicleImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                itemClickListener.onItemClickListener(position,appointmentServiceModelList.get(position).getTxt_pic());
                if(selected_position==position){
                    selected_position=-1;
                    notifyDataSetChanged();
                    return;
                }
                selected_position = position;
                notifyDataSetChanged();
            }
        });

        if (selected_position == position) {
            // do your stuff here like
//            holder.radioButton.setChecked(true);
            holder.img_radio.setImageDrawable(context.getResources().getDrawable(R.drawable.radio_checked));

        } else {
            // do your stuff here like
//            holder.radioButton.setChecked(false);
            holder.img_radio.setImageDrawable(context.getResources().getDrawable(R.drawable.radio_unchecked));
        }

    }

    @Override
    public int getItemCount() {
        return vehicleTypeList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_vehicle)
        ImageView img_vehicle;
        @BindView(R.id.img_radio)
        ImageView img_radio;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
