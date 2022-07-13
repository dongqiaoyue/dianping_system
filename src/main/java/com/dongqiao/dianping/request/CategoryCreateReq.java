package com.dongqiao.dianping.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoryCreateReq {
    @NotBlank(message = "Please enter a valid name")
    private String name;

    @NotBlank(message = "Please enter a valid iconUrl")
    private String iconUrl;

    @NotNull(message = "weight can not be blank")
    private Integer sort;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
