package dsapartone;

public class QuestionFour {
    public static int maxProfit(int[] prices) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {

                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
        public static void main(String[] args) {
            int[] prices = {1, 7, 3, 4, 6};
            System.out.println("Max Profit: " + maxProfit(prices));
        }
    }


