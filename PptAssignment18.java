package ineuron;

import java.util.Arrays;

public class PptAssignment18 {

	public static void main(String[] args) {
	int[] nums= {1,2,2,4};
	PptAssignment18 p1=new PptAssignment18();
System.out.println(Arrays.toString(p1.findErrorNums(nums)));
	}
	public static int[] findErrorNums(int[] nums) {
		int x[]=new int[nums.length+1];
		for(int i:nums)x[i]++;
		
		int dup=0,miss=0;
		for(int i=1;i<x.length;i++) {
			if(x[i]==2)dup=i;
			if(x[i]==0)miss=i;
		}
		return new int[] {dup,miss};
	}

}
