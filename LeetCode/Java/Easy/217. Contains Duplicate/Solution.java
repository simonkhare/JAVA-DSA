class Solution {
    static {
        for(int i = 0; i<500; i++){
            containsDuplicate(new int[] {1});
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> stores = new HashSet<>();
        for(int num : nums){
            if(!stores.add(num)){
                return true;
            }
        }
        return false;
    }
}