import java.util.Arrays;
import java.util.Scanner;

public class day6practise {
    // public static int binarySearch(int[] arr, int M) {
    //     int left = 0, right = arr.length - 1;
        
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
            
    //         if (arr[mid] == M) {
    //             return mid;
    //         } else if (arr[mid] < M) {
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }
        
    //     return -1;
    // }
    
    public static void subarraySum(int n, int k,int [] arr) {
        int sum=0;
        int count =0;
        for(int i=0;i<arr.length;i++) {
              for(int j=i;j<arr.length;j++) {
               sum +=arr[j];
               if(sum==k) {
                 count++;
               }
                
              }

        
        }
        System.out.println(count);

    }
    public static int[] intersectionOfArray(int n, int m,int [] arr1,int [] arr2) {
       // Sort the first array to use binary search for intersection
       Arrays.sort(arr1);

       int[] tempResult = new int[m];
       int k = 0;

       for (int i = 0; i < m; i++) {
           if (binarySearch(arr1, arr2[i])) {
               if (k == 0 || tempResult[k - 1] != arr2[i]) {
                   tempResult[k++] = arr2[i];
               }
           }
       }

       // Copy the result to an array of the correct size
       int[] result = new int[k];
       for (int i = 0; i < k; i++) {
           result[i] = tempResult[i];
       }

       return result;
   }

   private static boolean binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return true;
        }
        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return false;
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
   static void display(int[] arr) {
    for(int i:arr) System.out.print(i+" ");
    System.out.println();
   }
   public static void selectionSort(int [] arr) {
     for(int i=0;i<arr.length-1;i++) {
        int index = minimumValue(arr,i);
         int temp = arr[i];
          arr[i]  = arr[index];
         arr[index] = temp;

     }
   }
   public static int minimumValue(int [] arr,int a) {
    int mini =a;
    for(int i=a+1;i<arr.length;i++) {
        if(arr[mini]>arr[i]) {
            mini = i;
        }
        
    }
    return mini;
   }
   public static void bubbleSort(int [] arr) {
    for(int turn =1;turn<arr.length;turn++) {
        for(int i=0;i<arr.length-turn;i++) {
            if(arr[i] >arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
   }
   public static int subArrayProducts(int [] arr, int k) {
    int prod =1;
    int count =0;
    int left =0;
      for(int right =0;right<arr.length;right++) {
        prod = prod*arr[right];
        while(prod>=k && left<=right) {
            prod /= arr[left+1];
          }
          count += right- left+1;
      }
    
      return count;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//QUESTION 1
    //     // Read the size of the array
    //     System.out.print("Enter the size of array: ");
    //     int N = sc.nextInt();

    //     // Read the array elements
    //     int[] arr = new int[N];
    //     System.out.println("Enter " + N + " elements in ascending order:");
    //     for (int i = 0; i < N; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     // Read the number to find
    //     System.out.print("Enter the number to find: ");
    //     int M = sc.nextInt();

    //     // Perform the search
    //     int index = binarySearch(arr, M);

    //     // Print the result
    //     System.out.println(index);
    //   sc.close();

    // // QUESTION 2
    //    int n = sc.nextInt();
    //    int k = sc.nextInt();
    //    int [] arr = new int[n];
    //     for(int i=0;i<n;i++) {
    //         arr[i] = sc.nextInt();
            
    //     }
    //     subarraySum(n, k, arr);

    //question3
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // int [] arr1 = new int[n];
    // int [] arr2 = new int[m];
    // for(int i=0;i<n;i++) {
    //      arr1[i] = sc.nextInt();
    // }
    // for(int i=0;i<m;i++) {
    //     arr2[i] = sc.nextInt();
    // }
    

    // // Print the result
    // for (int num : intersectionOfArray(n, m, arr1, arr2)) {
    //     System.out.print(num + " ");
    // }
    //intersectionOfArray(n, m, arr, arr2);


    // int n = sc.nextInt();
    // int [] arr = new int[n];
    // for(int i=0;i<n;i++) {
    //    arr[i] = sc.nextInt();
    // }
    // insertionSort(arr);
    // display(arr);

    // int n = sc.nextInt();
    // int [] arr = new int[n];
    // for(int i=0;i<n;i++) {
    //     arr[i] = sc.nextInt();
    // }
    // //selectionSort(arr);
    // bubbleSort(arr);
    // display(arr);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
     System.out.println(subArrayProducts(arr, k));
    }
}
