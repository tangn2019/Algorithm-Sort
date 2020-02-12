package Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    //快速排序：取一个基准，以之为界分组排序，递归地得到有序序列（左指针找大于基准，右指针找小于基准，做右指针相遇达成一次循环）
    @Override
    public void sort(T[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(T[] nums, int l, int h) {
        if (l >= h)
            return;
        int j = partition(nums, l, h);
        sort(nums, l, j - 1);
        sort(nums, j + 1, h);
    }

    private int partition(T[] nums, int l, int h) {
        T v = nums[l];
        int i = l, j = h + 1;
        while (true) {
            while (less(v, nums[--j]) && j != l) ;
            while (less(nums[++i], v) && i != h) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
}
