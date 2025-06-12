class Solution {
  public:
    // Function to sort an array using Heap Sort.
    void heapSort(vector<int>& arr) {
        // code here
        vector<int>v(arr);
        priority_queue<int>pq(v.begin(),v.end());
      
        for(int i=0;i<arr.size();i++){
            arr[i]=pq.top();
            pq.pop();
        }
        
      
        reverse(arr.begin(), arr.end());    }
};