package Sort;

public class HeapSort<T extends Comparable<T>> extends Sort<T> {
    //堆排序：利用完全二叉树的性质，将数组建成有序堆，并取出返回数组
    @Override
    public void sort(T[] nums){
        int N = nums.length - 1;
        int k = (N - 1) / 2;
        while(k >= 0){
            sink(nums,k--,N);
        }
        while(N > 0){
            swap(nums,0,N--);
            sink(nums,0,N);
        }
    }
    private void sink(T[] nums,int k, int N){
        while(2 * k + 1 <= N ){
            int j = 2 * k + 1;
            if(j + 1 <= N && less(nums[j],nums[j+1]))
                j++;
            if(!less(nums[k],nums[j]))
                break;
            swap(nums,k,j);
            k = j;
        }
    }
}
