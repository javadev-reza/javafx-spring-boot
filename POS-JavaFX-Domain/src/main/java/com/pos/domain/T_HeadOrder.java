package com.pos.domain;

import com.pos.library.BaseTransaction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_HeadOrder")
public class T_HeadOrder extends BaseTransaction{
    
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
    
    @ManyToOne
    @JoinColumn(name="deviceFk")
    private M_Device device;
    
    @Column(name="deviceFk", nullable=false, insertable=false, updatable=false)
    private Integer deviceId;
    
    @ManyToOne
    @JoinColumn(name="pegawaiFk")
    private M_Pegawai pegawai;
    
    @Column(name="pegawaiFk", nullable=false, insertable=false, updatable=false)
    private Integer pegawaiId;

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
     * @return the device
     */
    public M_Device getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(M_Device device) {
        this.device = device;
    }

    /**
     * @return the deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId the deviceId to set
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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
