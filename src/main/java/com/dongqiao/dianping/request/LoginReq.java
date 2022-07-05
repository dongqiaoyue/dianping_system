package com.dongqiao.dianping.request;

import javax.validation.constraints.NotBlank;

/**
 * @description: including all login request objects from web services
 * @author: Dongqiao Yue
 * @create: 2022-07-03 01:09
 */
public class LoginReq {
    @NotBlank(message = "Please enter a valid phone number")
    private String telphone;
    @NotBlank(message = "Please enter a valid password")
    private String password;

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
