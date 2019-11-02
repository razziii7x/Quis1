package com.example.quis1;

import android.graphics.drawable.Drawable;

public class Keluarga
{
    public String nama, status, hobi;
    public Drawable gambar;

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public Keluarga(Drawable gambar, String nama, String status, String hobi)
    {
        this.gambar = gambar;
        this.nama = nama;
        this.status = status;
        this.hobi = hobi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
}