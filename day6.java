import java.util.Arrays;
import java.util.Scanner;

public class day6 {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int idx = minimumValue(arr,i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
           
        }
    }
    public static int minimumValue(int[] arr,int a) {
        int mini =a;
        for(int i=a+1;i<arr.length;i++) {
            if(arr[mini]>arr[i]) {
                mini =i;
            }
        }
        return mini;
    }
    static void display(int[] arr) {
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
       }
       public static void insertionSort(int arr[]) {
          
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];   
            int j =i-1;
            while(j>=0&& arr[j] >key) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
       }
       public static int sum(int[] nums, int a, int b) {
        int sum =0;  
        for(int i=a;i<=b;i++) {
            sum +=nums[i];
        }
        return sum;   
    }
       public static int subArray(int [] nums) {

        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
              int tempsum = sum(nums,i,j);
              maxsum = Math.max(maxsum,tempsum);
            }

        }
        return maxsum;
       }
       public static void seeding(int n) {
        
        // Write your code here
        for(int i=1;i<=n;i++)  {
            for(int j=n-i;j>0;j--) {
                System.out.print("1 ");
            }
            System.out.println(); 
        }
        
        
    }
       
    public static void main(String[] args) {
        //int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
       // int [] arr = {6,4,1,8,3,2};
       // selectionSort(arr);
        //insertionSort(arr);
        // Arrays.sort(arr);
        // System.out.println(Arrays.binarySearch(arr, 3));
         //display(arr);
        //System.out.println(subArray(nums));
        //System.out.println(subArray(arr));
        //display(arr);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seeding(n);
    }
}
