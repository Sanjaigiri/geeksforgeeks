// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0,l;
        while(n>0){
             l=n%10;
            n=n/10;
            sum=sum+(l*l*l);
        }
       
        
     if(sum == temp) return true;
    else return false;   
    }
    
}