class Bruteforce{
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberofInversions(a, n);
        System.out.println("The number of inversions is: "+ cnt);
    }
    
    public static int numberofInversions(int[] a, int n){
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j< n; j++)
            {
                if (a[i] > a[j])
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}