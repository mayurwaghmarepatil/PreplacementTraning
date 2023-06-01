package ineuron;

import java.util.Arrays;

public class PptAssignment11 {
	public static void main(String[] args) {
		int[] nums1= {2,7,11,15};
		int target=9;
		PptAssignment11 sum=new PptAssignment11();
		System.out.println(Arrays.toString(sum.twoSum(nums1,target)));
		
	}
	
	public  int[] twoSum(int[] nums1,int target) {
		
		int n=nums1.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(nums1[i] + nums1[j] == target) {
					return new int[] {i,j};
				}
			}
		}
	return null;
	
	}

}
