public class day16 {
    static int fact(int n) {
        if(n==0|| n==1)
        return 1;
        int x = n*fact(n-1);
        return x;
    }
    static int pow(int a, int b) {
        if(a==0)
        return 1;
        int x =b*pow(a-1,b);
        return x;
    }
    static int facttail(int n, int x) {
          if(n==0||n==1)
          return x;
          return facttail(n-1, (n)*x);
    }
    public static void main(String[] args) {
       // int n=31;
        //System.out.println(fact(n));
        //System.out.println(pow(3, 3));
        System.out.println(facttail(5, 1));
        
    }
}
