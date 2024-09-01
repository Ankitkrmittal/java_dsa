import java.util.ArrayList;
//import java.util.Collections;


 
public class day15 {
    static ArrayList<Integer> findSubArray(int [] arr, int k) {
        // ArrayList<Integer> nums = new ArrayList<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0;i<arr.length;i++) {
        //     nums.add(arr[i]) ;
        // } 
          int start =0;
          int end =k-1;
          int maxsum =0;
          for(int i=0;i<=end;i++) 
            maxsum+=arr[i];
          
          int currsum = maxsum;
          int index =0;
          while(end<arr.length) {
            currsum -= arr[start];
            start++;
            end++;
            currsum +=arr[end];
            if(maxsum<currsum) {
                index = start;
                maxsum = currsum;
            }
          }
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=index;i<index+k;i++) {
            nums.add(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        // ArrayList<Integer>arr = new ArrayList<>();  
        // //add
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // //get
        // System.out.println(arr.get(0));
        // //remove
        // //arr.remove(1);
        // //update
        // arr.set(1,100);
        // //sort
        // Collections.sort(arr);
        
        // //display
        // System.out.println(arr);
        // System.out.println(arr.size());
        // //System.out.println(arr.);

        //create a function to find the maximum sum subarray of size k
        ArrayList<Integer> nums = new ArrayList<>();
        int [] arr = {10,20,30,10,20,10,1,40,40};
         nums =  findSubArray(arr, 3);
        System.out.println(nums);

       // ArrayList<Integer> arr = new ArrayList<>();


    }
}
