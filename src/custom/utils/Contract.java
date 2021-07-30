package custom.utils;

import java.util.Date;

public class Contract {
    private Integer propertyID;
    private Integer vendorID;
    private Date contractDate;
    private String status;
    private Integer marketingFee;
    private Integer commission;

    public Contract(Integer propertyID, Integer vendorID, Date contractDate, String status, Integer marketingFee, Integer commission) {
        this.propertyID = propertyID;
        this.vendorID = vendorID;
        this.contractDate = contractDate;
        this.status = status;
        this.marketingFee = marketingFee;
        this.commission = commission;
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

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMarketingFee() {
        return marketingFee;
    }

    public void setMarketingFee(Integer marketingFee) {
        this.marketingFee = marketingFee;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }
}
