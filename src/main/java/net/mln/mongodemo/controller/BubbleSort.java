package net.mln.mongodemo.controller;

/**
 * @Description：冒泡排序,从小到大
 * @author：MLNSOFT-GJH
 * @createDate：2019/2/20
 * @company：北京木联能软件股份有限公司
 */
public class BubbleSort {
    public static void main(String[] args) {
        String str = "21345323253243323376576586";
        char temp;
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (charArray[j]>charArray[j+1]){
                   temp= charArray[j];
                   charArray[j]=charArray[j+1];
                   charArray[j+1]=temp;
                }
            }
        }
        System.out.println(charArray);

    }
}
