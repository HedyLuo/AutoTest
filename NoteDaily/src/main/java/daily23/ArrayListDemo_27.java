package daily23;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hedy
 * @Date: 2023/08/26/19:54
 * @Description: 数组基本使用
 */
public class ArrayListDemo_27 {
    public static void baseNote(){
        int[] intArray = new int[9];
        System.out.println(intArray[2]);
        double[] doubleArray = new double[100];
        System.out.println(doubleArray[44]);
        //长度为2，值为3，4
        int[] yuwen1 = new int[]{3,4};
        System.out.println(yuwen1[0]);
        System.out.println(yuwen1[1]);
    }
    //存在分数相同的科目
    public static void sameMaxScore(){
        int[] kemuScores = new int[]{70,80,90,90,78,85};
        String[]  kemuNames =  new String[]{"语文","数学","英语","物理","化学","生物"};
        List<Integer> list = new ArrayList<>();
        int topScore = 0;
        for(int i = 0; i< kemuNames.length;i++){
            if(kemuScores[i]>topScore){
                topScore = kemuScores[i];
            }
        }
        for(int i = 0;i<kemuNames.length;i++){
            if(kemuScores[i]== topScore){
                list.add(i);
            }
        }
        System.out.println(list);
        //打印成绩最高的科目
        for (Integer integer : list) {
            System.out.println(kemuNames[integer]);
        }
    }
    public static void testArray(){
        // 创建一个数组
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        // 往数组中插入元素
        randomNumbers.add(22);
        randomNumbers.add(13);
        randomNumbers.add(35);
        randomNumbers.add(13);
        randomNumbers.add(40);
        System.out.println("ArrayList: " + randomNumbers);
        // 删除第一次出现 13 的元素
        randomNumbers.remove(Integer.valueOf(13));
//        System.out.println("13 是否被删除? " + result);
        System.out.println("使用 remove() 后: " + randomNumbers);
    }
    public static void main(String[] args) {
        sameMaxScore();
        baseNote();
        int yuwen =0,shuxue=1,yingyu=2,wuli=3,huaxue=4,shengwu =5;
        int totalScoreCount=6;
        double[] scores = new double[totalScoreCount];
        String[] scoresName = new String[totalScoreCount];
        scoresName[yuwen] = "语文";
        scoresName[shuxue] = "数学";
        scoresName[yingyu] = "英语";
        scoresName[wuli] = "物理";
        scoresName[huaxue] = "化学";
        scoresName[shengwu] = "生物";
        for(int i =0;i<totalScoreCount;i++){
            scores[i] = 80 + Math.random()*20;
            System.out.println(scoresName[i]+"科目成绩是："+scores[i]);
        }
        double maxScore = 0;
        int maxScoreIndex = -1;
        for(int i =0;i<totalScoreCount;i++){
            if(scores[i]>maxScore){
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        System.out.println("最好的成绩科目是："+scoresName[maxScoreIndex]);
    }
}
