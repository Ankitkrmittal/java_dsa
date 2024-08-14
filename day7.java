import java.util.Scanner;

public class day7 {
    public static int kadanesAlgo(int [] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currSum =0;
        for(int i=0;i<arr.length;i++) {
            currSum += arr[i];
            maxsum = Integer.max(maxsum,currSum);
            if(currSum<0) {
              currSum = 0;
            }
        }
        return maxsum;
    }
    // public static void rotateArray(int [] nums,int k) {
    //     int temp = 
    //     for(int i=0;i<arr.length;i++) {
    //         for(int j=arr.length;j>=k;j--) {
    //             int temp = arr[j];
                
    //         }

    //     }
    // } 
    static void display(int[] arr) {
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
       }

    //    public static void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k%=n;
    //     int[] temp = new int[nums.length];
    //     for(int i=0;i<n-k;i++) {
    //         temp[i+k] = nums[i];
            

    //         for(int j=0;j<k;j++) {
    //             temp[j] = nums[n-k+j];
    //         }
    //         for(int i=0;i<n;i++) {
    //            nums[i] = temp[i];
    //         }
    //     }
    // }
      
    //   }
    // public static void reverse()
    //   public static void rotate(int[] nums, int k) {
    //     k%=nums.length;
    //     reverse(nums,0,nums.length-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,nums.length-1);

    //   }
      public static int stock(int [] nums) {
        int maxprofit =0;
        int currprofit = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                   currprofit = nums[j]- nums[i];
                   maxprofit = Math.max(maxprofit,currprofit);
                  
            }
        }
        return maxprofit;
      }
     public static int[] NGER(int [] arr) {
        int maxElement =0;
        int[]  nger = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--) {
            nger[i] = maxElement;
            maxElement = Math.max(arr[i],maxElement);
        }
        return nger;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int [] arr = {-1,2,3,4,5,6,7};
       // System.out.println(kadanesAlgo(arr));
      //System.out.print(rotate(arr, k));
     // rotate(arr, k);
       //display(arr);
       int [] arr = {7,1,5,3,6,4};
       
       //rotate(nums, k);
      // display(arr);
       //System.out.println(stock(nums));
      int[] num = NGER(arr);
      for(int i:num) {
        System.out.print(i +" ");
      }

      // System.out.println(NGER(nums));
    }
}
