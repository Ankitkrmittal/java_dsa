public class day20 {
   static String [] arr = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    static void merge(int[] arr,int low,int mid, int high) {
          int size = high-low+1;
          int[] temp = new int[size];
          int i=mid,j=high,k=size-1;
          while(i>=low&& j>=mid+1) {  
            if(arr[i] >arr[j]) {
                temp[k] = arr[i];
                i--;
            } else {
                temp[k] = arr[j];
                j--;
            }
            k--;
          }
          while(i>=low) {
            temp[k] = arr[i];
            i--;k--;
          }
          while(j>=mid+1){
          temp[k] = arr[j];
          k--;
          j--;
    }
    while(j>=mid+1) {
        temp[k] = arr[j];
        k--;
        j--;
    }
    for(i=low;i<=high;i++) {
        arr[i] = temp[i-low];
    }
}
    static void mergesort(int [] arr,int low, int high) {
        if(low <high) {
            int mid = (high +low)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
           
            merge(arr,low,mid,high);
        }
    }
    static void keypress(String question, String ans)  {
       if(question.length() ==0) {
        System.out.print(ans + " ");
        return;
       }
       char ch = question.charAt(0);
       String press = arr[ch-'0'];
       for(int i=0;i<press.length();i++) {
       keypress(question.substring(1), ans +press.charAt(i));
       }
    }
      
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,7,6,8};
        int low =0;
        int high = arr.length-1;
        mergesort(arr,low,high);
        for(int i:arr) {
         System.out.println(i +" ");
        }

        // keypress function call
        //  String question = "456";
        //  String ans = "";

        //  keypress(question, ans);
    }
}
