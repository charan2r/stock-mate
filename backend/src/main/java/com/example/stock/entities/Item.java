package com.example.stock.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {
    @Id @GeneratedValue
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String code;

    @ManyToOne
    private Buyer buyer;

    @ManyToOne
    private Material material;

    private Boolean isSale = false;
    private Boolean isStockClearing = false;

    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;
    private BigDecimal finalPrice;
    private BigDecimal markupPercentage;
    private BigDecimal salesPercentage;

    public Item() {}
    public Long getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public Buyer getBuyer() {
        return buyer;
    }
    public Material getMaterial() {
        return material;
    }
    public Boolean getIsSale() {
        return isSale;
    }
    public Boolean getIsStockClearing() {
        return isStockClearing;
    }
    public BigDecimal getBuyingPrice() {
        return buyingPrice;
    }
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }
    public BigDecimal getFinalprice() {
        return finalPrice;
    }
    public BigDecimal getMarkupPercentage() {
        return markupPercentage;
    }
    public BigDecimal getSalesPercentage() {
        return salesPercentage;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }
    public void setIsStockClearing(Boolean isStockClearing) {
        this.isStockClearing = isStockClearing;
    }
    public void setBuyingPrice(BigDecimal buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public void setFinalprice(BigDecimal finalprice) {
        this.finalPrice = finalprice;
    }
    public void setMarkupPercentage(BigDecimal markupPercentage) {
        this.markupPercentage = markupPercentage;
    }
    public void setSalesPercentage(BigDecimal salesPercentage) {
        this.salesPercentage = salesPercentage;
    }
    
}
