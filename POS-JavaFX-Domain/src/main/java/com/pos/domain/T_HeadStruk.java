package com.pos.domain;

import com.pos.library.BaseTransaction;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_HeadStruk")
public class T_HeadStruk extends BaseTransaction{
    
    @ManyToOne
    @JoinColumn(name="detailStrukFk")
    private T_DetailStruk detailStruk;
    
    @Column(name="detailStrukFk", nullable=false, insertable=false, updatable=false)
    private String detailStrukId;
    
    @Column(name="tglStruk", nullable=false)
    private Date tglStruk;
    
    @ManyToOne
    @JoinColumn(name="detailOrderFk")
    private T_DetailOrder detailOrder;
    
    @Column(name="detailOrderFk", nullable=false, insertable=false, updatable=false)
    private String detailOrderId;
    
    @ManyToOne
    @JoinColumn(name="mejaFk")
    private M_Meja meja;
    
    @Column(name="mejaFk", nullable=false, insertable=false, updatable=false)
    private Integer mejaId;
    
    @Column(name="totalBayar", nullable=false)
    private Double totalBayar;
    
    @Column(name="totalDiskon", nullable=false)
    private Double totalDiskon;
    
    @Column(name="jmlBayar", nullable=false)
    private Double jmlBayar;
    
    @Column(name="jmlKembali", nullable=false)
    private Double jmlKembali;
    
    @ManyToOne
    @JoinColumn(name="pegawaiFk")
    private M_Pegawai pegawai;
    
    @Column(name="pegawaiFk", nullable=false, insertable=false, updatable=false)
    private Integer pegawaiId;

    /**
     * @return the detailStruk
     */
    public T_DetailStruk getDetailStruk() {
        return detailStruk;
    }

    /**
     * @param detailStruk the detailStruk to set
     */
    public void setDetailStruk(T_DetailStruk detailStruk) {
        this.detailStruk = detailStruk;
    }

    /**
     * @return the detailStrukId
     */
    public String getDetailStrukId() {
        return detailStrukId;
    }

    /**
     * @param detailStrukId the detailStrukId to set
     */
    public void setDetailStrukId(String detailStrukId) {
        this.detailStrukId = detailStrukId;
    }

    /**
     * @return the tglStruk
     */
    public Date getTglStruk() {
        return tglStruk;
    }

    /**
     * @param tglStruk the tglStruk to set
     */
    public void setTglStruk(Date tglStruk) {
        this.tglStruk = tglStruk;
    }

    /**
     * @return the detailOrder
     */
    public T_DetailOrder getDetailOrder() {
        return detailOrder;
    }

    /**
     * @param detailOrder the detailOrder to set
     */
    public void setDetailOrder(T_DetailOrder detailOrder) {
        this.detailOrder = detailOrder;
    }

    /**
     * @return the detailOrderId
     */
    public String getDetailOrderId() {
        return detailOrderId;
    }

    /**
     * @param detailOrderId the detailOrderId to set
     */
    public void setDetailOrderId(String detailOrderId) {
        this.detailOrderId = detailOrderId;
    }

    /**
     * @return the meja
     */
    public M_Meja getMeja() {
        return meja;
    }

    /**
     * @param meja the meja to set
     */
    public void setMeja(M_Meja meja) {
        this.meja = meja;
    }

    /**
     * @return the mejaId
     */
    public Integer getMejaId() {
        return mejaId;
    }

    /**
     * @param mejaId the mejaId to set
     */
    public void setMejaId(Integer mejaId) {
        this.mejaId = mejaId;
    }

    /**
     * @return the totalBayar
     */
    public Double getTotalBayar() {
        return totalBayar;
    }

    /**
     * @param totalBayar the totalBayar to set
     */
    public void setTotalBayar(Double totalBayar) {
        this.totalBayar = totalBayar;
    }

    /**
     * @return the totalDiskon
     */
    public Double getTotalDiskon() {
        return totalDiskon;
    }

    /**
     * @param totalDiskon the totalDiskon to set
     */
    public void setTotalDiskon(Double totalDiskon) {
        this.totalDiskon = totalDiskon;
    }

    /**
     * @return the jmlBayar
     */
    public Double getJmlBayar() {
        return jmlBayar;
    }

    /**
     * @param jmlBayar the jmlBayar to set
     */
    public void setJmlBayar(Double jmlBayar) {
        this.jmlBayar = jmlBayar;
    }

    /**
     * @return the jmlKembali
     */
    public Double getJmlKembali() {
        return jmlKembali;
    }

    /**
     * @param jmlKembali the jmlKembali to set
     */
    public void setJmlKembali(Double jmlKembali) {
        this.jmlKembali = jmlKembali;
    }

    /**
     * @return the pegawai
     */
    public M_Pegawai getPegawai() {
        return pegawai;
    }

    /**
     * @param pegawai the pegawai to set
     */
    public void setPegawai(M_Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    /**
     * @return the pegawaiId
     */
    public Integer getPegawaiId() {
        return pegawaiId;
    }

    /**
     * @param pegawaiId the pegawaiId to set
     */
    public void setPegawaiId(Integer pegawaiId) {
        this.pegawaiId = pegawaiId;
    }
    
}
