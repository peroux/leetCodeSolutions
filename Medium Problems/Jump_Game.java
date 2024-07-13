class Jump_Game {
    public static void main(String[] args) {
        Jump_Game test = new Jump_Game();
        int[] nums = {2,3,1,1,4};
        System.out.println(test.canJump(nums));
        int[] nums2 = {3,2,1,0,4};
        System.out.println(test.canJump(nums2));
        int[] nums3 = {2,5,0,0};
        System.out.println(test.canJump(nums3));
        int[] nums4 = {1};
        System.out.println(test.canJump(nums4));
    }
    public boolean canJump(int[] nums) {
        int curr = nums[0];
        try {
            while(nums[curr] != 0 && curr != nums.length-1) {
                    curr += nums[curr];
                    //int test = nums[curr];
            }
            } catch (IndexOutOfBoundsException e) {
                return true;

            }
        return (nums[curr] != 0 && nums.length>1) || (nums.length == 1) || (curr>=nums.length-1);
    }
}
