package com.mybatis.po;

import lombok.Data;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/12 上午 9:00
 */
@Data
public class User {
    private int user_id;
    private String username;
    private String address;
    List<Orders> orders;
}
