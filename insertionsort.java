package classwork;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,4,7,2,3};
		insertion(arr);
		System.out.print("sorted array");
		printarray(arr);

	}
	static void insertion(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
		
		while(j>=0 && arr[j]>key ) {
			arr[j+1]=arr[j];
			j=j-1;
			
		}
		arr[j+1]=key;
		System.out.println( );
		printarray(arr);
	}

	}
		static void printarray(int arr[]) {
			int n =arr.length;
			for(int i=0;i<n ;i++) {
				System.out.print(arr[i] + " ");
			}
				
			}
		

}
