class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>(); 
        int maxLength = 0;
        int start = 0;  

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (map.containsKey(current) && map.get(current) >= start) {
                start = map.get(current) + 1;
            }
            map.put(current, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}