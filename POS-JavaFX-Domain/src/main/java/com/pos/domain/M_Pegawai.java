package com.pos.domain;

import com.pos.library.BaseMaster;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M_Pegawai")
public class M_Pegawai extends BaseMaster{
    
    @Column(name="identitasPegawai", nullable=false, length=50)
    private String identitasPegawai;
    
    @Column(name="namaPegawai", nullable=false, length=50)
    private String namaPegawai;
    
    @Column(name="tglMasukPegawai", nullable=false)
    private Date tglMasukPegawai;
    
    @Column(name="alamatPegawai", nullable=true, length=200)
    private String alamatPegawai;

    /**
     * @return the identitasPegawai
     */
    public String getIdentitasPegawai() {
        return identitasPegawai;
    }

    /**
     * @param identitasPegawai the identitasPegawai to set
     */
    public void setIdentitasPegawai(String identitasPegawai) {
        this.identitasPegawai = identitasPegawai;
    }

    /**
     * @return the namaPegawai
     */
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     */
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    /**
     * @return the tglMasukPegawai
     */
    public Date getTglMasukPegawai() {
        return tglMasukPegawai;
    }

    /**
     * @param tglMasukPegawai the tglMasukPegawai to set
     */
    public void setTglMasukPegawai(Date tglMasukPegawai) {
        this.tglMasukPegawai = tglMasukPegawai;
    }

    /**
     * @return the alamatPegawai
     */
    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    /**
     * @param alamatPegawai the alamatPegawai to set
     */
    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }


}
