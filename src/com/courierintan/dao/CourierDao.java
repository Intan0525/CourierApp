/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courierintan.dao;

import com.courierintan.model.Paket;
import com.courierintan.model.Tipe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CourierDao {
    
    Paket paket = new Paket();
    
    public  double hitungBiayaPengiriman(double hitungBeratPaket, double hitungAsuransi){
    double biaya = hitungBeratPaket + hitungAsuransi;
    return biaya;
    }
    
    public double hitungAsuransi(double hargaBarang){
    double hitungAsuran = hargaBarang * 0.003;
    return hitungAsuran;
    }
    
    public double hitungBeratPaket(double hargaTipe, double berat) {
        double beratPaket = hargaTipe * berat;
        return beratPaket;
    }
    
  
    public Double getTarifPaket(String paketType, String namaKotaTujuan) {
        ArrayList<Paket> tarifs = new ArrayList<>();
        Double result = null;

        try {
            Scanner scan = new Scanner(new File("E:/datapaket.txt"));
            

            while (scan.hasNextLine()) {
//                Paket paket = new Paket();
                Tipe tipeP = new Tipe();
                String line = scan.nextLine();
                String[] data = line.split(",");
                String namaKota = data[0];
//                paket.setJenisLayanan(tipeP);
                System.out.println("");
                
                if(namaKotaTujuan.equalsIgnoreCase(namaKota)){
                    if(paketType.equalsIgnoreCase("regular")){
                        result = Double.parseDouble(data[1].trim());
                        System.out.println(Double.parseDouble(data[1].trim()));
                    } else if(paketType.equalsIgnoreCase("ons")){
                        result = Double.parseDouble(data[2].trim());
                        System.out.println(Double.parseDouble(data[2].trim()));
                    }else if(paketType.equalsIgnoreCase("hds")){
                        result = Double.parseDouble(data[3].trim());
                        System.out.println(Double.parseDouble(data[3].trim()));
                    }else if(paketType.equalsIgnoreCase("sds")){
                        result = Double.parseDouble(data[4].trim());
                        System.out.println(Double.parseDouble(data[4].trim()));
                    }
                }

//                paket.setKotaTujuan(data[0]);
                
                
            }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File Tidak Ada" + fileErr);
        }
        return result;
    }

    public List<Paket> tarifPaket() {
        ArrayList<Paket> tarifs = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new File("E:/datapaket.txt"));

            while (scan.hasNextLine()) {
                Paket paket = new Paket();
                Tipe tipeP = new Tipe();
                String line = scan.nextLine();
                String[] data = line.split(",");

                paket.setJenisLayanan(tipeP);

                paket.setKotaTujuan(data[0]);
                paket.getJenisLayanan().setRegular(Double.parseDouble(data[1].trim()));
                paket.getJenisLayanan().setOns(Double.parseDouble(data[2].trim()));
                paket.getJenisLayanan().setHds(Double.parseDouble(data[3].trim()));
                paket.getJenisLayanan().setSds(Double.parseDouble(data[4].trim()));
                tarifs.add(paket);

                for (Paket tarif : tarifs) {
                    System.out.println(tarif);
                }
            }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File Tidak Ada" + fileErr);
        }
        return tarifs;
    }

}
