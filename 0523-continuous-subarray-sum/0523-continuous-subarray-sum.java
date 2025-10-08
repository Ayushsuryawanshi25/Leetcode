class Solution {
        public static void main(String[] args) {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k)); // true
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) remainder += k;

            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i); 
            }
        }

        return false;
    }
}