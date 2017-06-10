package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M_Satuan")
public class M_Satuan extends BaseMaster{
    
    @Column(name="namaSatuan", nullable=false, length=50)
    private String namaSatuan;

    @Column(name = "statusSatuan", nullable=true)
    private Integer statusSatuan;

    /**
     * @return the namaSatuan
     */
    public String getNamaSatuan() {
        return namaSatuan;
    }

    /**
     * @param namaSatuan the namaSatuan to set
     */
    public void setNamaSatuan(String namaSatuan) {
        this.namaSatuan = namaSatuan;
    }

    /**
     * @return the statusSatuan
     */
    public Integer getStatusSatuan() {
        return statusSatuan;
    }

    /**
     * @param statusSatuan the statusSatuan to set
     */
    public void setStatusSatuan(Integer statusSatuan) {
        this.statusSatuan = statusSatuan;
    }
    
}
