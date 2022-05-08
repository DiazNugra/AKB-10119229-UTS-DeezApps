package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class dailyAdapter extends RecyclerView.Adapter<dailyAdapter.myViewHolder> {

    Context mContext;
    List<daily> mData;

    public dailyAdapter(Context mContext, List<daily> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_daily, parent, false);
        myViewHolder vHolder = new myViewHolder(view);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.tv_kegiatan.setText(mData.get(position).getKegiatan());
        holder.tv_deksKegiatan.setText(mData.get(position).getDeskKegiatan());
        holder.image.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_kegiatan;
        private TextView tv_deksKegiatan;
        private ImageView image;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_kegiatan = (TextView) itemView.findViewById(R.id.nama_kegiatan);
            tv_deksKegiatan = (TextView) itemView.findViewById(R.id.deskripsi_kegiatan);
            image = (ImageView) itemView.findViewById(R.id.img_daily);

        }
    }
}
