// User function Template for Java
class Solution {
    static void printPattern(int n) {
        // code here
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}