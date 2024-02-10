class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        
        for (int i = 0; i < N; i++)
        {
            sum += A[i];
            if(sum == K)
            {
                maxLen = Math.max(maxLen, i+1);
            }
            
            int rem = sum - K;
            if(preSumMap.containsKey(rem))
            {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            
            if(!preSumMap.containsKey(sum))
            {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }