//4. Right Rotate the Array by One Index
//Problem Statement
//-----------------
//Create the method void rotateArray(int[] arr) which takes an array of integers and rotates the position of each element one to the right.
//The right-most element will rotate to become the left-most element.

public class QuestionFour {
    public static void rotateArray(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        rotateArray(arr);
        for (int num : arr) {
            System.out.print(" "+num);
        }
    }
}