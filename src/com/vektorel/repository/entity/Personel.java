package com.vektorel.repository.entity;


import com.vektorel.constants.Properties;
import com.vektorel.utility.StaticValues;

import java.util.UUID;

/**
 * BURASI ÇOK ÖNEMLİ,
 * static verileri çekerkeni bunları kısaltmak adına
 * Properties.PREFIX -> yerine static değer içeren sınıfı
 * static olarak import ederiz ve içindeki değerler ulaşırız.
 */
import static com.vektorel.utility.StaticValues.*;
import static com.vektorel.constants.Properties.PREFIX;

public class Personel {
    /**
     * kimlik
     */
    private String id;
    private String sirano;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int yas;
    /**
     * Durumu
     * 0-> pasif
     * 1-> aktif
     * 2-> izinde
     */
    // Enum -> numaralandırma
    int state;

    public Personel(){
        /**
         * otomatik id verecek
         */
        this.id = UUID.randomUUID().toString();
        this.sirano = PREFIX+ getPrs_sirano();

    }

    /**
     * Get
     * Set
     * methodları
     */

    public String getSirano(){
        return this.sirano;
    }
    public String getId(){
        return this.id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
