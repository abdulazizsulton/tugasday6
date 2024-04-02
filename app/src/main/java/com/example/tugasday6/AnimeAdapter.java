package com.example.tugasday6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {

    private ArrayList<AnimeModel>animeModels;
    private Context context;

    public AnimeAdapter(ArrayList<AnimeModel> animeModels, Context context) {
        this.animeModels = animeModels;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }


    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.ViewHolder holder, int position) {
        AnimeModel animeModel = animeModels.get(position);


        holder.namaAnime.setText(animeModel.getNamaAnime());
        holder.eps.setText(animeModel.getEps());
        holder.rating.setText(animeModel.getRating());
        holder.overview.setText(animeModel.getOverview());
        holder.judul_alternatif.setText(animeModel.getJudul_alternatif());
        holder.aired.setText(animeModel.getAired());
        holder.type.setText(animeModel.getType());
        holder.status.setText(animeModel.getStatus());
        holder.genres.setText(animeModel.getGenres());
        holder.logoAnime.setImageResource(animeModel.getLogoAnime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity2.class);
                intent.putExtra("namaAnime",animeModel.getNamaAnime());
                intent.putExtra("eps",animeModel.getEps());
                intent.putExtra("overview",animeModel.getOverview());
                intent.putExtra("rating",animeModel.getRating());
                intent.putExtra("judul_alternatif",animeModel.getJudul_alternatif());
                intent.putExtra("aired",animeModel.getAired());
                intent.putExtra("type",animeModel.getType());
                intent.putExtra("status",animeModel.getStatus());
                intent.putExtra("genres",animeModel.getGenres());
                intent.putExtra("gambar",animeModel.getLogoAnime());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return animeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaAnime, eps, overview, judul_alternatif, rating, aired, type, status, genres;
        ImageView logoAnime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaAnime = itemView.findViewById(R.id.nama_anime);
            logoAnime = itemView.findViewById(R.id.logo_anime);
            rating = itemView.findViewById(R.id.rating);
            eps = itemView.findViewById(R.id.eps);
            overview = itemView.findViewById(R.id.overview);
            judul_alternatif = itemView.findViewById(R.id.judul_alternatif);
            aired = itemView.findViewById(R.id.aired);
            type = itemView.findViewById(R.id.type);
            status = itemView.findViewById(R.id.status);
            genres = itemView.findViewById(R.id.genres);


        }
    }
}
