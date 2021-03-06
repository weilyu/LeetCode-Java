package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/21/2016.
 * https://leetcode.com/problems/merge-sorted-array/
 * Difficulty: Easy
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, 0 + m, n);
        Arrays.sort(nums1);
    }
}
