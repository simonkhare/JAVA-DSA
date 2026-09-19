class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num : nums){
            if(!store.add(num)){
                return true;
            }
        }
        return false;
    }
}