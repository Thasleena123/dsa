package dsapartone;

public class Constructiongame2 {
        private int length;
        private int width;
        private int[][] table;

        public Constructiongame2(int length, int width) {
            this.length = length;
            this.width = width;
            this.table = new int[length][width];
        }

        public void addCubes(boolean[][] cubes) {
            // Add cubes to the table based on input
            for (int row = 0; row < cubes.length; row++) {
                for (int col = 0; col < cubes[row].length; col++) {
                    if (cubes[row][col]) {
                        int rowToDrop = -1;
                        for (int i = 0; i < length; i++) {
                            if (table[i][col] == 0) {
                                rowToDrop = i;
                                break;
                            }
                        }
                        if (rowToDrop != -1) {
                            table[rowToDrop][col] = 1;
                        }
                    }
                }
            }

            // Clear full rows and shift rows down without using clone
            for (int i = 0; i < length; i++) {
                boolean isFull = true;
                for (int j = 0; j < width; j++) {
                    if (table[i][j] == 0) {
                        isFull = false;
                        break;
                    }
                }
                if (isFull) {
                    // Clear the full row
                    for (int j = 0; j < width; j++) {
                        table[i][j] = 0;
                    }
                    // Shift rows down
                    for (int k = i; k > 0; k--) {
                        // Move row down manually
                        table[k] = table[k - 1];
                    }
                    // Reset the top row
                    table[0] = new int[width];
                }
            }
        }

        public int getHeight() {
            int maxHeight = 0;
            for (int col = 0; col < width; col++) {
                int colHeight = 0;
                for (int row = 0; row < length; row++) {
                    if (table[row][col] == 1) {
                        colHeight++;
                    }
                }
                maxHeight = Math.max(maxHeight, colHeight);
            }
            return maxHeight;
        }

        public static void main(String[] args) {
            ConstructionGame game = new ConstructionGame(2, 2);
            game.addCubes(new boolean[][] {
                    { true, true },
                    { false, false }
            });
            game.addCubes(new boolean[][] {
                    { true, true },
                    { false, true }
            });
            System.out.println(game.getHeight()); // Expected output: 2
            game.addCubes(new boolean[][] {
                    { false, false },
                    { true, true }
            });
            System.out.println(game.getHeight()); // Expected output: 1
        }
    }

