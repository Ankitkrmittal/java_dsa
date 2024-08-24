public class prac {
    static void bubblesort(int [] arr) {
        //in bubble sort we push larger element at right side
        for(int turn = 1;turn<arr.length;turn++) {
            for(int i=0;i<arr.length-turn;i++) {
                  if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]  = temp;
                  }
            }
        }
    }
    public static void selectionsort(int [] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int idx = minvalue(arr,i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            
        }
    }
    static int minvalue(int [] arr, int a) {
        int min = a;
        for(int i=a+1;i<arr.length;i++) {
            if(arr[min]>arr[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void rotate(int[] arr, int k) {
        
        int n = arr.length;
        k=k%n;
        int [] temp = new int[n];
        for(int i=0;i<n-k;i++) {
            temp[i+k] = arr[i];
        }
        for(int j=0;j<k;j++) {
            temp[j] = arr[n-k+j];
        }
        for(int i=0;i<n;i++) {
            arr[i] = temp[i];
        }
    }
    public static int[] nger(int [] arr) {
        int n = arr.length;
        int [] NGER = new int[n];
        int max =0;
        for(int i=n-1;i>=0;i--) {
            NGER[i] = max;
            max = Math.max(max, arr[i]);
        }
        return NGER;
    }
    public static int[] ngel(int [] arr) {
        int n = arr.length;
        int max =0;
        int [] NGEL = new int[n];
        for(int i= 0;i<n;i++) {
            NGEL[i] = max;
            max = Math.max(max, arr[i]);
        }
        return NGEL;
    }
    public static int[] nser(int[] arr) {
        int n = arr.length;
        int[] NSER = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--) {
           
            NSER[i] = min;
            if(NSER[i] == Integer.MAX_VALUE ) {
                NSER[i] = 0;
            }
            min = Math.min(min, arr[i]);
        }
        return NSER;
    }
    public static int[] nsel(int [] arr) {
        int n = arr.length;
        int [] NSEL = new int[n];
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            NSEL[i] = min;
            if(NSEL[i] == Integer.MAX_VALUE) {
                NSEL[i] =0;
            }
            min = Math.min(min,arr[i]);
        }
        return NSEL;
    }
    public static int stockBuyAndSale(int[] arr) {
        int mprofit = 0;
        int currprofit =0;
        int buyAt = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(buyAt> arr[i]) {
                buyAt = arr[i];
            } else {
                currprofit = arr[i] -buyAt;
                mprofit = Math.max(currprofit, mprofit);
            }

        }
        return mprofit;
    }
    public static int rainwatertrap(int [] arr) {
        int [] NGER = nger(arr);
        int [] NGEL = ngel(arr);
        int ans =0;
        
         for(int i=0;i<arr.length;i++) {
            if(arr[i] <NGER[i] && arr[i] <NGEL[i]) {
                int sub = NGER[i] -NGEL[i]; 
                if(sub <0) {
                    sub = -sub;
                }
               
                    ans += sub;
            }
         }
         return ans;
    }
    static void display(int [] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        
    //    bubblesort(arr);
    // selectionsort(arr);
    //    display(arr);

    // int k =3;
    // rotate(arr, k);
    // display(arr);
    // int[] num =nger(arr);
    //  display(num);

    //  int [] num = ngel(arr);
    //  display(num);

    // int [] num = nser(arr);
    // display(num);

    // int [] num = nsel(arr);
    // display(num);
   

   // System.out.println(stockBuyAndSale(arr));
  System.out.println(rainwatertrap(arr));

    }
}
