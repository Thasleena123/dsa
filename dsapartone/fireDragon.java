package dsapartone;

import java.util.concurrent.Callable;

//public class fireDragon {
    interface Reptile {
        ReptileEgg lay();
    }

    class FireDragon implements Reptile {
        public FireDragon() {

        }
        @Override
        public ReptileEgg lay() {
            return new ReptileEgg(() -> new FireDragon());
        }
        public static void main(String[] args) throws Exception {
            FireDragon fireDragon = new FireDragon();
            System.out.println(fireDragon instanceof Reptile);
            ReptileEgg egg = fireDragon.lay();
            Reptile hatchedDragon = egg.hatch();
            if (hatchedDragon instanceof FireDragon) {
                System.out.println("A new FireDragon has hatched!");
            }
            try {
                egg.hatch();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    class ReptileEgg {
        private final Callable<Reptile> createReptile;
        private boolean hasHatched = false;

        public ReptileEgg(Callable<Reptile> createReptile) {
            this.createReptile = createReptile;
        }

        public Reptile hatch() throws Exception {
            if (hasHatched) {
                throw new IllegalStateException("This egg has already hatched!");
            }
            hasHatched = true;
            return createReptile.call();
        }
    }




