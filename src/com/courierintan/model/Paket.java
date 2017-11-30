/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courierintan.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Paket {

    private Date tanggalKirim;
    private String jenisBarang;
    private double berat;
    private double hargaBarang;
    private String ketAsuransi;
    private double asuransi;
    private String kotaTujuan;
    private Tipe jenisLayanan;
    private double hargaTipe;


    /**
     * @return the tanggalKirim
     */
    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    /**
     * @param tanggalKirim the tanggalKirim to set
     */
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the ketAsuransi
     */
    public String getKetAsuransi() {
        return ketAsuransi;
    }

    /**
     * @param ketAsuransi the ketAsuransi to set
     */
    public void setKetAsuransi(String ketAsuransi) {
        this.ketAsuransi = ketAsuransi;
    }

    /**
     * @return the asuransi
     */
    public double getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenisLayanan
     */
    public Tipe getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    public void setJenisLayanan(Tipe jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    @Override
    public String toString() {
        return this.getKotaTujuan(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the hargaTipe
     */
    public double getHargaTipe() {
        return hargaTipe;
    }

    /**
     * @param hargaTipe the hargaTipe to set
     */
    public void setHargaTipe(double hargaTipe) {
        this.hargaTipe = hargaTipe;
    }

    

}
