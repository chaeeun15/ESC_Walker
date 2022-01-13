package com.example.esc_walker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ViewHolder> {
    private ArrayList<Bus> items = new ArrayList<>();

    @NonNull
    @Override
    public ListViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAdapter.ViewHolder viewHolder, int position) {

        Bus item = items.get(position);

        viewHolder.tv_arrplandtime.setText(item.getArrplandtime());
        viewHolder.tv_depplandtime.setText(item.getDepplandtime());
        viewHolder.tv_depplacename.setText(item.getDepplacename());
        viewHolder.tv_charge.setText(item.getCharge());

    }

    @Override
    public int getItemCount() {
        if (items != null) {
            return items.size();
        }
        return 0;
    }

    public void setItems(ArrayList<Bus> items) {
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_arrplandtime, tv_depplandtime, tv_depplacename, tv_charge;

        ViewHolder(View itemView) {
            super(itemView);

            tv_arrplandtime = itemView.findViewById(R.id.tv_arrplandtime);
            tv_depplandtime = itemView.findViewById(R.id.tv_depplandtime);
            tv_depplacename = itemView.findViewById(R.id.tv_depplacename);
            tv_charge = itemView.findViewById(R.id.tv_charge);
        }
    }
}
