public class QuestionTwo {
    public static int findMinimum(int[] arr) {
        int smallestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallestElement > arr[i]) {
                smallestElement = arr[i];
            }
        }
        return smallestElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8};
        int smallestElement = findMinimum(arr);
        System.out.println("smallest value in the array=" + smallestElement);
    }
}