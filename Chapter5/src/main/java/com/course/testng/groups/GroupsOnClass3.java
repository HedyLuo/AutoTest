package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupOnClass3 {

    @Test
    public void tea1(){
        System.out.println("groups on class3--tea1");
    }

    @Test
    public void tea2(){
        System.out.println("groups on class3--tea2");
    }
}
