class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-2; i++){

            for (int j = i+1; j < n-1; j++){
                for (int k=j+1; k<n; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        boolean present = false;
                        Set<Integer> temp = new HashSet<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        for (List<Integer> list : output){
                            if (temp.equals(new HashSet(list))){
                                present = true;
                            }
                        }
                        if (!present){
                            // output.add(Stream.of(nums[i] , nums[j] , nums[k]).sorted().toList());
                            output.add(List.of(nums[i] , nums[j] , nums[k]));

                        }

                    }
                }

            }
        }
        return output;


        
    }

     
}
