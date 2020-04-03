package leetCode;

public class findMedianSortedArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[]nums2) {
		int[] med = new int[nums1.length + nums2.length];
		double median = 0.0;
		
		int i = 0;
		int j = 0;
		for (int k = 0; k <= med.length; k++) {
			if(i < nums1.length && j < nums2.length) {
				if(nums1[i] <= nums2[j]) {
					med[k] = nums1[i];
					i++;
				}else {
					med[k] = nums2[j];
					j++;
				}
			}else if(i < nums1.length) {
				med[k] = nums1[i];
				i++;
				
			}else if(j < nums2.length) {
				med[k] = nums2[j];
				j++;
			}
		}
		
		int x = med.length % 2; 
		int middle = med.length / 2;
		if(x == 0) {
            int first = med[middle];
			int second = med[middle - 1];
			median = (first + second) / 2.0;
		}
		else {
			median = med[middle];
		}

		return median;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{3};
		int[] nums2 = new int[] {-2, -1};
		
		double x = findMedianSortedArrays(nums1, nums2);

		
		System.out.println(x);
	}

}
