
class task1 {
	
	static void maxIndexDiff(int arr[])
	{
		
		int size = arr.length;
		int count = 1;
        for (int i = 1; i < size; ++i )
        {
          
			if(arr[i]>arr[i-1]){
                count++;

		}
		

}
			System.out.println(count);

        }

	public static void main(String[] args)
	{
		
		int arr[] = { 5,4,7,2,6 };
		int n = arr.length;
		maxIndexDiff(arr);
		
	}
}
