package com.bohai.mapper;

import com.bohai.domain.User;

import java.util.List;
import java.util.ListResourceBundle;

public interface UserMapper {

    public List<User> findByCondition(User user);

    public List<User> findByIds(List<Integer> ids);
}
