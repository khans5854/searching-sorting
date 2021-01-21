import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		arr=MergeSort(arr,0,arr.length-1);
		for(int a:arr)
			System.out.print(a+" ");
    }
	public static int[] MergeSort(int []arr,int l,int h){
		if(l==h){
			int []base=new int[]{arr[l]};
			return base;
		}
		int mid=(l+h)/2;
		int []firstArr=MergeSort(arr,l,mid);
		int []lastArr=MergeSort(arr,mid+1,h);
		int merge[]=mergetoarray(firstArr,lastArr);
		return merge;
	}
	public static int[] mergetoarray(int []first,int []last){
		int i=0,j=0,k=0;
		int merge[]=new int [first.length+last.length];
		while(i<first.length&&j<last.length){
			if(first[i]<=last[j]){
				merge[k]=first[i];
				i++;
				k++;
			}
			else{
				merge[k]=last[j];
				j++;
				k++;
			}
		}
		if(i==first.length){
			while(j<last.length){
				merge[k]=last[j];
				j++;
				k++;
			}
		}
		if(j==last.length){
			while(i<first.length){
				merge[k]=first[i];
				i++;
				k++;
			}
		}
		return merge;
	}
}
