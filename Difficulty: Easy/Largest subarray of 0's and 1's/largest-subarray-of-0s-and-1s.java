class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> res = new HashMap<>();
        int sum = 0;
        int max = 0;
        
        res.put(0, -1);
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0) { 
                sum += -1;
            } else {
                sum =sum+ 1;
            } 
             if(res.containsKey(sum)) {
                max = Math.max(max, i - res.get(sum));
            } else {
                res.put(sum, i);
            }
        }
            return max;
    }
}