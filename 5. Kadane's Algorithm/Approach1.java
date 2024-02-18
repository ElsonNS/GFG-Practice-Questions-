class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        {      
        long res =arr[0], max =res;


        for(int i=1;i<n;i++)
            {
                max = Math.max(max+arr[i],arr[i]);
                res = Math.max(max,res);
            }
            
            return res;
  }
}
}
Time Complexity O(N)
