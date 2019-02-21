package net.mln.mongodemo.controller;

/**
 * @Description：简单选择排序
 * @author：MLNSOFT-GJH
 * @createDate：2019/2/20
 * @company：北京木联能软件股份有限公司
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] src = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 34, 15, 35, 25, 53, 51};
        System.out.print("原始数组排序：");
        for (int i : src) {
            System.out.print(i + ",");
        }
        System.out.println();
        selectSort(src);
        System.out.print("数组排序后：");
        for (int i : src) {
            System.out.print(i + ",");
        }
    }

    private static void selectSort(int[] arr) {
        int position;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            position = i;
             temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                //右边小于左边
                if (arr[j] < temp) {
                    temp = arr[j];
                    position = j;
                }
            }
            arr[position] = arr[i];
            arr[i] = temp;

        }
    }
}
