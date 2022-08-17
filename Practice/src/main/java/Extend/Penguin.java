package Extend;

/**
 * @Author: hedy
 * @Date: 2022/05/02/15:00
 * @Description：企鹅类
 */
public class Penguin extends Animal {
    public Penguin(String myName, int myAge) {
        super(myName, myAge);
    }

    public static void main(String[] args) {
        String name = "penguin";
        int age = 18;
        Penguin pg = new Penguin(name,age);
        pg.eat();
        pg.sleep();
        pg.introduction();
    }
}
