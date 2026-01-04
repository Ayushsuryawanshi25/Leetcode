class Solution {
    public int strStr(String haystack, String needle) {
        char [] a = haystack.toCharArray();
        char [] b = needle.toCharArray();
        for (int i = 0; i <= a.length - b.length; i++) {
            int j;
            for (j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    break;
                }
            }
            if (j == b.length) {
                return i; 
            }
        }

        return -1;

    } 
}