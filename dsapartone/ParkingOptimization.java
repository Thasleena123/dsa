//package dsapartone;
//
//public class ParkingOptimization {
//
//
//    public static int getMinimumSlots(int largeSlots, int smallSlots, int buses, int cars) {
//        // Check if there are enough large slots for the buses
//        if (buses > largeSlots) {
//            return -1;  // Not enough large slots for buses
//        }
//
//        // Allocate large slots for buses
//        largeSlots -= buses;
//
//        // Place cars in the remaining large slots (3 cars per large slot)
//        int carsInLargeSlots = Math.min(cars / 3, largeSlots);
//        cars -= carsInLargeSlots * 3;  // Deduct the cars that fit in large slots
//
//        // Place remaining cars in small slots
//        int carsInSmallSlots = Math.min(cars, smallSlots);
//        cars -= carsInSmallSlots;  // Deduct the cars that fit in small slots
//
//        // If there are cars left that can't fit, return -1
//        if (cars > 0) {
//            return -1;
//        }
//
//        // Total slots used: buses (1 slot each), cars in large slots (1 slot per 3 cars), and cars in small slots (1 slot per car)
//        return buses + carsInLargeSlots + carsInSmallSlots;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getMinimumSlots(2, 12, 1, 4));  // Should print 3
//
//    }
//} public static int getMinimumSlots(int largeSlots, int smallSlots, int buses, int cars) {
//    if (buses > largeSlots) {
//        return -1;
//    }
//    largeSlots -= buses;
//    int carsInLargeSlots = Math.min(cars / 3, largeSlots);
//    cars -= carsInLargeSlots * 3;
//    int carsInSmallSlots = Math.min(cars, smallSlots);
//    cars -= carsInSmallSlots;
//    int totalSlotsUsed = buses + carsInLargeSlots + carsInSmallSlots;
//    if (cars > 0) {
//        return -1;
//    }
//    return totalSlotsUsed;