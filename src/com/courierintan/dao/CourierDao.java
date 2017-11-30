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
    
    
    public double hitungBeratPaket(){
        double beratPaket = paket.getHargaTipe() * paket.getBerat();
    return beratPaket;
    }
    

    public List<Paket> tipePaket(String kota) {
        ArrayList<Paket> tarifs = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new File("C:/Java/tarif.txt"));

            while (scan.hasNextLine()) {
                Paket paket = new Paket();
                Tipe tipeP = new Tipe();
                String line = scan.nextLine();
                String[] data = line.split(",");
                String namaKota = data[0];
                paket.setJenisLayanan(tipeP);

//                paket.setKotaTujuan(data[0]);
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

    public List<Paket> tarifPaket() {
        ArrayList<Paket> tarifs = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new File("C:/Java/tarif.txt"));

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
