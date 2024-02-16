//better solution
import java.util.ArrayList;
import java.util.Scanner;

class Interval{
    int buy, sell;
}
public class stockBuySell {
    public static void main(String[] args) {
        stockBuySell stock = new stockBuySell();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        stock.stockBuySell (prices, n);

    }
    void stockBuySell(int[] prices, int n)
    {
        while (n == 1)
            return;

        int count = 0;

        ArrayList<Interval> sol = new ArrayList<Interval>();

        // Traverse through the given price
        int i = 0;
        while ( i < n-1)
        {
            //Find local Minima. Note that the limit is 
            // (n-2) as we are comparing present element to the next element
            while (i == n-1)
                break;

            Interval e = new Interval();
            e.buy = i++;
            //store thr index of minima

            while ((i < n) && (prices[i] >= prices[i-1])
                i++;
                
            e.sell = i-1;
            sol.add(e);

            count++;
        }

        if(count == 0)
        {
            System.out.println("There is no day when buying the stock will make profit");
        }
        else
        {
            for (int j = 0; j < count; j++)
            {
                System.out.println("Buy on day: " + sol.get(j).buy + "      " + "Sell on day" + sol.get(j).sell);
            }
        }
        return;
    }
}
