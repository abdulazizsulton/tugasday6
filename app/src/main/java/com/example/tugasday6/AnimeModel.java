package com.example.tugasday6;

public class AnimeModel {
    private String namaAnime, eps;
    private String overview, judul_alternatif, rating, aired, type, status, genres;
    private int logoAnime;

    public AnimeModel(String namaAnime, String eps, String overview, String judul_alternatif, String rating, String aired, String type, String status, String genres, int logoAnime) {
        this.namaAnime = namaAnime;
        this.eps = eps;
        this.overview = overview;
        this.judul_alternatif = judul_alternatif;
        this.rating = rating;
        this.aired = aired;
        this.type = type;
        this.status = status;
        this.genres = genres;
        this.logoAnime = logoAnime;


    }

    public String getNamaAnime() {
        return namaAnime;
    }

    public void setNamaAnime(String namaAnime) {
        this.namaAnime = namaAnime;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getJudul_alternatif() {
        return judul_alternatif;
    }

    public void setJudul_alternatif(String judul_alternatif) {
        this.judul_alternatif = judul_alternatif;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getLogoAnime() {
        return logoAnime;
    }

    public void setLogoAnime(int logoAnime) {
        this.logoAnime = logoAnime;
    }
}
