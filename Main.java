public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] res = twoSum(nums, target);

        System.out.println(res[0] + " -> " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i=0; i < size; i++){
            for(int j=i+1; j < size; j++){
                if((nums[i] + nums[j] == target)) return new int[] {i,j};
            }
        }

        return new int[] {};
    }
}
