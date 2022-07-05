package com.dongqiao.dianping.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @description: including all register request objects from web services
 * @author: Dongqiao Yue
 * @create: 2022-06-29 00:09
 **/
public class RegisterReq {

    @NotBlank(message = "Please enter a valid phone number")
    private String telphone;
    @NotBlank(message = "Please enter a valid password")
    private String password;
    @NotBlank(message = "Please enter a nickname")
    private String nickName;

    @NotNull(message = "Gender can not be blank")
    private Integer gender;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
