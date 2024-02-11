class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid <= high)
        {
            if (a[mid] == 0)
            {
                //swap low and mid 
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else if(a[mid] == 2)
            {
                //swap mid and high
                int temp1 = a[high];
                a[high] = a[mid];
                a[mid] = temp1;
                high--;
            }
        }
    }
}