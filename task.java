class task
{
    // Function to print all elements which are greater than all
    // elements present to their right
    public static void find(int[] arr)
    {
        // base case
        if (arr == null || arr.length == 0) {
            return;
        }
 
        int max_so_far = 1;
 
        // traverse the array from right to left
        for (int i = 0 ; i<= arr.length; ++i)
        {
            // if the current element is greater than the maximum so far,
            // print it and update `max_so_far`
            if (arr[i] < arr[i+1])
            {
                max_so_far++;
               
            }
        }
		 System.out.printf("%d ", max_so_far);
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 5,4,7,2,6 };
        find(arr);
    }
}