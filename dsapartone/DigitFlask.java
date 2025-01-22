package dsapartone;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public  class DigitFlask{
    public static int getCount(List<Integer> flaskSizes, int waterAvailable, int tankVolume) {

        if (tankVolume > waterAvailable) {
            return -1;
        }

        flaskSizes.sort(Comparator.naturalOrder());
        int c = 0;
        while(tankVolume - flaskSizes.get(flaskSizes.size() - 1) > 0) {
            c++;
        }

        return c++;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 3, 7, 1, 5, 4);
        System.out.println(getCount(input, 100, 34));
    }
}
