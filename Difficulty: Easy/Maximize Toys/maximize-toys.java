// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        // code here
    int count =0;
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
         if(K>=arr[i]){
             K-= arr[i];
             count++;
         }
        
    }
    return count;
   
    
    }
}