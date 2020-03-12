package com.mybatis.mapper;

import com.mybatis.po.IdCard;

/**
 * @auther：lcj
 * @date 2020/3/11 上午 10:23
 */
public interface IdCardMapper {
    IdCard findByIdCard(int id);
}
