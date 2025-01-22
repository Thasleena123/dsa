//package dsapartone;
//
//public class Movingtotal {
//    import java.util.*;
//
//    public class MovingTotal {
//        private List<Integer> elements;
//        private Set<Integer> sums;
//
//        public MovingTotal() {
//            this.elements = new ArrayList<>();
//            this.sums = new HashSet<>();
//        }
//        public void append(int[] list) {
//            for (int num : list) {
//                elements.add(num);
//                if (elements.size() >= 3) {
//                    int lastIndex = elements.size() - 1;
//                    int sum = elements.get(lastIndex - 2) + elements.get(lastIndex - 1) + elements.get(lastIndex);
//                    sums.add(sum);
//                }
//            }
//        }
//        public boolean contains(int total) {
//            return sums.contains(total);
//        }
//
//        public static void main(String[] args) {
//            MovingTotal movingTotal = new MovingTotal();
//            movingTotal.append(new int[] { 1, 2, 3, 4 });
//            System.out.println(movingTotal.contains(6));
//            System.out.println(movingTotal.contains(9));
//            System.out.println(movingTotal.contains(12));
//            System.out.println(movingTotal.contains(7));
//
//            movingTotal.append(new int[] { 5 });
//            System.out.println(movingTotal.contains(6));
//            System.out.println(movingTotal.contains(9));
//            System.out.println(movingTotal.contains(12));
//            System.out.println(movingTotal.contains(7));
//        }
//    }
//
//}
