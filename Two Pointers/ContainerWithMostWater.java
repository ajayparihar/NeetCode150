import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
      int[] heights = {1,8,6,2,5,4,8,3,7};
      System.out.print(maxArea(heights));
  }
  static int maxArea(int[] height) {
            int left = 0;
        int right = height.length - 1;
        int maxVol = 0;

        while(left < right){
            int width = right - left;
            int vol = Math.min(height[left], height[right]) * width;
            maxVol = Math.max(maxVol, vol);

            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxVol;
    }
  }
