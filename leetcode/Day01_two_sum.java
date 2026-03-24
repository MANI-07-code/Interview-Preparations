/* two sum leetcode  1 
here we learn "NESTED for loop"
   -> here we iterate the array two times using two for loop in nested manner.

   -> time complexity O(n^2)  - because of nested for loop.
   -> space complexity O(1) - constant memory -return new int[] {i,j};
*/

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length; i++){
//             for(int j= i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target)
//                     return new int[] {i,j};
//             }
//         }
        
//         return new int[] {};
//     }
// }

/*using hashmap 
  optimized code*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {-1, -1};
    }
}
