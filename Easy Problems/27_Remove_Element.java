class Remove_Element {

    public int removeElement(int[] nums, int throwAwayVal) {
        int keepers = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != throwAwayVal) { // if this is a number we want to keep
            nums[keepers] = nums[i];
            keepers += 1;
            }
        }
        return keepers;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // returns 2
        int[] nums2 = {0,1,2,2,3,0,4,2}; // returns 5
        int val = 3;
        Remove_Element test = new Remove_Element();
        int result = test.removeElement(nums, val);
        int result2 = test.removeElement(nums2, val);
        System.out.println("Results for {3,2,2,3}:");
        System.out.println(result);
        System.out.println("Results for {0,1,2,2,3,0,4,2}:");
        System.out.println(result2);
        }
        
}