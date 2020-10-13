public class TenRun2 {
  public int[] tenRun(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 10 == 0) {
        while (i < nums.length - 1 && nums[i + 1] % 10 != 0) {
          nums[i + 1] = nums[i];
          i++;
        }
      }
    }
    return nums;
  }
}
