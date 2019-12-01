package arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int currentArea = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int w = j - i;
            int h = height[i] < height[j] ? height[i] : height[j];

            currentArea = w * h;

            if (currentArea > maxArea)
                maxArea = currentArea;

            if (height[i] < height[j]) {
                do {
                    i++;
                } while (i < j && height[i-1] >= height[i]);
            } else {
                do {
                    j--;
                } while (j > i && height[j+1] >= height[j]);
            }
        }

        return maxArea;
    }
}
