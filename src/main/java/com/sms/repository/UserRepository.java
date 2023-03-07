package com.sms.repository;

import com.sms.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author mei
 * @create 2023/2/8 16:27
 */
public interface UserRepository extends CrudRepository<User,Long> {

}