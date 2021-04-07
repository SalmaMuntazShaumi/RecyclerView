package com.example.recyclerviewproject;

import android.provider.ContactsContract;

public class Mahasiswa {
    private String nama;
    private String email;
    private String nohp;

    public Mahasiswa(String nama, String email, String nohp) {
        this.nama = nama;
        this.email = email;
        this.nohp = nohp;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }



    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
