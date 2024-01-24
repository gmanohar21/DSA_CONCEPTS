package Week2;

public class Twosum{
/*
1)Bruteforce TC-O(n^2) SC-O(n)
*/

    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

/*
2)HashMap approach TC-O(n) SC-O(n)  (note sc can be reduced by O(1) if we found element before)
*/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int ans[]=new int[2];
        int idx=0;
        for(int i:nums){
            int val=target-i;
            if(m.containsKey(val)){
                ans[0]=idx;
                ans[1]=m.get(val);
                break;
            }else{
                m.put(i,idx);
            }
            idx++;
        }
        return ans;
    }

}