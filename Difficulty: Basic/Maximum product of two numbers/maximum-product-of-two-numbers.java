class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
      
        return arr[n-1]*arr[n-2];
    }
}