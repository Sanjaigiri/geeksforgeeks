
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int f = -1, l = -1;
        for (int i = 0; i < arr.length; i++)
        if (arr[i] == x) {
            f = i;
            break;
            }
        if (f == -1) {
            res.add(-1);
            return res; 
        }
        for (int i = arr.length - 1; i >= 0; i--) 
        if (arr[i] == x) {
            l = i;
            break;
            }
        res.add(f); 
        res.add(l);
        return res;
    }
}