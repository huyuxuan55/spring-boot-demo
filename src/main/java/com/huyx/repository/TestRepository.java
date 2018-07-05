package com.huyx.repository;

import com.huyx.entity.Test;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Xuan on 2018/6/5.
 */
@RepositoryRestResource(collectionResourceRel = "test", path = "test")
public interface TestRepository extends PagingAndSortingRepository<Test,Long> {
}
