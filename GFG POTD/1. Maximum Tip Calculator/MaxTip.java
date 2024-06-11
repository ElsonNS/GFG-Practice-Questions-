import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class MaxTip{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Enter number of orders 
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        //limit of A's order
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        //limit of B's order
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();
        //Tip collection of A
        System.out.println("Enter values of arr");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //Tip collection of B
        System.out.println("Enter values of brr");
        for (int i = 0; i < n; i++){
            brr[i] = sc.nextInt();
        }

        
        long maxTip = findMaxTip(n, x, y, arr, brr );
        System.out.println("Max Tip is :" + maxTip);
        
    }

    public static long findMaxTip(int n, int x, int y, int[] arr, int[] brr){
        //Calculating max profit 
        int[][] profit = new int[n][2];
        for (int i = 0; i < n; i++){
            profit[i][0] = Math.abs(arr[i] - brr[i]);
            profit[i][1] = i; //index 
        }

        // Sorting the temp 
        Arrays.sort(profit, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] > b[0]) return 1;
                else if(a[0] < b[0]) return -1;
                else return 0;
            }
        });
        long maxTip = 0;

        //taking best profit while making sure limit is not exhausted
        for (int i = n-1; i >= 0; i--){
            if(arr[i] > brr[i]){
                if(x != 0){
                    maxTip += arr[i];
                    x--;
                }
                else{
                    maxTip += brr[i];
                    y--;
                }
            }
            else{
                if(y != 0){
                    maxTip += brr[i];
                    y--;
                }
                else{
                    maxTip += arr[i];
                    x--;
                }
            }
            
        }
        return maxTip;
    }
}

//Time Complexity -> O(nlogn)
//Space Complexitu -> O(n)