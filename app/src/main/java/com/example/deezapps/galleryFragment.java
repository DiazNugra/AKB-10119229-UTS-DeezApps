package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class galleryFragment extends Fragment {

    View v;
    private RecyclerView myRecycleView;
    private List<gallery> listGallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_gallery, container, false);
        myRecycleView = (RecyclerView) v.findViewById(R.id.gallery_recycler);
        galleryAdapter galleryAdapter = new galleryAdapter(getContext(), listGallery);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(galleryAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listGallery = new ArrayList<>();
        listGallery.add(new gallery(R.drawable.gallery_6));
        listGallery.add(new gallery(R.drawable.gallery_5));
        listGallery.add(new gallery(R.drawable.gallery_1));
        listGallery.add(new gallery(R.drawable.gallery_4));
        listGallery.add(new gallery(R.drawable.gallery_7));

    }
}