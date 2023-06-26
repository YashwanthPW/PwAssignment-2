import java.util.HashSet;

public class MaxDifferentCandies {
    public static int maxCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int type : candyType) {
            set.add(type);
        }

        return Math.min(set.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxDifferentCandies = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + maxDifferentCandies);
    }
}
