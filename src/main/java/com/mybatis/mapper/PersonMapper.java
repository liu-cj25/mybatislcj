package com.mybatis.mapper;

import com.mybatis.po.Person;
import org.apache.ibatis.annotations.Param;

/**
 * @auther：lcj
 * @date 2020/3/11 下午 12:06
 */
public interface PersonMapper {
    Person findPersonByID(Person person);
}
