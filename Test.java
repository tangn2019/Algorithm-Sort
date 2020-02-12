package Sort;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Integer[] nums = {5, 4, 2, 1, 5, 6, 4, 2, 1, 2, 3, 7, 9,14,23,22,45,67,23,11,2,5,6,8,45};
        long start, end, duration;
        Selection a = new Selection();
        Bubble b = new Bubble();
        Insertion c = new Insertion();
        Shell d = new Shell();
        MergeSort e = new MergeSort();
        QuickSort f = new QuickSort();
        HeapSort g = new HeapSort();
        System.out.println("选择排序");
        print(shuffle(nums));
        start = System.nanoTime();
        a.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("冒泡排序");
        print(shuffle(nums));
        start = System.nanoTime();
        b.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("插入排序");
        print(shuffle(nums));
        start = System.nanoTime();
        c.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("希尔排序");
        print(shuffle(nums));
        start = System.nanoTime();
        d.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("归并排序");
        print(shuffle(nums));
        start = System.nanoTime();
        e.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("快速排序");
        print(shuffle(nums));
        start = System.nanoTime();
        f.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
        System.out.println("堆排序");
        print(shuffle(nums));
        start = System.nanoTime();
        g.sort(nums);
        end = System.nanoTime();
        duration = end - start;
        print(nums);
        System.out.println("耗时" + duration + "ns");
    }

    public static void print(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
    }

    public static Integer[] shuffle(Integer[] nums) {
        List<Comparable> list = Arrays.asList(nums);
        Collections.shuffle(list);
        list.toArray(nums);
        return nums;
    }
}
