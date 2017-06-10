package com.pos.domain;

import com.pos.library.BaseTransaction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_MapMenuToBarang")
public class T_MapMenuToBarang extends BaseTransaction{
    
    @ManyToOne
    @JoinColumn(name="jenisMenuFk")
    private M_JenisMenu jenisMenu;
    
    @Column(name="jenisMenuFk", nullable=false, insertable=false, updatable=false)
    private Integer jenisMenuId;
    
    @ManyToOne
    @JoinColumn(name="barangFk")
    private M_Barang barang;
    
    @Column(name="barangFk", nullable=false, insertable=false, updatable=false)
    private Integer barangId;
    
    @ManyToOne
    @JoinColumn(name="satuanFk")
    private M_Satuan satuan;
    
    @Column(name="satuanFk", nullable=false, insertable=false, updatable=false)
    private Integer satuanId;
    
    @Column(name="qty", nullable=false)
    private Float qty;

    /**
     * @return the jenisMenu
     */
    public M_JenisMenu getJenisMenu() {
        return jenisMenu;
    }

    /**
     * @param jenisMenu the jenisMenu to set
     */
    public void setJenisMenu(M_JenisMenu jenisMenu) {
        this.jenisMenu = jenisMenu;
    }

    /**
     * @return the jenisMenuId
     */
    public Integer getJenisMenuId() {
        return jenisMenuId;
    }

    /**
     * @param jenisMenuId the jenisMenuId to set
     */
    public void setJenisMenuId(Integer jenisMenuId) {
        this.jenisMenuId = jenisMenuId;
    }

    /**
     * @return the barang
     */
    public M_Barang getBarang() {
        return barang;
    }

    /**
     * @param barang the barang to set
     */
    public void setBarang(M_Barang barang) {
        this.barang = barang;
    }

    /**
     * @return the barangId
     */
    public Integer getBarangId() {
        return barangId;
    }

    /**
     * @param barangId the barangId to set
     */
    public void setBarangId(Integer barangId) {
        this.barangId = barangId;
    }

    /**
     * @return the satuan
     */
    public M_Satuan getSatuan() {
        return satuan;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setSatuan(M_Satuan satuan) {
        this.satuan = satuan;
    }

    /**
     * @return the satuanId
     */
    public Integer getSatuanId() {
        return satuanId;
    }

    /**
     * @param satuanId the satuanId to set
     */
    public void setSatuanId(Integer satuanId) {
        this.satuanId = satuanId;
    }

    /**
     * @return the qty
     */
    public Float getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Float qty) {
        this.qty = qty;
    }
}
