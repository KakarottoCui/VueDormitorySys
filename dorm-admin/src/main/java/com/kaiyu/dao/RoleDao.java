package com.kaiyu.dao;

import com.kaiyu.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {

    List<Role> getAllRoles();

    int insert(Role role);

    int deleteByPrimaryKey(Integer rid);
}