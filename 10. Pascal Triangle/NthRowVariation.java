import java.util.ArrayList;

class Solution {
   ArrayList<Long> nthRowOfPascalTriangle(int n){
    ArrayList<Long> NthRow = new ArrayList<>();
    NthRow.add(1L);

    for (int i = 1; i < n; i++)
    {
        ArrayList<Long> tmep = new ArrayList<>();
        temp.add(1L);
        for (int j = 0; j < NthRow.size(); j++)
        {
            temp.add((NthRow.get(j) + NthRow.get(j+1)) % 1000000007);

        }
        temp.add(1L);
        NthRow = temp;
    }
    return NthRow;  
   } 
}

//Given conditons 
/*
 * 1. The elements can be large so return it modulo 10^9 +7
 * 2. That's why we are taking the modulus.
 */