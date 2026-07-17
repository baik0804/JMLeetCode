class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        int word1Index = 0;
        int word2Index = 0;
        int mergedIndex = 0;
        char[] merged = new char[word1Length + word2Length];

        while(word1Index < word1Length && word2Index < word2Length){
            merged[mergedIndex] = word1.charAt(word1Index);
            mergedIndex++;
            word1Index++;

            merged[mergedIndex] = word2.charAt(word2Index);
            mergedIndex++;
            word2Index++;
        }
        while(word1Index < word1Length){
            merged[mergedIndex] = word1.charAt(word1Index);
            mergedIndex++;
            word1Index++;
        }

        while(word2Index < word2Length){
            merged[mergedIndex] = word2.charAt(word2Index);
            mergedIndex++;
            word2Index++;
        }
        return new String(merged);
    }
}