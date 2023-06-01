package ineuron;

public class PptAssignment13 {
	
	public static void main(String[] args) {
		int[] A= {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(A,target));
	}
	public static int searchInsert(int[] A,int target) {
		int low=0,high=A.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(A[mid]==target) return mid;
			else if(A[mid]>target) high=mid-1;
			else {
				low=mid+1;
			}
		}
		return low;
	}

}
