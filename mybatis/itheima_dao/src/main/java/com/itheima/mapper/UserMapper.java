package com.itheima.mapper;

import com.itheima.domain.Order;
import com.itheima.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {

    public List<User> findAll() throws IOException;

    public User findById(int id);

    List<User> findByUser(User user);

    public List<User> findByIds(int[] ids);

    List<User> findUsers();

}
