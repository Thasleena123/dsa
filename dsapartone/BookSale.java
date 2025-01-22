//package dsapartone;
//
//public class BookSale {
//  import java.util.*;
//
//    public class BookSale {
//        public static int nthLowestSelling(int[] sales, int n) {
//            Map<Integer, Integer> salesCount = new HashMap<>();
//
//            for (int sale : sales) {
//                salesCount.put(sale, salesCount.getOrDefault(sale, 0) + 1);
//            }
//            List<Map.Entry<Integer, Integer>> sortedSales = new ArrayList<>(salesCount.entrySet());
//
//            sortedSales.sort(Comparator.comparingInt(Map.Entry::getValue));
//
//            return sortedSales.get(n - 1).getKey();
//        }
//
//        public static void main(String[] args) {
//
//            int x = nthLowestSelling(new int[] { 11, 99, 44, 77, 99, 11, 33, 44, 77, 11, 99, 44, 11, 99, 11 }, 2);
//            System.out.println(x);
//        }
//    }
//
//}
