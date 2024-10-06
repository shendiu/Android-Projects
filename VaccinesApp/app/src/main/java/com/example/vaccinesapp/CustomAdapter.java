package com.example.vaccinesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    VaccineModelClass dataList[];

    private static ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public CustomAdapter(VaccineModelClass[] dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.my_custom_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final VaccineModelClass myListData = dataList[position];
        holder.textView.setText(dataList[position].getTitle());
        holder.imageView.setImageResource(dataList[position].getImage());
    }

    @Override
    public int getItemCount() {
        return dataList.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public ImageView imageView;
        public TextView textView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if(clickListener != null){
                clickListener.onClick(v,getAdapterPosition());
            }

        }
    }

}
