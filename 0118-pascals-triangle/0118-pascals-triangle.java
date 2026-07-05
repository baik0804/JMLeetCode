
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>(){{add(1);}});
        for(int i=1;i<numRows;i++){
            List<Integer> coeff = new ArrayList<Integer>();
            coeff.add(1);
            for(int j=0;j<i-1;j++){
                coeff.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
            }
            coeff.add(1);
            res.add(coeff);
        }
        return res;
    }
}