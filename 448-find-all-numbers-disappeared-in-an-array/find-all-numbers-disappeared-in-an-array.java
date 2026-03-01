class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int l = nums.length;
        int i = 0;
        
        while (i < l) {
            int idx = nums[i] - 1;
            if (nums[i] == i + 1 || nums[i] == nums[idx]) {
                i++;
            } else {
                swap(nums, i, idx);
            }
        }
        
        for (i = 0; i < l; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
    
    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}     

