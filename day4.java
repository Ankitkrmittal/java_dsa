import java.util.*;
public class day4 {
    // static int sumArray(int[] arr, int a, int b) {
    //     if(a>b || a<0||b<0||b>=arr.length) {
    //         return 0;
    //     }
    //     int sum =0;
    // for(int i=a;i<=b;i++) {
    //     sum += arr[i];
    // }
    // return sum;
    // }
    static void swap(int [] arr,int i,int j) {
        
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp; 

    }
    static void reverseUsing(int[] arr,int a, int b) {
        for(int i=a,j=b;i<j;j--,i++) {
             swap(arr, i, j);
        }
    }
    static void printArr(int[]arr) {
        for(int i:arr) {
            System.out.print(i +" ");

        }
        System.out.println();
    } 
    static boolean searching(int[] arr,int a) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == a) {
                
                return true;
                
            } 
        }
        return false;
    }
 static boolean binarysearch(int[] arr, int n,int a,int b) {
    int i=a;int j=b;
    while(i<=j) {
        int mid = (i+j)/2;
        if(arr[mid] == n) return true;

     else if(arr[mid]<n) i =mid+1;
    else j = mid-1;
    }
    return false;
 }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5} ;
        
       // reverseUsing(arr,2,4);
       // printArr(arr);
       //System.out.println(searching(arr,3));
       System.out.println(binarysearch(arr, 3,1,4));

    }
}
