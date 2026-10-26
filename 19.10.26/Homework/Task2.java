public class Task2 {
    public static void main(String[] args) {
        int[] houses = {4, 2, 1, 5, 1};
        int energy = 7;

        System.out.println(maxHouses(houses, energy));
    }

    public static int maxHouses(int[] houses, int energy) {
        int left = 0;
        int maxCount = 0;
        long sum = 0;

        for (int right = 0; right < houses.length; right++) {
            sum += houses[right];

            while (sum > energy) {
                sum -= houses[left];
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}