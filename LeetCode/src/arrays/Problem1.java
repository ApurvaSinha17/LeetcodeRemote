package arrays;

import java.util.LinkedHashMap;

public class Problem1 {

	public static void main(String[] args) {
		
		int[] nums = {5,2,9,7,8};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println("Num1: "+result[0]+" Num2: "+result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
        
        LinkedHashMap map = new LinkedHashMap();
        
        for(int num : nums){
            if(map.containsKey(num)){
                int count = (int) map.get(num);
                map.put(num,count+1);
            }
            else{
                map.put(num,1);
            }
        }
        
        int[] numbers = new int[2];
        for(int i=0;i<nums.length;i++){
            int num1 = nums[i];
            int count = (int) map.get(num1);
            int reqNum = target - num1;
            if(map.containsKey(reqNum) && ( reqNum != num1 || (count > 1))){
                numbers[0] = i;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] == reqNum){
                        numbers[1] = j;
                    }
                }
                return numbers;
            }
        }
        return  numbers;
    }
}
