public class day3 {
    static void swap(int a, int b) {
      int x = a;
      a = b;
      b = x;
   System.out.println(a);
   System.out.println(b);
    }
    static void print_number(int n) {
        for(int i =1;i<=n;i++) {
            System.out.println(i);
        }
    }
    static void check_prime(int n) {  
        
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
            
            
        }
    }
 static int inverse(int n) {
    int temp =0;

    while(n!=10) {
        temp = temp*10 + n%10;
        n/=10;
       
    }
    return temp;


 }
 static void digit_present(int n ) {
    int count = 1;
    while(n>=10) {
        int t = n%10;
        n/=10;
        count++;
    }
    System.out.println(count);

 }
 public static void aramstrong(int n) {
    int count = 1;
    while(n>=10) {
        int c = n% 10;
        n/=10;
        count++;
    }
    
 }

static void printArr(int[] arr) {
     for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] +" ");
        System.out.println();
     }
}

    public static void main(String args[]) {
             //swap(2,5);
             //print_number(12);
           //  check_prime(5);
           //System.out.print(inverse(1459));
            //digit_present(49988);
            int[]  arr = new int[10];
            for(int i=0;i<arr.length;i++) {
                arr[i] = i+1;
            
            }
            printArr(arr);
            
    }
}
