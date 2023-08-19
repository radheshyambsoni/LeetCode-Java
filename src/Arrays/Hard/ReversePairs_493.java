package Arrays.Hard;

// 493. Reverse Pairs
// https://leetcode.com/problems/reverse-pairs/
// Runtime 40 ms Beats 97.16%
// Memory 56.3 MB Beats 6.19%
// Aug 19, 2023

public class ReversePairs_493 {
    void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int idx = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        System.arraycopy(temp, 0, arr, low, temp.length);
    }

    int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1, cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2l * arr[right])
                right++;
            cnt += (right - (mid + 1));
        }

        return cnt;
    }

    int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return 0;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}