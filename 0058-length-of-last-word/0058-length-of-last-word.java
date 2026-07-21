class Solution {
    public int lengthOfLastWord(String s) {
        int start;
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        start = end-1;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end-start;
    }
}