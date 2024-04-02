package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimeAdapter animeAdapter;
    private ArrayList<AnimeModel> animeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // INISALISASI ANMEMODEL
        getData();

        recyclerView = findViewById(R.id.recycleview);
        animeAdapter = new AnimeAdapter(animeModel,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(animeAdapter);

    }

    private void getData() {
        animeModel = new ArrayList<>();
        animeModel.add(new AnimeModel("Tensei Shitara Slime","24 Episode",getString(R.string.overview1), "Judul Alternatif: That Time I Got Reincarnated as a Slime, TenSura, 転生したらスライムだった件", "Rating: 8.14 dari 790.379", "Tahun di Tayangkan: spring 2018", "Tipe: Anime","Status: Tamat","Genre: 2Action Adventure Comedy Fantasy Shounen", R.drawable.slime));
        animeModel.add(new AnimeModel("Tsukimichi: Moonlit ","12 Episode",getString(R.string.overview2),"Judul Alternatif: Tsukimichi -Moonlit Fantasy-","Rating: 7.75 dari 47.908","Tahun di Tayangkan:  6 July 2021","Tipe: Anime","Status: Tamat","Genre: Action Adventure Comedy Fantasy", R.drawable.michibiku));
        animeModel.add(new AnimeModel("No Game No Life","12 Episode",getString(R.string.overview3),"Judul Alternatif: NGNL","Rating: 8.08 dari 1.475.753","Tahun di Tayangkan:  9 April 2014","Tipe: Anime","Status: Tamat","Genre: Adventure Comedy Ecchi Fantasy Game Supernatural",  R.drawable.nogame));
        animeModel.add(new AnimeModel("kage no jitsuryokusha","24 Episode",getString(R.string.overview4),"Judul Alternatif: The Eminence in Shadow, Shadow Garden, 陰の実力者になりたくて！","Rating: 8.3 dari 322.877","Tahun di Tayangkan: 5 October 2022","Tipe: Anime","Status: Tamat","Genre: Action Comedy Fantasy", R.drawable.kageshadow));
        animeModel.add(new AnimeModel("Overlord","24 Episode",getString(R.string.overview5),"Judul Alternatif: Overlord","Rating: 8.05 dari 112.281","Tahun di Tayangkan: 6 July 2015","Tipe: Anime","Status: Ongoing","Genre: Action Adventure Fantasy Game Magic Supernatural", R.drawable.overlord));
        animeModel.add(new AnimeModel("Youjo Senki","13 Episode",getString(R.string.overview6),"Judul Alternatif: The Military Chronicles of a Little Girl","Rating: 7.96 dari 469.157","Tahun di Tayangkan: 6 January 2017","Tipe: Anime","Status: Tamat","Genre: Action Fantasy Isekai Magic Military Reincarnation", R.drawable.youjosenki));
        animeModel.add(new AnimeModel("Youkoso Jitsuryoku","13 Episode",getString(R.string.overview7),"Judul Alternatif: Welcome to the Classroom of the Elite, You-jitsu","Rating: 7.86 dari 713.677","Tahun di Tayangkan: 2 July 2017","Tipe: Anime","Status: Ongoing","Genre: Drama Psychological School Slice of Life", R.drawable.youkosoayano));
        animeModel.add(new AnimeModel("Hanebado!","13 Episode",getString(R.string.overview8),"Judul Alternatif: The Badminton play of Ayano Hanesaki!","Rating: 6.85 dari 72.230","Tahun di Tayangkan: 2 July 2018","Tipe: Anime","Status: Tamat","Genre: School Seinen Sports", R.drawable.hanebado));
        animeModel.add(new AnimeModel("Mushoku Tensei","12 Episode",getString(R.string.overview9),"Judul Alternatif: Mushoku Tensei: Jobless Reincarnation, Jobless Reincarnation: I Will Seriously Try If I Go To Another World, 無職転生 ～異世界行ったら本気だす～","Rating: 8.37 dari 796.656","Genre: Tahun di Tayangkan: 11 January 2021","Tipe: Anime","Status: Tamat","Adventure Drama Ecchi Fantasy Magic", R.drawable.mushokurudeus));
        animeModel.add(new AnimeModel("Re:Zero","25 Episode",getString(R.string.overview10),"Judul Alternatif: Re: Life in a different world from zero, Re:Zero, ReZero","Rating: 8.24 dari 1.336.609","Tahun di Tayangkan: 4 April 2016","Tipe: Anime","Status: Tamat","Genre: Drama Fantasy Psychological Suspense Thriller", R.drawable.rezero));
        animeModel.add(new AnimeModel("Kakegurui","12 Episode",getString(R.string.overview11),"Judul Alternatif: Kakegurui: Compulsive Gambler","Rating: 7.58 dari 89.072","Tahun di Tayangkan: 30 June 2017","Tipe: Anime","Status: Tamat","Genre: Drama Game Mystery Psychological School Shounen", R.drawable.kakegurui));
        animeModel.add(new AnimeModel("Shigatsu wa Kimi no Uso","22 Episode",getString(R.string.overview12),"Judul Alternatif: Kimiuso","Rating: 8.65 dari 1.278.709","Tahun di Tayangkan: 10 October 2014","Tipe: Anime","Status: Tamat","Genre: Drama Music Romance School Shounen", R.drawable.shigatsubiola));
        animeModel.add(new AnimeModel("Sousou no Frieren","28 Episode",getString(R.string.overview13),"Judul Alternatif: Frieren at the Funeral","Rating: 9.14 dari 137.918","Tahun di Tayangkan: 28 September 2023","Tipe: Anime","Status: Ongoing","Genre: Adventure Drama Fantasy Shounen", R.drawable.frieren));
        animeModel.add(new AnimeModel("Jujutsu Kaisen","23 Episode",getString(R.string.overview14),"Judul Alternatif: Jujutsu Kaisen, Sorcery Fight, JJK, 呪術廻戦","Rating: 8.62 dari 1.619.056","Tahun di Tayangkan: 3 October 2020","Tipe: Anime","Status: Tamat","Genre: Action Award Winning Demons Fantasy Horror School Shounen Supernatural", R.drawable.jujutsu));
        animeModel.add(new AnimeModel("Chainsaw Man","24 Episode",getString(R.string.overview15),"Judul Alternatif: Chainsaw Man, チェンソーマン","Rating: 8.53 dari 772.657","Tahun di Tayangkan: 12 October 2022","Tipe: Anime","Status: Tamat","Genre: Action Fantasy Supernatural", R.drawable.chainsow));
    }
}