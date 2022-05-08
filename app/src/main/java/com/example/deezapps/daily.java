package com.example.deezapps;

/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */

public class daily {

    private String kegiatan;
    private String deskKegiatan;
    private int photo;


    public daily() {
    }


    public daily(String kegiatan, String deskKegiatan, int photo) {
        this.kegiatan = kegiatan;
        this.deskKegiatan = deskKegiatan;
        this.photo = photo;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getDeskKegiatan() {
        return deskKegiatan;
    }

    public void setDeskKegiatan(String deskKegiatan) {
        this.deskKegiatan = deskKegiatan;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
