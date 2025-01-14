import java.util.HashMap;

public class QuestionEight {
    public static int maxFruit(char[] arr) {
        int left = 0;
        int maxFruits = 0;
        HashMap<Character, Integer> fruitCount = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            fruitCount.put(arr[right], fruitCount.getOrDefault(arr[right], 0) + 1);
            while (fruitCount.size() > 2) {
                char leftFruit = arr[left];
                fruitCount.put(leftFruit, fruitCount.get(leftFruit) - 1);
                if (fruitCount.get(leftFruit) == 0) {
                    fruitCount.remove(leftFruit);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }


    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'A'};
        System.out.println(maxFruit(arr));
    }
}