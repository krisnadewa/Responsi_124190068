package com.example.covid_19.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid_19.R;
import com.example.covid_19.adapter.HarianAdapter;
import com.example.covid_19.view.viewmodel.HarianViewModel;

import java.util.ArrayList;

public class HarianFragment extends Fragment {
    private HarianAdapter harianAdapter;
    private RecyclerView rvHarian;
    private HarianViewModel harianViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_harian, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        harianViewModel = new ViewModelProvider(this).get(HarianViewModel.class);
        harianAdapter = new HarianAdapter(getActivity(), new ArrayList<>());

        rvHarian = view.findViewById(R.id.rv_harian);
        rvHarian.setHasFixedSize(true);
        rvHarian.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, true));
        rvHarian.setAdapter(harianAdapter);

        harianViewModel.getHarianContentItems().observe(requireActivity(), harianContentItems -> {
            harianAdapter.setHarianContentItems(harianContentItems);
            harianAdapter.notifyDataSetChanged();
            rvHarian.scrollToPosition(harianAdapter.getItemCount()-1);
        });
        harianViewModel.setHarianDiscover();
    }
}