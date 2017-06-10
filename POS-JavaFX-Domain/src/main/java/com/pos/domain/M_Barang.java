package com.pos.domain;

import com.pos.library.BaseMaster;;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="M_Barang")
public class M_Barang extends BaseMaster{
    
    @Column(name="kodeBarang", nullable=false, length=10)
    private String kodeBarang;
    
    @Column(name="namaBarang", nullable=false, length=50)
    private String namaBarang;
    
    @Column(name = "statusBarang", nullable=true)
    private Integer statusBarang;

    /**
     * @return the kodeBarang
     */
    public String getKodeBarang() {
        return kodeBarang;
    }

    /**
     * @param kodeBarang the kodeBarang to set
     */
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the statusBarang
     */
    public Integer getStatusBarang() {
        return statusBarang;
    }

    /**
     * @param statusBarang the statusBarang to set
     */
    public void setStatusBarang(Integer statusBarang) {
        this.statusBarang = statusBarang;
    }

}
