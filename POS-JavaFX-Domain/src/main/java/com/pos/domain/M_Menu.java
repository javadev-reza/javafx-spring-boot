package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="M_Menu")
public class M_Menu extends BaseMaster{
    
    @Column(name="namaMenu", nullable=false, length=200)
    private String namaMenu;
    
    @Column(name="imageMenu", nullable=true)
    private Byte[] imageMenu;
    
    @Column(name="hargaMenu", nullable=false)
    private Double hargaMenu;
    
    @Column(name="ketMenu", nullable=true, length=200)
    private String ketMenu;
    
    @Column(name = "statusMenu", nullable=true)
    private Integer statusMenu;
    
    @ManyToOne
    @JoinColumn(name="jenisMenuFk")
    private M_JenisMenu jenisMenu;
    
    @Column(name="jenisMenuFk", nullable=false, insertable=false, updatable=false)
    private Integer jenisMenuId;

    /**
     * @return the namaMenu
     */
    public String getNamaMenu() {
        return namaMenu;
    }

    /**
     * @param namaMenu the namaMenu to set
     */
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    /**
     * @return the imageMenu
     */
    public Byte[] getImageMenu() {
        return imageMenu;
    }

    /**
     * @param imageMenu the imageMenu to set
     */
    public void setImageMenu(Byte[] imageMenu) {
        this.imageMenu = imageMenu;
    }

    /**
     * @return the hargaMenu
     */
    public Double getHargaMenu() {
        return hargaMenu;
    }

    /**
     * @param hargaMenu the hargaMenu to set
     */
    public void setHargaMenu(Double hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    /**
     * @return the ketMenu
     */
    public String getKetMenu() {
        return ketMenu;
    }

    /**
     * @param ketMenu the ketMenu to set
     */
    public void setKetMenu(String ketMenu) {
        this.ketMenu = ketMenu;
    }

    /**
     * @return the statusMenu
     */
    public Integer getStatusMenu() {
        return statusMenu;
    }

    /**
     * @param statusMenu the statusMenu to set
     */
    public void setStatusMenu(Integer statusMenu) {
        this.statusMenu = statusMenu;
    }

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
}
