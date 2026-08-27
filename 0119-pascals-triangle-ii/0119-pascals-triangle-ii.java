class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> outerLst = new ArrayList<>();

        outerLst.add(List.of(1));

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> innerLst = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    innerLst.add(1);
                    continue;
                }
                Integer num = outerLst.get(i-1).get(j) + outerLst.get(i-1).get(j-1);
                innerLst.add(num);
            }
            outerLst.add(innerLst);
        }

        return outerLst.get(rowIndex);
    }
}