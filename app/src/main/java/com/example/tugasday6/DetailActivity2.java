package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity2 extends AppCompatActivity implements View.OnClickListener {
    private  String eps, namaAnime, overview, judul_alternatif, rating, aired, type, status, genres;
    private int logo_anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        namaAnime = getIntent().getStringExtra("namaAnime");
        eps = getIntent().getStringExtra("eps");
        overview = getIntent().getStringExtra("overview");
        judul_alternatif = getIntent().getStringExtra("judul_alternatif");
        rating = getIntent().getStringExtra("rating");
        aired = getIntent().getStringExtra("aired");
        type = getIntent().getStringExtra("type");
        status = getIntent().getStringExtra("Status");
        genres = getIntent().getStringExtra("Genres");
        logo_anime = getIntent().getIntExtra("gambar", 0);

        ImageView logo_anime2 = findViewById(R.id.logo_animeView);
        TextView overview2 = findViewById(R.id.overviewView);
        TextView judul_alternatif2 = findViewById(R.id.judul_alternatifView);
        TextView rating2 = findViewById(R.id.ratingView);
        TextView namaAnime2 = findViewById(R.id.namaAnimeView);
        TextView eps2 = findViewById(R.id.epsView);
        TextView aired2 = findViewById(R.id.airedView);
        TextView type2 = findViewById(R.id.typeView);
        TextView status2 = findViewById(R.id.statusView);
        TextView genres2 = findViewById(R.id.genresView);
        Button share = findViewById(R.id.btnShare);

        logo_anime2.setImageResource(logo_anime);
        overview2.setText(overview);
        judul_alternatif2.setText(judul_alternatif);
        rating2.setText(rating);
        namaAnime2.setText(namaAnime);
        eps2.setText(eps);
        aired2.setText(aired);
        type2.setText(type);
        status2.setText(status);
        genres2.setText(genres);

    share.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        Intent share = new Intent();
        share.setAction(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT,namaAnime + "\n" + rating + "\n" + genres + "\n" + overview);
        share.setType("text/plain");

        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);

    }
}