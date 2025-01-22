//package dsapartone;
//
//import java.util.concurrent.Callable;
//
//public class ReptileClass {
//
//    interface Reptile {
//        ReptileEgg lay();
//    }
//
//    class FireDragon implements Reptile {
//        public FireDragon() {
//
//        }
//
//        @Override
//        public ReptileEgg lay() {
//            return new ReptileEgg(() -> new FireDragon());
//        }
//
//        public static void main(String[] args) throws Exception {
//            FireDragon fireDragon = new FireDragon();
//
//
//            System.out.println(fireDragon instanceof Reptile);
//
//
//            ReptileEgg egg = fireDragon.lay();
//
//            Reptile hatchedDragon = egg.hatch();
//
//            if (hatchedDragon instanceof FireDragon) {
//                System.out.println("A new FireDragon has hatched!");
//            }
//        }
//    }
//
//    class ReptileEgg {
//        private final Callable<Reptile> createReptile;
//
//        public ReptileEgg(Callable<Reptile> createReptile) {
//            this.createReptile = createReptile;
//        }
//
//        public Reptile hatch() throws Exception {
//            return createReptile.call();
//        }
//    }
//
//}
