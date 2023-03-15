package com.sjaiaa.astore.repository;

import com.sjaiaa.astore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sjaiaa
 * @date 2023/3/11 21:34
 * @discription
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUsername(String name);
}
