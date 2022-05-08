package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
public class music {

    private String judulMusic;
    private String namaArtis;
    private int albumCover;

    public music(){

    }

    public music(String judulMusic, String namaArtis, int albumCover) {
        this.judulMusic = judulMusic;
        this.namaArtis = namaArtis;
        this.albumCover = albumCover;
    }

    public String getJudulMusic() {
        return judulMusic;
    }

    public void setJudulMusic(String judulMusic) {
        this.judulMusic = judulMusic;
    }

    public String getNamaArtis() {
        return namaArtis;
    }

    public void setNamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }

    public int getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }
}
