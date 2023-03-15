package com.sjaiaa.astore.service.Impl;

import com.sjaiaa.astore.entity.User;
import com.sjaiaa.astore.repository.UserRepository;
import com.sjaiaa.astore.service.UserFindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sjaiaa
 * @date 2023/3/11 21:37
 * @discription
 */
@Service
public class UserFindServiceImpl implements UserFindService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUser(String username) {
        return userRepository.findUserByUsername(username);
    }
}
