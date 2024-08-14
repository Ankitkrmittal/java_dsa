import java.util.Scanner;

public class day8 {
    public static int [] NGEL(int arr[]) {
        int maxflow =0;
        int nger[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            nger[i] = maxflow;
            maxflow = Math.max(arr[i],maxflow);

        }
        return nger;

    }
    public static int[] nser(int [] arr) {
        int [] NSER = new int[arr.length];
        int minElement = Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            
            NSER[i] = minElement;
            minElement = Math.min(minElement,arr[i]);
        }
    
        return NSER;
    }
    public static int[] nsel(int [] arr) {
        int [] NSEL = new int[arr.length];
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            
            NSEL[i] = minElement;
            minElement = Math.min(minElement,arr[i]);
        }
    
        return NSEL;
    }
public static void rainWaterTrapping(int [] arr) {
         for(int i=0;i<arr.length;i++) {
            
         }
}
public static int reverse(int n) {
    int num =0;
    while(n>0) {
        int temp = n%10;
        num = num*10 +temp;
        n/=10;
    }
    return num;
}


static int[] rotateArray(int[] arr, int n) {
    // Write your code here.
    int m = arr.length;
    int [] temp = new int[m];
    n%=m;
    for(int i=0;i<m-n;i++) {
        temp[n+i] = arr[i];
    }

    for(int j=0;j<n;j++) {
        temp[j] = arr[m-n+j];
    }
    for(int i=0;i<m;i++) {
        arr[i] = temp[i];
    }
    return arr;

}

    public void moveZeroes(int[] nums) {
       
        for(int i=0;i<nums.length-1;i++) {
             int j =i;
            if(nums[i] ==0) {
                int temp = nums[i];
                while(j<nums.length-1) {
                    nums[i] = nums[j+1];
                    j++;
                }
                if(temp==0) {
                    nums[nums.length-1] = temp;
                }
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //        int [] arr = {3,7,2,5,8,4,9,1,6};
    //     int[] num = NGEL(arr);
    //   for(int i:num) {
    //     System.out.print(i +" ");

        // int [] arr = {9,6,4,1,7,3,5,2,8};
        // int[] NSER = nser(arr);
        // for(int i:NSER) {
        //    System.out.print(i +" ");
        // }

        // int [] arr = {9,6,4,1,7,3,5,2,8};
        // int[] NSEL = nsel(arr);
        // for(int i:NSEL) {
        //    System.out.print(i +" ");
        // }

       // int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

    //    int n = 54398;
    //    System.out.println(reverse(n));

    //   int [] arr =  {1, 2, 3, 4, 5};
    //   int n = sc.nextInt();
    //   int [] rotate = rotateArray(arr, n);
    //   for(int i:rotate) {
    //     System.out.print(i +" ");
   //   }

   int [] nums = {0,10,3,0,4};
    
   








      }
    }

