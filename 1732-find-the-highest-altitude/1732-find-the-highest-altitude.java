class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int currAltitude = 0;
        for(int altitude : gain){
            currAltitude += altitude;
            if(currAltitude > highest){
                highest = currAltitude;
            }
        }
        return highest;
    }
}