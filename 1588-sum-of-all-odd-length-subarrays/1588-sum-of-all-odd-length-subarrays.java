class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int arrLen = arr.length;
        int[] sumArr = new int[arrLen];
        int sum=0;

        sumArr[0] = arr[0];
        for (int i = 1; i < arrLen; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        for(int i=2; i<arrLen; i += 2) {
            sum += sumArr[i];
            for(int j=i+1; j<arrLen; j++) {
                sum += (sumArr[j] - sumArr[j-i-1]);
            }
        }
        sum += sumArr[arrLen-1];
        return sum;
    }
}