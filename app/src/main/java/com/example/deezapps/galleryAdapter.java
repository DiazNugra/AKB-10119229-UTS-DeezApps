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

public class galleryAdapter extends RecyclerView.Adapter<galleryAdapter.myViewHolder> {

    Context mContext;
    List<gallery> mData;

    public galleryAdapter(Context mContext, List<gallery> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_gallery, parent, false);
        myViewHolder vHolder = new myViewHolder(view);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull galleryAdapter.myViewHolder holder, int position) {

        holder.iv_gallery.setImageResource(mData.get(position).getImg_gallery());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_gallery;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_gallery = (ImageView) itemView.findViewById(R.id.img_gallery);
        }

    }
}
