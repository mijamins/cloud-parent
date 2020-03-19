package org.simon.clouddemo.util;

/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */

public enum PubConStant {
    //成功
    SUCCESS (20000,"操作成功"),
    //报错
    ERROR (20001,"操作失败"),
    //无权限
    NON_AUTHECIATION (20002,"无权限");

    private  Integer code;
    private  String message;

    PubConStant(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PubConStant{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
