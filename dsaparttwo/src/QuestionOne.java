//1. Find Two Numbers that Add up to n (Use Quick Sort)
//        Problem Statement
//        -----------------
//        Create a method int[] findSum(int[] arr, int n) that takes an integer array arr and returns an array of the two integer elements that add up to integer n.
//        If there are multiple, return only one. If there is no such pair, return the original array.
import java.util.Arrays;

public class QuestionOne {

    public static int[] sum(int[] arr, int n) {
        quickSort(arr, 0, arr.length - 1);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == n) {
                return new int[]{arr[left], arr[right]};

            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20, 80};
        int number = 50;

        int[] result = sum(arr, number);
        System.out.println(Arrays.toString(result));
    }
}