import java.util.Scanner;
public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("MAximum Profit "+ maxProfit(prices, 0, n-1));;

    }
    static int maxProfit(int[] prices, int start, int end)
    {
        if (start > end)
        {
            return 0;
        }

        int profit = 0;
        for (int i = start; i < end; i++)
        {
            for (int j = i+1; j <=end; j++)
            {
                if(prices[j] > prices[i])
                {
                    int curr_Profit = prices[j]- prices[i] + maxProfit(prices, start, i-1) + maxProfit(prices, j+1, end);
                    profit = Math.max(profit, curr_Profit);
                }
            }
        }
        return profit;
    }
}
