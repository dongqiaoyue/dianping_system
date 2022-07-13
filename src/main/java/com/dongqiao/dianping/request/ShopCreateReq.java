package com.dongqiao.dianping.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ShopCreateReq {

    @NotBlank(message = "service name cannot be empty")
    private String name;

    @NotNull(message = "average price per person cannot be empty")
    private Integer pricePerMan;

    @NotNull(message = "latitude cannot be empty")
    private BigDecimal latitude;

    @NotNull(message = "longitude cannot be empty")
    private BigDecimal longitude;

    @NotNull(message = "service category cannot be empty")
    private Integer categoryId;

    private String tags;

    @NotBlank(message = "open time cannot be empty")
    private String startTime;

    @NotBlank(message = "close time cannot be empty")
    private String endTime;

    @NotBlank(message = "address cannot be empty")
    private String address;

    @NotNull(message = "shop id cannot be empty")
    private Integer sellerId;

    @NotBlank(message = "icon cannot be empty")
    private String iconUrl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricePerMan() {
        return pricePerMan;
    }

    public void setPricePerMan(Integer pricePerMan) {
        this.pricePerMan = pricePerMan;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
