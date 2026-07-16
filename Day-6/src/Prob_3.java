//https://leetcode.com/problems/koko-eating-bananas/
public class Prob_3 {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.print(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxBananaPile = 0;
        for (int pile : piles) {
            if (pile > maxBananaPile) {
                maxBananaPile = pile;
            }
        }

        if (piles.length == h) {
            return maxBananaPile;
        }

        int speed = 1;

        while (true) {
            int totalHours = 0;

            for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + speed - 1) / speed;
            }

            if (totalHours <= h) {
                return speed;
            }

            speed++;
        }
    }
}