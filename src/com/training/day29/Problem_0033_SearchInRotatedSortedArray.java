package com.training.day29;

/**
 * @author ycb
 * @since 2021/10/16-12:04
 */
public class Problem_0033_SearchInRotatedSortedArray {

    // arr，原本是有序数组，旋转过，而且左部分长度不知道
    // 找num
    // num所在的位置返回
    // 寻找二分的范围
    public static int search(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int M = 0;
        while (L <= R) {
            M = L + ((R - L) >> 1);
            if (arr[M] == num) {
                return M;
            }
            // arr[M] != num
            // 如果[L] == [M] == [R],但 != num 无法二分
            if (arr[L] == arr[M] && arr[M] == arr[R]) {
                while (L != M && arr[L] == arr[M]) {
                    L++;
                }
                // 从while出来的情况:
                // 1) L == M L...M 一路都相等
                // 2) 从L到M终于找到了一个不等的位置
                if (L == M) {
                    L = M + 1;
                    continue;
                }
            }
            // arr[M] != num
            // [L] [M] [R] 不都一样的情况, 如何二分的逻辑
            if (arr[L] != arr[M]) {
                if (arr[M] > arr[L]) { // L...M 一定有序
                    if (num >= arr[L] && num < arr[M]) {
                        R = M - 1;
                    } else {
                        L = M + 1;
                    }
                } else { // [L] > [M]    L....M  存在断点
                    if (num > arr[M] && num <= arr[R]) {
                        L = M + 1;
                    } else {
                        R = M - 1;
                    }
                }
            } else { // [L] [M] [R] 不都一样，  [L] === [M] -> [M]!=[R]
                if (arr[M] < arr[R]) {
                    if (num > arr[M] && num <= arr[R]) {
                        L = M + 1;
                    } else {
                        R = M - 1;
                    }
                } else {
                    if (num >= arr[L] && num < arr[M]) {
                        R = M - 1;
                    } else {
                        L = M + 1;
                    }
                }
            }
        }
        return -1;
    }
}
