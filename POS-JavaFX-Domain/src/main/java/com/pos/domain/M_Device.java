package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M_Device")
public class M_Device extends BaseMaster{
    
    @Column(name="kodeImei", nullable=false, length=10)
    private String kodeImei;

    /**
     * @return the kodeImei
     */
    public String getKodeImei() {
        return kodeImei;
    }

    /**
     * @param kodeImei the kodeImei to set
     */
    public void setKodeImei(String kodeImei) {
        this.kodeImei = kodeImei;
    }
}
