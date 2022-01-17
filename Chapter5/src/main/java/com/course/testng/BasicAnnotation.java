package com.course.testng;
import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的组件，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.print("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.print("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("beforeMethod,在测试方法之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("afterMethod,在测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.print("beforeClass,在类之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.print("afterClass,在类之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.print("afterSuite测试套件");
    }
}
