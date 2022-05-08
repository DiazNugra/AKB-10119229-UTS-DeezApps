package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class musicAdapter extends RecyclerView.Adapter<musicAdapter.myViewHolder> {

    Context mContext;
    List<music> mData;

    public musicAdapter(Context mContext, List<music> mData){
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public musicAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_music, parent, false);
        myViewHolder vHolder = new myViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull musicAdapter.myViewHolder holder, int position) {
        holder.tv_judulMusic.setText(mData.get(position).getJudulMusic());
        holder.tv_artis.setText(mData.get(position).getNamaArtis());
        holder.iv_cover.setImageResource(mData.get(position).getAlbumCover());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_judulMusic;
        private TextView tv_artis;
        private ImageView iv_cover;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_judulMusic = (TextView) itemView.findViewById(R.id.nama_music);
            tv_artis = (TextView) itemView.findViewById(R.id.artis_music);
            iv_cover = (ImageView) itemView.findViewById(R.id.img_music);

        }
    }
}
