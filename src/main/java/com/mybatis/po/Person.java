package com.mybatis.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @auther：lcj
 * @date 2020/3/11 上午 8:50
 */
@Data
public class Person {
    private int person_id;
    private int age;
    private String name;
    private String sex;
    private  IdCard idCard;
}
