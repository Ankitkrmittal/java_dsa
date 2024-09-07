public class day17 {
    static int fibbonacci(int n) {
       if(n==1) {
        return 0;
       }
       if(n==2) {
        return 1;
       }
       int fib = fibbonacci(n-1) + fibbonacci(n-2);
       return fib;
    }
    static void generatesubsequence(String ques, String ans) {
        if(ques.length() ==0) {
            System.out.println(ans);
            return;
        }
        generatesubsequence(ques.substring(1), ans+ques.charAt(0));
        generatesubsequence(ques.substring(1),ans);
    }
    static void toses(int n, String p2) {
        if(n==0) {
            System.out.println(p2);
            return;
        }
          toses(n-1,p2 + "H");
          toses(n-1, p2 + "T");
    }
    static int tosescount(int n, String p2) {
        
        if(n==0) {
            return 1;
        }
        if(n==1) {
            return 2;
        }
        int l =tosescount(n-1,p2 +"H");
        int r =tosescount(n-1,p2+"T");
        
        return l+r;

    }
    static int countSubSequence(String ques) {
        if(ques.length()==0) {
            return 1;
        }
       
        int l =countSubSequence(ques.substring(1));
        int r =countSubSequence(ques.substring(1));
        return l+r;
    }
    public static void main(String[] args) {
       
        //System.out.println( fibbonacci(8));
       // generatesubsequence("car", "");
       // toses(3, "");
        //System.out.println(tosescount(2, null));
        System.out.println(countSubSequence("CAR"));
    }
}
 