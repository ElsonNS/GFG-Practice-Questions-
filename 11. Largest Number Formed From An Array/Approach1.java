class Approach1{
    static String printLargest(int n, String[] arr)
    {
        StringBuilder temp = new StringBuilder();
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String x, String y)
            {
                String a = (x+y);
                String b = (y+x);
                return b.compareTo(a);
            }
        });
        for (String x: arr)
        {
            temp.append(x);
        }
        return temp.toString();
    }
    public static void main(String[] args) {
        Scnaner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        sc.close();
        String largest = printLargest(n, arr);
        System.out.println("Largest number formed is : "+ largest);
    
    }
}