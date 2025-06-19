class Solution{
public:
    int countZeros(vector<vector<int>>A)
    {
        int n=A.size(),m=A[0].size(),row=0,column=m-1,count=0;
    while(row<n && column>=0)
    {
        if(A[row][column]==0)
        {
            row++;
            count+=column+1;
        }
        else
        {
            column--;
        }
       
    }
    return count;
    }
};