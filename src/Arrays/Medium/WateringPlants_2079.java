package Arrays.Medium;

// 2079. Watering Plants
// https://leetcode.com/problems/watering-plants/
// Runtime 0 ms Beats 100.00%
// Memory 42.96 MB Beats 6.99%
// Dec 29, 2023

public class WateringPlants_2079 {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0, cap = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (cap < plants[i]) {
                cap = capacity;
                steps += 2 * i;
            }

            cap -= plants[i];
            steps++;
        }

        return steps;
    }
}