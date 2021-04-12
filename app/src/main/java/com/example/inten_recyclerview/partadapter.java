package com.example.inten_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class partadapter extends RecyclerView.Adapter<partadapter.viewholder> {
    private Context context;
    private ArrayList<partmodel> partmodels;

    public partadapter(Context context) {
        this.context = context;
    }

    public ArrayList<partmodel> getPartmodels() {
        return partmodels;
    }

    public void setPartmodels(ArrayList<partmodel> partmodels) {
        this.partmodels = partmodels;
    }

    @NonNull
    @Override
    public partadapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempart , parent,false);
        return new viewholder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull partadapter.viewholder holder, int position) {
        Glide.with(context).load(getPartmodels().get(position).getGambarpart()).into(holder.gambar);
        holder.text.setText(getPartmodels().get(position).getNamapart());
    }

    @Override
    public int getItemCount() {
        return getPartmodels().size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.iv_cetakgambar);
            text = itemView.findViewById(R.id.textgambar);
        }
    }
}
