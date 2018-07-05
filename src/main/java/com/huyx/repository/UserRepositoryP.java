package com.huyx.repository;

import com.huyx.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Xuan on 2018/2/26.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepositoryP extends PagingAndSortingRepository<User,Long> {
}
