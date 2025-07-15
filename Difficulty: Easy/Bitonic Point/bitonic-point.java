// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max <arr[i]){
                max=arr[i];
            }
        }
     return max;
    }
}