public class QuestionThree {
    public static void reArrange(int[] arr) {

        int[] leftSide = new int[arr.length];
        int[] rightSide = new int[arr.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                leftSide[leftIndex] = arr[i];
                leftIndex++;

            } else {
                rightSide[rightIndex] = arr[i];
                rightIndex++;
            }

        }

        int[] sortedArray = new int[leftIndex+rightIndex];
        System.arraycopy( leftSide,0,sortedArray,0,leftIndex);
        System.arraycopy(rightSide,0,sortedArray,leftIndex,rightIndex);
        for(int num:sortedArray){
            System.out.print(num+",");
        }
    }
    public  static void main(String[]args){
        int[] arr={6,7,8,-1,3,-2,-3};
        reArrange(arr);
    }
}
