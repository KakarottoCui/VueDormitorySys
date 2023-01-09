package com.kaiyu.dao;

import com.kaiyu.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {

    List<Menu> getAllMenusWithRole();

    List<Menu> getMenusByUserId(Integer userId);
}