class Solution {
  public:
    // Function to sort the array using bubble sort algorithm.
    void bubbleSort(vector<int>& arr) {
        // Your code here
        int n=arr.size();
        for (int i=0;i<n-1;i++){
            bool flag=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                    flag=false;
                }
            }
            if(flag==true)
            break;
        }
        
    }
};