package com.example.linkmyparkingproject.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.linkmyparkingproject.R;
import com.example.linkmyparkingproject.activity.OperatorAddParkingBoysActivity;
import com.example.linkmyparkingproject.model.AddParkingBoyModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddParkingBoyAdapter extends RecyclerView.Adapter<AddParkingBoyAdapter.Viewholder> {

    private Context mcontext;
    private List<AddParkingBoyModel> parkingBoyModelList;

    public AddParkingBoyAdapter(Context mcontext, List<AddParkingBoyModel> parkingBoyModelList) {
        this.mcontext = mcontext;
        this.parkingBoyModelList = parkingBoyModelList;
    }

    @NonNull
    @Override
    public AddParkingBoyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_parking_boys, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddParkingBoyAdapter.Viewholder holder, int position) {

        AddParkingBoyModel parkingBoy = parkingBoyModelList.get(position);
        holder.txt_no.setText(Integer.toString(parkingBoy.getsNo()));

        holder.img_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogDeleteParkingBoy();
            }
        });

        if (position==0){
            holder.const_top.setVisibility(View.VISIBLE);
        }
        else {
            holder.const_top.setVisibility(View.GONE);
        }

        holder.img_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent =new Intent(mcontext,OperatorAddParkingBoysActivity.class);
              intent.putExtra("title","Edit");
              mcontext.startActivity(intent);
            }
        });


    }

    private void showDialogDeleteParkingBoy() {
        final Dialog dialogDelete = new Dialog(mcontext, android.R.style.Theme_Black_NoTitleBar);
        dialogDelete.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogDelete.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogDelete.setContentView(R.layout.dialog_delete_parking_boy);
        dialogDelete.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialogDelete.setCanceledOnTouchOutside(true);


        TextView txt_no = dialogDelete.findViewById(R.id.txt_no);
        TextView txt_yes = dialogDelete.findViewById(R.id.txt_yes);

        txt_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogDelete.dismiss();
            }
        });

        txt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogDelete.dismiss();
            }
        });


        dialogDelete.show();

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        @BindView(R.id.txt_no)
        TextView txt_no;
        @BindView(R.id.img_delete)
        ImageView img_delete;
        @BindView(R.id.img_edit)
        ImageView img_edit;
        @BindView(R.id.const_top)
        ConstraintLayout const_top;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
