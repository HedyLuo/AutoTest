package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: hedy
 * @Date: 2022/05/04/22:05
 * @Description:
 */
@RestController
@Api(value = "/",description = "这是我全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {
    //装cookie信息
    private static Cookie cookie;
    //用户登录成功获取到cookie，在访问其他接口获取列表
    @RequestMapping(value = "login",method= RequestMethod.POST)
    @ApiOperation(value ="登录接口，成功后获取cookies",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "password",required = true) String password){
        if(userName.equals("zhangsan") && password.equals("123456")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "恭喜登录成功了";
        }
        return "用户名或密码错误";

    }
    @RequestMapping(value="getUserList",method = RequestMethod.POST)
    @ApiOperation(value ="获取用户列表",httpMethod = "POSt")
    public String getUserLise(HttpServletRequest request,
                            @RequestBody User u){
        //获取cookie
        Cookie[] cookies = request.getCookies();
        //验证cookie
        for(Cookie c:cookies){
            if(c.getName()=="login"
                    && c.getValue() == "true"
                    && u.getUserName()=="zhangsan"){
                User user= new User();
                user.setName("hedy");
                user.setAge("18");
                user.setSex("male");
                return user.toString();
            }
        }
        return "参数不合法";
    }
}
