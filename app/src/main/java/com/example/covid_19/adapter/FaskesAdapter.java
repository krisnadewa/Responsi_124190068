package com.example.covid_19.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid_19.R;
import com.example.covid_19.model.faskes.FaskesDataItem;

import java.util.ArrayList;

public class FaskesAdapter extends RecyclerView.Adapter<FaskesAdapter.ViewHolder> {
    private ArrayList<FaskesDataItem> faskesDataItems;
    private Context context;

    public FaskesAdapter(Context context, ArrayList<FaskesDataItem> faskesDataItems) {
        this.context = context;
        this.faskesDataItems = faskesDataItems;
    }

    public void setFaskesDataItems(ArrayList<FaskesDataItem> faskesDataItems){
        this.faskesDataItems = faskesDataItems;
    }

    @NonNull
    @Override
    public FaskesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist_faskes,parent,false);
        return new FaskesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaskesAdapter.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return faskesDataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRsrujukan, tvAlamat;
        Button btMaps;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRsrujukan = itemView.findViewById(R.id.tv_rsrujukan);
            tvAlamat = itemView.findViewById(R.id.tv_address);
            btMaps = itemView.findViewById(R.id.bt_maps);
        }

        public void bind(int position) {
            tvRsrujukan.setText(faskesDataItems.get(position).getNama());
            tvAlamat.setText(faskesDataItems.get(position).getAlamat());
        }
    }
}
