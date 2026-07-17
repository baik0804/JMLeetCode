class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count;
        int maxCount = 0;
        int len = blocks.length()-k+1;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B'){
                maxCount++;
            }
        }
        count = maxCount;

        for(int i=1;i<len;i++){
            if(blocks.charAt(i-1)=='B'){
                count--;
            }
            if(blocks.charAt(i+k-1)=='B'){
                count++;
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        if(maxCount>=k)
            return 0;
        else{
            return k-maxCount;
        }
    }
}