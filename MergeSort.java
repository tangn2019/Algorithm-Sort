package Sort;

import javax.swing.*;

public class MergeSort <T extends Comparable<T>> extends Sort<T> {
    //归并排序：将序列不断分组至有序，再将分组归并为有序序列（分组取中点）
    protected T[] temp;

    @Override
    public void sort(T[] nums){
        temp = (T[])new Comparable[nums.length];
        sort(nums,0,nums.length-1);
    }

    private void sort(T[] nums,int l, int h){
        if(h <= l)
            return;
        int mid = l + (h - l) / 2;
        sort(nums,l,mid);
        sort(nums,mid+1,h);
        merge(nums,l,mid,h);
    }
    private void merge(T[] nums,int l, int m, int h){
        int i = l, j = m+1;
        for(int k = l; k <= h; k++){
            temp[k] = nums[k];
        }
        for(int k = l; k <= h; k++){
            if(i > m)
                nums[k] = temp[j++];
            else if(j > h)
                nums[k] = temp[i++];
            else if(temp[i].compareTo(temp[j]) <= 0)
                nums[k] = temp[i++];
            else
                nums[k] = temp[j++];
        }
    }
}
