package net.mln.mongodemo.controller;

/**
 * @Description：插入排序法
 * @author：MLNSOFT-GJH
 * @createDate：2019/2/20
 * @company：北京木联能软件股份有限公司
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] src = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 23, 34, 15, 35, 25, 53, 51};
        System.out.print("原始数组排序：");
        for (int i : src) {
            System.out.print(i + ",");
        }
        System.out.println();
        insertSort(src);
        System.out.print("排序后的数组：");
        for (int i : src) {
            System.out.print(i + ",");
        }
    }

    private static void insertSort(int[] arr) {
        //用作比较的数据
        int temp;
        int j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            //当比到最左边或者遇到比temp小的数据时，结束循环
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
