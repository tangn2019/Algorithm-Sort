package Sort;

public class Selection<T extends Comparable<T>> extends Sort<T> {
    //选择排序：选择出最小的元素放在最左边，在剩余元素中继续这样做
    @Override
    public void sort(T[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for(int j = min; j < n; j++){
                if(less(nums[j],nums[min])){
                    min = j;
                }
            }
            swap(nums,i,min);
        }

    }
}
