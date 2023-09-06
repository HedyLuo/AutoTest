package daily23;

import java.util.Objects;

/**
 * @Author: hedy
 * @Date: 2023/09/04/22:58
 * @Description: 使用generate的hashCode和equals方法前需要先申明对象
 */
public class hashCodeAndEquals_85 {
    String str ;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof hashCodeAndEquals_85)) return false;
        hashCodeAndEquals_85 that = (hashCodeAndEquals_85) o;
        return str.equals(that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }

    @Override
    public String toString() {
        return "hashCodeAndEquals_85{" +
                "str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String s1 = "aaabbb";
        String s2 = "aaa" + "bbb";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true


    }
}
