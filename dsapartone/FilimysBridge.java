//package dsapartone;
//
//public class FlimsyBridge {
//    public static int usageCount(int[] bridge) {
//        int jumps = 0;
//        while (true) {
//            for (int i = 0; i < bridge.length; i++) {
//                bridge[i] -= 2;
//                if (bridge[i] <= 0) {
//                    return jumps;
//                }
//            }
//            jumps++;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] bridge = { 7, 6, 5, 8 };
//        System.out.println(usageCount(bridge)); // Should print 2
//    }
//}
