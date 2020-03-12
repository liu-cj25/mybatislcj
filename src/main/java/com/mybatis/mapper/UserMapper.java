package com.mybatis.mapper;

import com.mybatis.po.User;

/**
 * @auther：lcj
 * @date 2020/3/12 上午 9:21
 */
public interface UserMapper {
    User findUserWithOrder(int user_id);
}
