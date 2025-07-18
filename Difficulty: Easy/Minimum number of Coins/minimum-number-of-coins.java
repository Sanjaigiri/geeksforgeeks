// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int[] res = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> tot = new ArrayList<>();
         for(int i:res){
            while(i <= N){
                N=N-i;
                tot.add(i);
            }
        }
        return tot;
         
    }
    
}