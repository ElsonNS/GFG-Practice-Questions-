class Solution {
    void rearrange(int arr[], int n) {
        // code here
       ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        for(int a : arr){
            if (a<0) negList.add(a);
            else posList.add(a);
        }
        int loop = Math.min(posList.size(),negList.size());
        int i=0;
        for(;i<loop;i++){
            arr[2*i] = posList.get(i);
            arr[2*i + 1] = negList.get(i);
        }
        if(posList.size()>negList.size()){
            for(int j=2*loop;j<n;j++){
                arr[j] = posList.get(i);
                i++;
            }
        } else if (negList.size()>posList.size()){
            for(int j=2*loop;j<n;j++){
                arr[j] = negList.get(i);
                i++;
            }
        }
        
    }
}