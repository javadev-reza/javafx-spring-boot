package com.pos.domain;

import com.pos.library.BaseTransaction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_DetailStruk")
public class T_DetailStruk extends BaseTransaction{
    
    @Column(name="qty", nullable=false)
    private Float qty;
    
    @Column(name="hargaSatuan", nullable=false)
    private Double hargaSatuan;
    
    @Column(name="totalHarga", nullable=false)
    private Double totalHarga;
    
    @Column(name="diskon", nullable=false)
    private Double diskon;

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

    /**
     * @return the hargaSatuan
     */
    public Double getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * @param hargaSatuan the hargaSatuan to set
     */
    public void setHargaSatuan(Double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    /**
     * @return the totalHarga
     */
    public Double getTotalHarga() {
        return totalHarga;
    }

    /**
     * @param totalHarga the totalHarga to set
     */
    public void setTotalHarga(Double totalHarga) {
        this.totalHarga = totalHarga;
    }

    /**
     * @return the diskon
     */
    public Double getDiskon() {
        return diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }
}
