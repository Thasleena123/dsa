import java.util.HashMap;

public class QuestionOne {


    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;


        for (int num : nums) {

            int complement = k - num;


            if (map.getOrDefault(complement, 0) > 0) {

                operations++;

                map.put(complement, map.get(complement) - 1);
            } else {

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 2, 1};
        int k = 4;
        System.out.println(maxOperations(nums, k));
    }
}


