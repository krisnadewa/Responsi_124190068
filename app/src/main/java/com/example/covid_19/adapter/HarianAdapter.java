package com.example.covid_19.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid_19.R;
import com.example.covid_19.model.harian.HarianContentItem;

import java.util.ArrayList;

public class HarianAdapter extends RecyclerView.Adapter<HarianAdapter.ViewHolder> {
    private ArrayList<HarianContentItem> harianContentItems;
    private Context context;

    public HarianAdapter(Context context, ArrayList<HarianContentItem> harianContentItems) {
        this.context = context;
        this.harianContentItems = harianContentItems;
    }

    public void setHarianContentItems(ArrayList<HarianContentItem> harianContentItems){
        this.harianContentItems = harianContentItems;
    }

    @NonNull
    @Override
    public HarianAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist_harian,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HarianAdapter.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return harianContentItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTanggal, tvTerkonfirmasi, tvSembuh, tvMeninggal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTanggal = itemView.findViewById(R.id.tv_date);
            tvTerkonfirmasi = itemView.findViewById(R.id.tv_confirmed);
            tvSembuh = itemView.findViewById(R.id.tv_recovery);
            tvMeninggal = itemView.findViewById(R.id.tv_died);
        }

        public void bind(int position) {
            tvTanggal.setText(harianContentItems.get(position).getTanggal());
            tvTerkonfirmasi.setText(String.valueOf(harianContentItems.get(position).getConfirmationDiisolasi()));
            tvSembuh.setText(String.valueOf(harianContentItems.get(position).getConfirmationSelesai()));
            tvMeninggal.setText(String.valueOf(harianContentItems.get(position).getConfirmationMeninggal()));
        }
    }
}