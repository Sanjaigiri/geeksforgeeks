class Solution {
    int convertfive(Integer num) {
        // Your code here
        String a=num.toString();
         a=a.replace('0','5');
        return Integer.parseInt(a);
    }
}