package remove;

import java.util.Arrays;

public class Remove1 {

	public static void main(String[] args) {
		/*给定 nums = [3,2,2,3], val = 3,
		函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
		你不需要考虑数组中超出新长度后面的元素。*/
		int[] arr = {3,2,2,3};
		System.out.println(newLen(arr,3));
		System.out.println(Arrays.toString(arr));

	}
	
	public static int newLen(int[] arr,int val){
		int i = 0;
		
		for (int j=0;j<arr.length;j++){
			if (arr[j]!=val){
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}

}
