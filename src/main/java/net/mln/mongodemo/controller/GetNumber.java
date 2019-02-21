package net.mln.mongodemo.controller;


/**
 * @Description：取出字符串中的数字
 * @author：MLNSOFT-GJH
 * @createDate：2019/1/22
 * @company：北京木联能软件股份有限公司
 */
public class GetNumber {
    public static void main(String[] args) {
   String str="sadsadad5sa5d87sa6d86sa,./,wq,e/,wqe,wd8sa6d8sa8dsa6d8";
        StringBuilder stringBuilder = new StringBuilder();
        char[] str1Chars = str.toCharArray();
        for (char aChar : str1Chars) {
            if (Character.isDigit(aChar)){
                stringBuilder.append(aChar);
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
