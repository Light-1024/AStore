package com.sjaiaa.astore.packet;

import com.alibaba.fastjson2.JSONObject;

/**
 * @author sjaiaa
 * @date 2023/3/12 09:38
 * @discription
 */
public class PacketBuff {
    private final int code;
    private final String reason;
    private final JSONObject toJson;
    public PacketBuff(int code,String reason,JSONObject toJson){
        this.code = code;
        this.reason = reason;
        this.toJson = toJson;
    }

    public String getData(){
        if(toJson == null){
            return Check(new JSONObject());
        }
        return Check(this.toJson);
    }
    private String Check(JSONObject json){
        json.put("code",this.code);
        json.put("reason",this.reason);
        return json.toJSONString();
    }
}
