public class QuestionFive {

        public static boolean Jumpindexes(int[] nums) {
            int farthest = 0;


            for (int i = 0; i < nums.length; i++) {

                if (i > farthest) {
                    return false;
                }


                farthest = i + nums[i];


                if (farthest >= nums.length - 1) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            int[] nums = {2, 3, 1, 1, 4};
            System.out.println(Jumpindexes(nums));
        }
    }


