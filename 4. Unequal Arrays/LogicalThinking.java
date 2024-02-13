class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
       Arrays.sort(A);
       Arrays.sort(B);
       ArrayList<Integer> Aodd = new ArrayList<>();
       ArrayList<Integer> Aeven = new ArrayList<>();
       ArrayList<Integer> Beven = new ArrayList<>();
       ArrayList<Integer> Bodd = new ArrayList<>();
       int sum1= 0;
       int sum2 = 0;
       
       for (int i =0; i < A.length; i++)
       {
           sum1 += A[i];
           sum2 += B[i];
           
           if(A[i] % 2 == 0)
           {
               Aeven.add(A[i]);
           }
           else
           {
               Aodd.add(A[i]);
           }
           
           if(B[i] % 2 == 0)
           {
               Beven.add(B[i]);
           }
           else
           {
               Bodd.add(B[i]);
           }
       }
       long ans = 0;
       
       if(sum1 != sum2 || Aeven.size() != Beven.size())
       {
           return -1;
       }
       for (int i = 0; i < Aodd.size(); i++)
       {
           ans += Math.abs(Aodd.get(i) - Bodd.get(i));
       }
       for (int i = 0; i < Aeven.size(); i++)
       {
           ans += Math.abs(Aeven.get(i) - Beven.get(i));
       }
       return ans/4;
    }
}

//link of question : https://www.geeksforgeeks.org/problems/unequal-arrays--170647/1?page=1&category=Arrays&sortBy=latest
        