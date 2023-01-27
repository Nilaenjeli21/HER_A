/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_A;

/**
 *
 * @author USER
 */
public class Service {
    private String kodetrans;
    private String tgltrans;
    private String pelanggan;
    private String jenisservice;
    private String biaya;
    private String diskon;
    private String total; 

    public Service(String kodetrans, String tgltrans, String pelanggan, String jenisservice, String biaya, String diskon, String total) {
        this.kodetrans = kodetrans;
        this.tgltrans = tgltrans;
        this.pelanggan = pelanggan;
        this.jenisservice = jenisservice;
        this.biaya = biaya;
        this.diskon = diskon;
        this.total = total;
    }

    public Service() {
        
    }

    public String getKodetrans() {
        return kodetrans;
    }

    public void setKodetrans(String kodetrans) {
        this.kodetrans = kodetrans;
    }

    public String getTgltrans() {
        return tgltrans;
    }

    public void setTgltrans(String tgltrans) {
        this.tgltrans = tgltrans;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getJenisservice() {
        return jenisservice;
    }

    public void setJenisservice(String jenisservice) {
        this.jenisservice = jenisservice;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
