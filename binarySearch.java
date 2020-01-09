package binarySearchSortedArray;
//Big O = O(log2n)


public class binarySearch {
		static int[] data = {1,2,3,4,5,6,7,8,9};
		static int src = 1;
		static int srcIndex = -1;
	public static void main(String[] args) {
		
		int res = search(data, src);
		
		int res = search(data, src);
		if(res == -1) {
			System.out.println(src+ " is not found");
		}else {
			System.out.println(src+ " is found at index " + res);
		}
		
	}
	
	public static int search(int[] array,int searchVal) {
		
		int low = 0;
		int high = array.length-1;
	     
		while(high != low) {
			if(searchVal < array[low] || array[high] < searchVal) {
				break;
			}
			else {
				int mid = (high - low)/2;
				if(array[mid] > searchVal) {
					high = mid;
				}else if(array[mid] < searchVal) {
					low = mid;
				}else {
					high = low;
					srcIndex = mid;
				}	
			}
		}
	    
	    return srcIndex;
	}

}
