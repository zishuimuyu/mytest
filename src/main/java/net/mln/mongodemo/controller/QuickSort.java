package net.mln.mongodemo.controller;

/**
 * @Description：快速排序算法
 * @author：MLNSOFT-GJH
 * @createDate：2019/2/20
 * @company：北京木联能软件股份有限公司
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {

        if (left < right) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, left, right);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, right);
        }

    }

    /**
     * 查找基准数据的正确索引
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int getIndex(int[] arr, int left, int right) {
        // 基准数据,tmp
        int tmp = arr[left];
        while (left < right) {
            // 当队尾(最右边)的元素大于等于基准数据时,向前挪动right指针
            while (left < right && arr[right] >= tmp) {
                right--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给left
            arr[left] = arr[right];
            // 当队首元素小于等于tmp时,向前挪动left指针
            while (left < right && arr[left] <= tmp) {
                left++;
            }
            // 当队首元素大于tmp时,需要将其赋值给right
            arr[right] = arr[left];

        }
        // 跳出循环时left和right相等,此时的left或right就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道left位置的值并不是tmp,所以需要将tmp赋值给arr[left]
        arr[left] = tmp;
        // 返回tmp的正确位置
        return left;
    }
}
