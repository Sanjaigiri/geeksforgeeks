class Solution {
  public:
    vector<int> valueEqualToIndex(vector<int>& arr) {
            vector<int>s;
        int n=arr.size();
        for(int i=0; i<n; i++){
            if(arr[i]==(i+1)){
                s.push_back(i+1);
            }
        }
            return s;
    }
};