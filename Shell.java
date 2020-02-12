package Sort;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    //希尔排序：有间隔的使用插入排序，并将间隔不断减少直至1
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        int h = n / 2;
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(nums[j], nums[j - h]); j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h /= 2;
        }
    }
}