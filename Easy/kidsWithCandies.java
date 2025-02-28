import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static List<Boolean> kidswithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int target = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= target) {
                target = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= target) {
                list.add(true);
            } else
                list.add(false);
        }
        return list;
    }
}