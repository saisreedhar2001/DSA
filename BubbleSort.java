public class BubbleSort{

	public static void main(String[] args){

		int[] intArray = {12,-5,45,32,-40,65,3};
		System.out.println("unsorted Array");
				 for (int i = 0;i<intArray.length ; i++ ) {
		 	System.out.println(intArray[i]);
		 }
		 for(int lastunsortedindex = intArray.length-1; lastunsortedindex>0;lastunsortedindex--){
		 	for(int i =0; i<lastunsortedindex;i++){
		 		if(intArray[i]>intArray[i+1]){
		 			swap(intArray,i,i+1);
		 		}
		 	}
		 }
		 System.out.println("sorted Array");
		 for (int i = 0;i<intArray.length ; i++ ) {
		 	System.out.println(intArray[i]);
		 }

	}
	public static void swap(int[] array,int a, int b){
		if(a == b){
			return;
		}
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}