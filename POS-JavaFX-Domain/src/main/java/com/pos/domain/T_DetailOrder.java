package com.pos.domain;

import com.pos.library.BaseTransaction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_DetailOrder")
public class T_DetailOrder extends BaseTransaction{
    
    @ManyToOne
    @JoinColumn(name="menuFk")
    private M_Menu menu;
    
    @Column(name="menuFk", nullable=false, insertable=false, updatable=false)
    private Integer menuId;
    
    @Column(name="qty", nullable=false)
    private Float qty;
    
    @Column(name="hargaSatuan", nullable=false)
    private Double hargaSatuan;
    
    @Column(name="noStrukBayar", nullable=false)
    private String noStrukBayar;

    @Column(name = "statusOrder", nullable=true)
    private Integer statusOrder;

    /**
     * @return the menu
     */
    public M_Menu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(M_Menu menu) {
        this.menu = menu;
    }

    /**
     * @return the menuId
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId the menuId to set
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

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
     * @return the noStrukBayar
     */
    public String getNoStrukBayar() {
        return noStrukBayar;
    }

    /**
     * @param noStrukBayar the noStrukBayar to set
     */
    public void setNoStrukBayar(String noStrukBayar) {
        this.noStrukBayar = noStrukBayar;
    }

    /**
     * @return the statusOrder
     */
    public Integer getStatusOrder() {
        return statusOrder;
    }

    /**
     * @param statusOrder the statusOrder to set
     */
    public void setStatusOrder(Integer statusOrder) {
        this.statusOrder = statusOrder;
    }
   
}
