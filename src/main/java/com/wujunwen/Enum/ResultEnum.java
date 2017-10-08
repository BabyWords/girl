package com.wujunwen.Enum;

/**
 * Created by Keven on 2017/10/7.
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "你可能还在上小学"),
    MIDDLLE_SCHOOL(101, "你可能还在上初中"),;


    private Integer code;
    private String msg;

    ResultEnum(Integer code,String msg) {
        this.msg = msg;
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
