public class arrays {
    public static boolean containsDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                  return true;
                }
            }
        }
        return false;
    }
    public  static int search(int [] nums, int target) {
        int min = minSearch(nums);
        if(nums[min] <= target && target <= nums.length-1) {
            return search(nums,min,nums.length-1,target);
        }
        else {
            return search(nums,0,min,target);
        }
    }
    public static int search(int[] nums,int left,int right,int target){ 
        int l = left; 
        int r = right; 
         System.out.println(left+" "+right); 
        while(l <= r){ 
        int mid = l + (r - l)/2; 
        if(nums[mid] == target){ 
        return mid; 
        } 
        else if(nums[mid] > target){ 
        r = mid-1; 
        System.out.println(r);
        } 
        else{ 
        l = mid+1; 
        } 
        } 
        return -1; 
        } 
        public static int minSearch(int[] nums){ 
            int left = 0; 
            int right = nums.length-1; 
            while(left < right){ 
                int mid = left + (right - left)/2; 
                if(mid > 0 && nums[mid-1] > nums[mid]){ 
                return mid; 
                } 
                else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){ 
                left = mid+1; 
                } 
                else{ 
                right = mid-1; 
                } 
                } 
                 
                 
                return left; 
                }
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        //System.out.println(containsDuplicate(nums));
        System.out.println(search(nums, 0));
    }
}
