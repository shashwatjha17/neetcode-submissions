class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int currentNum = n;
                int currentLength = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                longest = Math.max(longest,currentLength);
            }
        }
        return longest;
    }
}
