package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView mRecyclerView;
    CustomAdapter customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
   super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        customAdapter = new CustomAdapter((Context) getActivity(), getMyList());
        mRecyclerView.setAdapter(customAdapter);
    }
    private ArrayList<ModalClass> getMyList() {

        ArrayList<ModalClass> modalClasses = new ArrayList<>();

        ModalClass m = new ModalClass();
        m.setNama("Megaglo Highlighting Powder");
        m.setDetail("Wet n Wild");
        m.setImg(R.drawable.wetwild);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Halolight Luminizing Stick");
        m.setDetail("Rollover Reaction");
        m.setImg(R.drawable.moonlit);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Master Strobing Cream");
        m.setDetail("Maybelline");
        m.setImg(R.drawable.maybelline);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Face Contour Stick");
        m.setDetail("Focallure");
        m.setImg(R.drawable.focallure);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Highlighting Palette");
        m.setDetail("Sleek MakeUp");
        m.setImg(R.drawable.sleekmakeup);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("HIGHLIGHT PALETTE");
        m.setDetail("Beauty Creations");
        m.setImg(R.drawable.beautyc);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Ultra Highlighter");
        m.setDetail("Luxcrime");
        m.setImg(R.drawable.luxcrime);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Illuminating Shimmer Brick");
        m.setDetail("Lakmé");
        m.setImg(R.drawable.lakme);
        modalClasses.add(m);

        m = new ModalClass();
        m.setNama("Mary-Lou Manizer");
        m.setDetail("theBalm");
        m.setImg(R.drawable.marylou);
        modalClasses.add(m);

        return modalClasses;
    }
}