import java.util.Scanner;

public class ValleyPeakApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("MAximum Profit "+ maxProfit(prices, n));;

    }
    static int maxProfit(int[] prices, int size)
    {
        int maxprofit = 0;
        for (int i = 1; i < size; i++)
        {
            if (prices[i] > prices[i-1])
            {
                maxprofit += prices[i]- prices[i-1];
            }
        }
        return maxprofit;
    }
}
