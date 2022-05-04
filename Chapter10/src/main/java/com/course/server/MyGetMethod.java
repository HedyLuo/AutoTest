package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: hedy
 * @Date: 2022/05/03/21:26
 * @Description:
 */
@RestController
@Api(value = "/",description = "这是我全部的get方法")
public class MyGetMethod {

    @RequestMapping(value="/getCookies",method= RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到cookie值",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){

        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获得cookies成功";
    }
    /*
    * 要求客户端携带cookies才能访问的get请求
    * */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies才能访问的get请求",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "你必须带cookies信息才能访问成功";
        }
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login") &&
                    cookie.getValue().equals("true")){
                return "你必须带cookies信息才能访问成功";
            }
        }
        return "你必须带cookies信息才能访问成功";
    }

    /*
    * 开发一个需要携带参数才能访问的get请求
    * 第一种方式：1）url:key = value & key = value
    * */
    //模拟获取商品列表
    //url:http://127.0.0.1:8889/get/with/param?start=10&end=20
    @RequestMapping(value = "get/with/param",method = RequestMethod.GET)
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋",400);
        myList.put("鞋1",200);
        myList.put("鞋2",100);

        return myList;
    }
    /*
    * 第二种：url:ip:port/path/param
    * 如：http://127.0.0.1:8889/get/with/param/10/20
    * */

    @RequestMapping(value = "get/with/param/{start}/{end}")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋",400);
        myList.put("鞋1",200);
        myList.put("鞋2",100);

        return myList;
    }


}
