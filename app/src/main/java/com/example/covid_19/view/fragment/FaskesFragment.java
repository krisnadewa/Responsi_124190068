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
import com.example.covid_19.adapter.FaskesAdapter;
import com.example.covid_19.view.viewmodel.FaskesViewModel;

import java.util.ArrayList;

public class FaskesFragment extends Fragment {
    private FaskesAdapter faskesAdapter;
    private RecyclerView rvFaskes;
    private FaskesViewModel faskesViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faskes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        faskesViewModel = new ViewModelProvider(this).get(FaskesViewModel.class);
        faskesAdapter = new FaskesAdapter(getActivity(), new ArrayList<>());

        rvFaskes = view.findViewById(R.id.rv_faskes);
        rvFaskes.setHasFixedSize(true);
        rvFaskes.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        rvFaskes.setAdapter(faskesAdapter);

        faskesViewModel.getFaskesDataItems().observe(requireActivity(), faskesDataItems -> {
            faskesAdapter.setFaskesDataItems(faskesDataItems);
            faskesAdapter.notifyDataSetChanged();

        });
        faskesViewModel.setFaskesDiscover();
    }
}