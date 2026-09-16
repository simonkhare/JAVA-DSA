// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length-1;
//         int temp=0;
//         int max=0;
//         while(left<right){
//             if(height[left]<height[right]){
//                 temp = (right-left) * height[left];
//                 left++;
//             }
//             else if(height[left]>height[right]){
//                  temp = (left-right) * height[right];
//                  right--;
//             }
//             else{
//                 temp = (right-left) * height[left];
//             }
//             if(temp>max){
//                 max = temp;
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int temp = width * h;
            if (temp > max) {
                max = temp;
            }
            if (height[left] < height[right]) {
                left++;
            }
            else if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}