package classwork;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {4,5,3,7,8,9};
      bubble(arr);
      System.out.println("after sorted");
      printarray(arr);
      
	}
 static void bubble(int arr[]) {
	 int n = arr.length;
	 for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
			 
		 }
			System.out.println();
            printarray(arr);
	 }
 }
	 static void printarray(int arr[]) {
		 int n=arr.length ;
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i] +" ");
		 }
		 
	 }
 }
	
	

