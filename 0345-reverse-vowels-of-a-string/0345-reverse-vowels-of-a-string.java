class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] reversed = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (left < right) {
            while(left < right && vowels.indexOf(reversed[left]) == -1){
                left++;
            }
            while(left < right && vowels.indexOf(reversed[right]) == -1){
                right--;
            }

            char temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
            left++;
            right--;
        }
        return new String(reversed);
    }
}