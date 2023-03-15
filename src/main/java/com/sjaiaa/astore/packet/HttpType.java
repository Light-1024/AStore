package com.sjaiaa.astore.packet;

/**
 * @author sjaiaa
 * @date 2023/3/7 15:07
 * @discription
 */
public enum HttpType {

    LoginError(400,"用户名或密码错误"),
    OK(200,"请求成功"),
    NotLogin(401,"请求失败,未登录"),
    NotFoundPage(404,"请求失败,页面不存在"),

    TooManyRequest(401,"访问人数过多"),
    BlockPage(403,"你的访问次数过多已进入黑名单");

    int code;
    String reason;

    HttpType(int code,String reason) {
        this.code = code;
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public String getReason() {
        return reason;
    }


}
