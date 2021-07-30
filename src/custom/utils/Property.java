package custom.utils;

public class Property {
    private Integer propertyID;
    private Integer streetNumber;
    private String street;
    private Integer bedrooms;
    private Integer bathrooms;
    private Integer propertySpace;
    private String propertyType;
    private Integer buildingSpace;
    private Integer landSpace;

    public Property(Integer propertyID, Integer streetNumber, String street, Integer bedrooms, Integer bathrooms, Integer propertySpace, String propertyType, Integer buildingSpace, Integer landSpace) {
        this.propertyID = propertyID;
        this.streetNumber = streetNumber;
        this.street = street;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.propertySpace = propertySpace;
        this.propertyType = propertyType;
        this.buildingSpace = buildingSpace;
        this.landSpace = landSpace;
    }

    public Integer getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Integer propertyID) {
        this.propertyID = propertyID;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getPropertySpace() {
        return propertySpace;
    }

    public void setPropertySpace(Integer propertySpace) {
        this.propertySpace = propertySpace;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Integer getBuildingSpace() {
        return buildingSpace;
    }

    public void setBuildingSpace(Integer buildingSpace) {
        this.buildingSpace = buildingSpace;
    }

    public Integer getLandSpace() {
        return landSpace;
    }

    public void setLandSpace(Integer landSpace) {
        this.landSpace = landSpace;
    }
}
