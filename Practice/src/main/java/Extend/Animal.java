package Extend;

/**
 * @Author: hedy
 * @Date: 2022/05/02/14:53
 * @Description:继承
 */

//公共父类
public class Animal {
    String name;
    int age;
    public Animal(String myName,int myAge){
        name = myName;
        age = myAge;
    }
    public void eat(){
        System.out.println(name+"正在吃;");
    }
    public void sleep(){
        System.out.println(name+"正在睡觉哦;");
    }
    public void introduction(){
        System.out.println("大家好，我是"+name);
    }
}
