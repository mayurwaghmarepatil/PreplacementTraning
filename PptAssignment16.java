package ineuron;

import java.util.Arrays;

public class PptAssignment16 {
public static void main(String[] args) {
	int[] nums1= {1,2,3,1};
	System.out.println(containDuplicate(nums1));
}
public static boolean containDuplicate(int[] nums1) {
	
	
	
	Arrays.sort(nums1);
	
	for(int i=0;i<nums1.length-1;i++) {
		if(nums1[i]==nums1[i+1]) {
			return true;
		}
	}
	return false;
}
}
