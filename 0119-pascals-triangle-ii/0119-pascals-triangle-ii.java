class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        long res = 1;
        list.add(1);
        for(int i=1;i<=rowIndex;i++){
            res = res*(rowIndex-i+1)/i;
            list.add((int)res);
        }
        return list;
    }
}