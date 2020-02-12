package Sort;

public class Bubble<T extends Comparable<T>> extends Sort<T> {
    //冒泡排序：相邻元素较大的向右侧移动，这样一次循环下来最右侧的元素最大，剩余的元素再进行这样的循环
    @Override
    public void sort(T[] nums){
        int n = nums.length;
        boolean isSorted = false;
        for(int i = n - 1; i > 0 && !isSorted; i--){
            isSorted = true;
            for(int j = 0; j < i ; j++){
                if(less(nums[j+1],nums[j])){
                    swap(nums,j,j+1);
                    isSorted = false;
                }
            }
        }
    }
}
