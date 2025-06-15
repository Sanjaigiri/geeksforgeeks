class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<a.length;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            if(!mp.containsKey(b[i]) || mp.get(b[i])==0){
                return false;
            }
            mp.put(b[i],mp.get(b[i])-1);
        }
        return true;
    }
}