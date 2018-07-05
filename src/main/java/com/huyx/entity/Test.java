package com.huyx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Xuan on 2018/6/5.
 */
@Entity
public class Test implements Serializable{

    private static final long serialVersionUID = -7581575153806282209L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String[] userIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getUserIds() {
        return userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }
}
