package custom.utils;

import java.util.Date;

public class Sale {
    private Integer propertyID;
    private Integer vendorID;
    private Integer salePrice;
    private String saleType;
    private Date saleDate;

    public Sale(Integer propertyID, Integer vendorID, Integer salePrice, String saleType, Date saleDate) {
        this.propertyID = propertyID;
        this.vendorID = vendorID;
        this.salePrice = salePrice;
        this.saleType = saleType;
        this.saleDate = saleDate;
    }

    public Integer getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Integer propertyID) {
        this.propertyID = propertyID;
    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}
