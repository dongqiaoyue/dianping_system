package com.dongqiao.dianping.common;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * @description: utility methods
 * @author: Dongqiao Yue
 * @create: 2022-06-22 15:35
 **/
public class CommonUtil {
    public static String processErrorString(BindingResult bindingResult){
        if (!bindingResult.hasErrors()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            stringBuilder.append(fieldError.getDefaultMessage() + ",");
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
