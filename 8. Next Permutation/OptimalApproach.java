class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
         List<Integer> a = new ArrayList<>();
        
        for(int i = 0 ; i<N; i++){
            a.add(arr[i]);
        }
        
        int index = -1;
        for(int i = N-2;i>=0;i--){
            if(a.get(i)<a.get(i+1)){
                index = i;
                break;
            }
        }
        
        if(index ==-1){
            Collections.reverse(a);
            return a;
        }
        
        for(int i = N-1;i>=index ; i--){
            if(a.get(i)>a.get(index)){
                int temp = a.get(i);
                a.set(i,a.get(index));
                a.set(index , temp);
                break;
            }
        }
        List<Integer> sublist = a.subList(index+1 , N);
        Collections.reverse(sublist);
        return a;
    }
}
//Time Complexity - O(3N)
