class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        int l = nums.length-1;
        while(l!=-1){
            numbers.add(nums[l]);
            l--;
        }
        return (numbers.size() != nums.length)?true:false;
    }
}