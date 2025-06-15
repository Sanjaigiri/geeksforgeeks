class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        int ans1 = 0;
        int ans2 =0;
        for(int i =0; i < a.length || i < b.length;i++){
            ans1 += a[i];
            ans2 += b[i];
        }
        return (ans1==ans2);
    }
}