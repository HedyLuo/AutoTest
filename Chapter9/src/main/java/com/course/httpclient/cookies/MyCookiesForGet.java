package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author: hedy
 * @Date: 2022/04/30/21:54
 * @Description:
 */
public class MyCookiesForGet {

    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    //用来存储cookie信息的store

    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中拼接测试url
        String uri = bundle.getString("getCookies.uri");
        String testUrl = url + uri;
        //测试带cookie的get请求
        HttpGet get  = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookie信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList=  store.getCookies();
        for (Cookie cookie: cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie名称"+name);
            System.out.println("cookie值"+value);
        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String getCookie = bundle.getString("test.get.with.cookies");
        String testUrl =this.url+getCookie;

        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(this.store);
        // 访问链接
        HttpResponse response =  client.execute(get);
        // 获取响应状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        if(statusCode == 200){
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }

}
