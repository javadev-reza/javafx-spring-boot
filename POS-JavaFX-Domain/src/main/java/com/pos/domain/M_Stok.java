package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="M_Stok")
public class M_Stok extends BaseMaster{
    
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
    
    @Column(name="jmlStok", nullable=false)
    private Float jmlStok;

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
     * @return the jmlStok
     */
    public Float getJmlStok() {
        return jmlStok;
    }

    /**
     * @param jmlStok the jmlStok to set
     */
    public void setJmlStok(Float jmlStok) {
        this.jmlStok = jmlStok;
    }

    
}
