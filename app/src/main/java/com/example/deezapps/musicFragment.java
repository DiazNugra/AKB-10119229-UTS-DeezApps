package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
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


public class musicFragment extends Fragment {

    View v;
    private RecyclerView myRecycleView;
    private List<music> listMusic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_music, container, false);
        myRecycleView = (RecyclerView) v.findViewById(R.id.music_recyclerView);
        musicAdapter musicAdapter = new musicAdapter(getContext(), listMusic);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(musicAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listMusic = new ArrayList<>();
        listMusic.add(new music("リテラチュア", "Reina Ueda", R.drawable.coversong_literature));
        listMusic.add(new music("U", "Millenium Parade X Belle", R.drawable.coversong_u));
        listMusic.add(new music("青空なんて飛びたくなかった", "熊川みゆ", R.drawable.coversong_aozoranante));
        listMusic.add(new music("残響散歌", "AIMER", R.drawable.coversong_zankyousanka));
        listMusic.add(new music("Ordinary Days", "Milet", R.drawable.coversong_ordinary_days));
        listMusic.add(new music("Kyouen Red X Violet", "Afterglow X Roselia", R.drawable.coversong_kyouen));
        listMusic.add(new music("Akuma no ko", "Ai Higuchi", R.drawable.coversong_akuma));
        listMusic.add(new music("Massarana Daichi", "Ai Higuchi", R.drawable.coversong_akuma));
        listMusic.add(new music("群青", "Yoasobi", R.drawable.coversong_gunjou));

    }
}