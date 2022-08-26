package interview_preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Arrays_Practice {
	
	/*
	//1)reverse an array elements
	public static void main(String[] args) {
		//1)reverse an array elements
		int arr[]= {10,20,30,40,50};
		System.out.println("Original array: "+Arrays.toString(arr));
		int size=arr.length;
		int temp=0;
		for(int i=0;i<=size/2;i++) {
			temp=arr[i];
			arr[i]=arr[size-(i+1)];
			arr[size-(i+1)]=temp;
		}
		System.out.println("Reverse array: "+Arrays.toString(arr));
		
		
		//or
		int []arr1= {20,40,60,80,100};
		for(int j=arr1.length-1;j>=0;j--) {
			System.out.println(arr1[j]);
		}		
	}
	*/
	/*
	//2)Find largest odd number in an array
	
	public static void main(String[]args) {
	//create an array list
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(3,2,4,6,7,0,8,5));
		//create an iterator to iterater through the array list
		Iterator<Integer> it=al.iterator();
		int max=0;
		while(it.hasNext()) {
			int num=it.next();
			//check number is odd and greater
			if(num%2!=0 && num>max) {
					max=num;
			}
		}
		System.out.println(max);
	}
	
	
	
	/*
	//3) Palindrome number
	public static void main(String[]args) {
	int number=256;
	int original_num=number;
	int rem=0;
	int ans=0;
	while(number!=0) {
		rem=number%10;
		ans=ans*10+rem;
		number=number/10;
	}
	System.out.println(ans);
	if(original_num==ans) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number is not palindrome");
	}
}
*/
	
	
	/*
	//6)write a java program find largest and smallest number in unsorted array?
	public static void main(String[]args) {
		int[]arr={20, 30, 25, 35, -16, 60, -100};
		//maximum number
//		int max=arr[0];
//		for(int i=0;i<=arr.length-1;i++) {
//			if (arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//	}
		
		//minimum number
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	*/
	
	
	/*
	//7)write a java program to find repeated/duplicate numbers in array?
	public static void main(String[]args) {
		int arr[]= {10,4,2,6,2,7,5,3,6};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	*/
	
	
	/*
	//8)write a java program to remove duplicate numbers in given array?(logic)
	public static void main(String []args) {
		int arr[]= {10,4,2,6,2,7,5,3,6};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<=arr.length-1;i++) {
			boolean repeated=false;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					repeated=true;
					break;
				}
			}
			//check the array and to print the array by removing the duplicate elements
			if(repeated==false) {
				al.add(arr[i]);
			
			}
		}
		System.out.println(al);
	}
	*/

	
	/*
	 * or
	//8)write a java program to remove duplicate numbers in given array?
	public static void main(String[]args) {
		//int arr[]= {10,4,2,6,2,7,5,3,6};
		 //create an arraylist
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(10,4,2,6,2,7,5,3,6));
		//convert the arraylist to hashset
		HashSet<Integer>hs=new HashSet<Integer>(al);
		// convert hashset back to arraylist
		ArrayList<Integer>al1=new ArrayList<Integer>(hs);
		System.out.println(al1);
		
		
	}
	
	*/
	
	/*
	//9)write a java program to find the missing numbers integer array of 1 to 100?
	public static void main(String[]args) {
		int arr[]= {1,2,3,5,6};
		int ans=0;
		int size=arr.length+1;
		int total =size*(size+1)/2;
		for(int i=0;i<=arr.length-1;i++) {
			ans=ans+arr[i];
		}
		System.out.println(ans);
		int missing_number=total-ans;
		System.out.println(missing_number);
		
		
		}
	
	*/
	
	/*
	//10)write a java program to find second largest element in an array of integers?
	public static void main(String[]args) {
		int arr[]= {10,4,2,6,2,7,5,3,6};
		Arrays.sort(arr);
		int size=arr.length;
		System.out.println(size);
		//to print the array
		System.out.println(Arrays.toString(arr));
		//to print the second largest number
		 //size=9  index=8(9-1)--->largest number  index=7(9-2)==(size-2)--->second largest number
		System.out.println(arr[size-2]);
		
	}
	*/
	/*
	//11)sort an array
	public static void main(String[]args) {
		int arr[]= {10,32,45,2,26,55,78,66};
		System.out.println("Original array: "+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted array: "+Arrays.toString(arr));
	}
	*/
	
	//12)Sum of 2 Arrays
	public static void main(String[]args) {
		int []arr1= {10,20,30,40,50};
		int []arr2= {11,22,33,44,55};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=arr1.length-1;i++) {
			sum1=sum1+arr1[i];
		}
		System.out.println(sum1);
		
		for(int i=0;i<=arr2.length-1;i++) {
			sum2=sum2+arr2[i];
		}
		System.out.println(sum2);
		
		int total=sum1+sum2;
		System.out.println(total);
			
		
		
	}
}