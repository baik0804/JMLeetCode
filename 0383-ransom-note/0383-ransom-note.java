class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magazineLetters = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            if(magazineLetters.containsKey(c)){
                magazineLetters.put(c,magazineLetters.get(c)+1);
            }
            else{
                magazineLetters.put(c,1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(magazineLetters.containsKey(c) && magazineLetters.get(c)!=0){
                magazineLetters.put(c,magazineLetters.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}