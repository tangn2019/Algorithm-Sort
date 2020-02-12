package Sort;

public class Insertion<T extends Comparable<T>> extends Sort<T> {
    //插入排序：将元素从左到右依次插入到已排序的左侧序列中
    @Override
    public void sort(T[] nums){
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for(int j = i; j > 0 && less(nums[j],nums[j-1]); j--){
                swap(nums,j,j-1);
            }
        }
    }
}
