package Algorithm;

import java.util.Arrays;

/**
 * @Author: hedy
 * @Date: 2022/06/28/23:39
 * @Description:
 */
public class SortAlgorithm {

    //冒泡排序
    public static void bubleSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //快速排序
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            //设立基准数
            int stander=arr[start];
            int low = start;
            int high = end;
            //找出基准数小和大的数
            while(low<high){
                //右边的数字比基准数大
                while (low<high && stander<=arr[high]){
                    high--;
                }
                arr[low]=arr[high];
                //左边的数字比基准数小
                while(low<high && stander>=arr[low]){
                    low++;
                }
                arr[high]=arr[low];
            }
            //将基准数赋给低所在位置的元素
            arr[low] = stander;
            //处理基准数左边的数字
            quickSort(arr, start, low);
            //处理基准数右边的数字
            quickSort(arr,low+1,end);
        }
    }
    public static void main(String[] args){
        int [] arr = new int[]{4,7,9,0,3,4,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
