class Solution {
    public int mySqrt(int x) {
        int sq= 1;
        while((long)sq*sq<=x){
            sq++;
        }
        return sq-1;
    }
}