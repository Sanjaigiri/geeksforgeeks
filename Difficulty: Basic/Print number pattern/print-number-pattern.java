class Solution {
    public ArrayList<Integer> printPat(int n) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int i=n;i>=1;i--){
           for(int j=n;j>=1;j--){
               for(int k = 0;k<i;k++)
               {
                   list.add(j);
               }
               
           }
           list.add(-1);
        }
        return list;
    }
}