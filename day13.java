import java.util.Arrays;

public class day13 {
    //input
    static void populate(int[][] nums) {
        int n = 1;
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                nums[i][j] = n;
                n++;
            }
        }
    }
    //display
    static void display(int [][] nums) {
        for(int i=0;i<nums.length;i++) {
           for(int j=0;j<nums[0].length;j++) {
            System.out.print(nums[i][j] +" ");
           }
           System.out.println();

        } 
    }
    static int sum(int[][] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                sum +=nums[i][j];
            }
        }
        return sum;
    }
    static int[] search(int[][] nums, int n) {
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                if(nums[i][j] == n) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans; 
    }
   /// transpose of matrix
    static void  swap(int nums[][]) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<i;j++){ 
                 int temp = nums[i][j];
                 nums[i][j] = nums[j][i];
                 nums[j][i] = temp;
            }
        }
        
    }
    static void sortByRows(int [][] nums) {
        for(int i=0;i<nums.length;i++) {
            Arrays.sort(nums[i]);
        }
    }
    static void sortByCols(int[][] nums) {
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    }
    // sort for whole matrix
    static void sortComplete(int[][] nums) {
        int [] arr = flatten(nums);
        Arrays.sort(arr);
        fillArray(nums,arr);
    }
    static void fillArray(int [][] nums, int[] arr) {
        int rows = nums.length;
        int cols = nums[0].length;
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                nums[i][j] = arr[cols*i +j];
            }
        }
    }
    static int[] flatten(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int [] arr = new int[rows*cols];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                arr[cols*i+j] = nums[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       // int [][] nums = new int[4][4];
       // int [] arr = new int[5];
        int[] arr ={1,2,3};
        // int [][] nums = {{1,2,3,4},
        //                   {5,6,7,8},
        //                    {9,10,11,12}};
        int [] []nums = {
            {1,4,3},
            {8,6,7},
            {2,5,9}
        };
       // int [][][] grid = new int[4][2][1];
      //  populate(nums);
        display(nums);
        System.out.println();
        sortComplete(nums);day
        //sortByCols(nums);
        //sortByRows(nums);
       // swap(nums);
        display(nums); 
        // System.out.println(sum(nums));
        // int[] indices = search(nums, 7);
        // System.out.println("i " + indices[0] + " j  " + indices[1]  );
       // System.out.println(search(nums, 3));
        //System.out.println(nums[0][1]); 
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
    }
}
