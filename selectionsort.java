package classwork;
import java.util.*;
public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n[]= {1,4,5,3,6};
        System.out.println("before sorting");
        array(n);
        selectionsort(n);
        System.out.println("after sorting");
        array(n);
	}
        static int Select(int n[], int i) {
        	int mini_index=i;
        	for(int j=i+1;j<n.length;j++) {
        		if(n[j]<n[mini_index]) {
        			mini_index=j;
        			
        		}
        	}return mini_index;
        	
        }
        static void selectionsort(int arr[]) {
        	 int j=arr.length;
        	for(int  i=0; i<j-1; i++) {
            	int minindex=Select(arr,i);
            	int temp=arr[minindex];
            	arr[minindex]=arr[i];
            	arr[i]=temp;

        		array(arr);
        	}
        	
        }
        static void  array(int arr[] ) {
        	for(int i=0;i<arr.length;i++) {
        		System.out.print(arr[i] +" ");
        	}
        	System.out.println();
        }
        
	}


