package com.sjaiaa.astore.service;

import com.sjaiaa.astore.entity.User;

/**
 * @author sjaiaa
 * @date 2023/3/11 21:36
 * @discription
 */
public interface UserFindService {
    User findUser(String username);
}
