package supermarket;

import java.util.Arrays;

/**
 * @Author: hedy
 * @Date: 2023/09/06/23:17
 * @Description:
 */
public class LittleSuperMarket {
    String address;
    String superMarketName;
    int parkingCount;
    Merchandise merchandise;
    int[] suzu;

    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.suzu = new int[5];
        littleSuperMarket.suzu[0] = 9;
        int[] str = littleSuperMarket.suzu ;//重命名
        System.out.println(Arrays.toString(littleSuperMarket.suzu));
        System.out.println(Arrays.toString(str));
    }
}
