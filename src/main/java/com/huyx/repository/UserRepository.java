package com.huyx.repository;

import com.huyx.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Xuan on 2018/2/26.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByNameContains(String name);
}
