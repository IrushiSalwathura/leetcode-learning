package arrays.twosum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        //Create a hashmap to store the key:value pairs as number and the index
        //ex: (2:0,7:1,11:2,15:3)

        //Loop through each index to check if target-key(ex:2) value is available in the hash map
        //since the key: is the array values, we can use ContainsKey.
        //And we need to return the index in this case, and the hash map serves the purpose by storing key:value pairs
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i]; //9-2 = 7

            if(numMap.containsKey(num)){ // checks for 7 in the hashmap
                return new int[]{numMap.get(num),i}; //return [1,0]
            }
            numMap.put(nums[i],i); //syntax: put<k,v> ex: [2:0], basically no change
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
