package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M_Meja")
public class M_Meja extends BaseMaster{
    
    @Column(name="kodeMeja", nullable=false, length=10)
    private String kodeMeja;
    
    @Column(name="posisiMeja", nullable=true, length=50)
    private String posisiMeja;

    @Column(name = "statusMeja", nullable=true)
    private Integer statusMeja;

    /**
     * @return the kodeMeja
     */
    public String getKodeMeja() {
        return kodeMeja;
    }

    /**
     * @param kodeMeja the kodeMeja to set
     */
    public void setKodeMeja(String kodeMeja) {
        this.kodeMeja = kodeMeja;
    }

    /**
     * @return the posisiMeja
     */
    public String getPosisiMeja() {
        return posisiMeja;
    }

    /**
     * @param posisiMeja the posisiMeja to set
     */
    public void setPosisiMeja(String posisiMeja) {
        this.posisiMeja = posisiMeja;
    }

    /**
     * @return the statusMeja
     */
    public Integer getStatusMeja() {
        return statusMeja;
    }

    /**
     * @param statusMeja the statusMeja to set
     */
    public void setStatusMeja(Integer statusMeja) {
        this.statusMeja = statusMeja;
    }
}
