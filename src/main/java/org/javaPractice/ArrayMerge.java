package org.javaPractice;

import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] ary = {11,12,13,14,15};
        int[] bry = {9,8,7,6,5,8};
        int count = 0;
        int length = ary.length+bry.length;
        int[] mergedAry = new int[length];

        for(int i =0;i< ary.length;i++){
            mergedAry[count]=ary[i];
            count++;
        }
        for(int j =0;j< bry.length;j++){
            mergedAry[count]=bry[j];
            count++;
        }
        for(int c=0;c< mergedAry.length;c++){
            System.out.println(mergedAry[c]);
        }
        //Sort
        Arrays.sort(mergedAry);
        System.out.println(Arrays.toString(mergedAry));


        ArrayMerge arr = new ArrayMerge();
        arr.arrayprc();
        arr.combiningArrays();

    }

    public void arrayprc(){
        String[] atr = {"uday","kumar","yakala"};
        String[] btr = {"nani","math","grt"};
        List lis = new ArrayList<String>(Arrays.asList(atr));
        System.out.println(lis);
        lis.addAll(Arrays.asList(btr));
        System.out.println(lis);
        Object[] arra= lis.toArray();
        System.out.println(Arrays.toString(arra));
        Collections.sort(lis,Collections.reverseOrder());
        System.out.println("After Sorting & reverse  + "+lis);
    }

    public void combiningArrays(){
        int[] ars = {8,7,4,3,5,2,6};
        String[] srs = {"aq","sw","de","rf","dx","tg","pj"};
        for(int i=0;i<ars.length;i++){
            System.out.println(ars[i]);
            System.out.println(srs[i]);
        }
    }
}
