public class day9 {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
           int mid = high-(high-low)/2;
           if(nums[mid] == target) {
            return mid;
           }
           else if(nums[low] <=nums[mid]) {
            if(target >= nums[low] && target <= nums[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
           }
           else {
            if(target >= nums[mid] && target<= nums[high]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
           }
        }
        return -1;
    }
  static int reachCentre(int distance, int time) {
    int lowSpeed =0,highSpeed =200;
    int optimalSpeed =200;
    while(lowSpeed<=highSpeed) {
        int midSpeed = highSpeed-(highSpeed-lowSpeed)/2;
        if(check(midSpeed,distance,time)) {
            optimalSpeed = midSpeed;
            highSpeed = midSpeed-1;
        } else {
            lowSpeed = midSpeed+1;
        }
    }
    return optimalSpeed;
  }
     static boolean check(int speed, int distance, int time)  {
        int dist_travelled = speed*time;
       // if(dist_travelled >= distance)
        // return true;
        // else
        // return false;
        return (dist_travelled >=distance);
    }
    public static void main(String[] args) {
    //    int [] nums = {4,5,6,7,0,1,2};
    //    int target = 0;
    //    System.out.println(search(nums, target));
    int distance = 50;
    int time =2;
    System.out.println(reachCentre(distance, time));

    }
}
