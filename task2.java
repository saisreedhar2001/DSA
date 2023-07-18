import java.util.*;

class task2{


static void findMaximumBefore(int arr[]){
		
	int highest = 1;
    int j = highest +1
    for(int i=1; i<arr.length;++i){
for (int j = arr.length -1; j>=0; --j) {

		if(arr[j] < arr[i]){
          
            highest++;
            
        }
	}
    }
    System.out.println(highest);
	
  
}


public static void main(String[] args)
{
	int arr[] = { 4,7,8,2,6 };

	int n = arr.length;

	
	findMaximumBefore(arr);
}
}

// This code is contributed by 29AjayKumar
