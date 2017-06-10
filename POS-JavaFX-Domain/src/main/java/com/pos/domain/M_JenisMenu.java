package com.pos.domain;

import com.pos.library.BaseMaster;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M_JenisMenu")
public class M_JenisMenu extends BaseMaster{
    
    @Column(name="namaJenisMenu", nullable=false, length=50)
    private String namaJenisMenu;

    /**
     * @return the namaJenisMenu
     */
    public String getNamaJenisMenu() {
        return namaJenisMenu;
    }

    /**
     * @param namaJenisMenu the namaJenisMenu to set
     */
    public void setNamaJenisMenu(String namaJenisMenu) {
        this.namaJenisMenu = namaJenisMenu;
    }
}
