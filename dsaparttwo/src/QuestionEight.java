//8. Fruit Basket Problem
//        Problem Statement
//
//        With a given array of characters where each character represents a fruit tree,
//        place the maximum number of fruits in each of 2 baskets. The only restriction is that each basket can have only one type of fruit.
//
//        You can start with any tree, but you can’t skip a tree once you have started. You will pick one fruit from each tree until you cannot, i.e.,
//        you will stop when you have to pick from a third fruit type.
//
//        Write a function to return the maximum number of fruits in both the baskets.
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