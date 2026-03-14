import java.util.Arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Maximum Water Area: " + solution.maxArea(heights));
    }
}