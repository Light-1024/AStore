package com.sjaiaa.astore.controller;

import com.sjaiaa.astore.packet.HttpType;
import com.sjaiaa.astore.packet.PacketBuff;
import com.sjaiaa.astore.service.UserFindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sjaiaa
 * @date 2023/3/11 21:40
 * @discription 项目控制器实现
 */
@RestController
public class HelloMain {
    @Autowired
    private UserFindService findService;
    @GetMapping("/main")
    public String Hello(String name){
        if(name == null){
            PacketBuff packetBuff = new PacketBuff(HttpType.NotFoundPage.getCode(), HttpType.NotFoundPage.getReason(), null);
            return packetBuff.getData();
        }
        return name;
    }
}
