package com.course.bean;

import lombok.Data;

/**
 * @Author: hedy
 * @Date: 2022/05/04/22:23
 * @Description:
 */

@Data
public class User {
    private String userName;
    private String name;
    private String age;
    private String sex;

    public void setName(String hedy) {
        name = hedy;
    }

    public void setAge(String s) {
        age = s;
    }

    public void setSex(String male) {
        sex = male;
    }

    public String getUserName() {
        return userName;
    }
}
