public class day8prac {
    // public static int [] nger(int [] arr) {
    //     int maxElement = 0;
    //     int [] NGER = new int[arr.length];
    //     for(int i=arr.length-1;i>=0;i--) {
    //         NGER[i] = maxElement;
    //         maxElement = Math.max(maxElement, arr[i]);
    //     }
    //     return NGER;
    // }
    public static int[] nger(int [] arr) {
             int maxElement =0;
             int [] NGER = new int[arr.length];
             for(int i=arr.length-1;i>=0;i--) {
                NGER[i] = maxElement;
                maxElement = Math.max(maxElement, arr[i]);

             }
             return NGER;
    }
    public static int[] ngel(int [] arr) {
        int maxElement =0;
        int [] NGEL = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            NGEL[i] = maxElement;
            maxElement = Math.max(maxElement,arr[i]);

        }
        return NGEL;
    }
    public static int[]  nser(int[] arr) {
        int minElement =Integer.MAX_VALUE;
        int [] NSER = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            if(minElement == Integer.MAX_VALUE) {
                NSER[i] = 0;
                
            } else 
            NSER[i] = minElement;
            minElement = Math.min(minElement, arr[i]);
             
        }
        return NSER;
    }
    public static int[] nsel(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int [] NSEL = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(minElement == Integer.MAX_VALUE) {
                  NSEL[i] =0;
            } else {
                NSEL[i] = minElement;
            }
            minElement = Math.min(minElement, arr[i]);
        }
        return NSEL;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,1,5,3,6,4};
        // int[] num = nger(arr);
        // for(int i: num) {
        //     System.out.print(i +" ");
        // }    


        //  int [] num = ngel(arr);
        // for(int i :num) {
        //     System.out.print(i +" ");
        // }
        
        
        // int [] num = nser(arr);
        // for(int i:num) {
        //     System.out.print(i +" ");
        // }

        int [] num = nsel(arr);
        for(int i:num) {
            System.out.print(i +" ");
        }
        }
    }

