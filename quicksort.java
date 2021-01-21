import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		QuickSort(arr,0,arr.length-1);
		for(int a: arr)
			System.out.print(a+" ");
    }
	public static void QuickSort(int []arr,int l,int h){
		if(l>=h){
			return;
		}
		int mid=(l+h)/2;
		int pivot=arr[mid];
		int left=l;
		int right=h;
		while(left<=right){
		    while(pivot>arr[left]){
			    left++;
		    }
		    while(pivot<arr[right]){
			    right--;
		    }
		    if(left<=right){
			    int temp=arr[right];
			    arr[right]=arr[left];
			    arr[left]=temp;
			    left++;
			    right--;
		    }
		}
		QuickSort(arr,l,right);
		QuickSort(arr,left,h);
		    
		
		    
	}
}
