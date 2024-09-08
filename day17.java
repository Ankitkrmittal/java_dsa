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
    static void validParanthesis(int n, String ans,int l, int r) {
        if(l==n && r==n) {
             System.out.println(ans);
            return ;
        }
        if(l<n) {
            validParanthesis(n, ans + "{", l+1, r);
        }
        if(r<l) {
            validParanthesis(n, ans +"}", l, r+1);
        }  
    }
    static void permutation(String question , String ans) {
        if(question.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<question.length();i++) {
            String s1 = question.substring(0, i);
            String s2 = question.substring(i+1);
            permutation(s1+s2, ans+question.charAt(i));
        }
    }
    public static void main(String[] args) {
       
        //System.out.println( fibbonacci(8));
      //  generatesubsequence("car", "");
       // toses(3, "");
        //System.out.println(tosescount(2, null));
       // System.out.println(countSubSequence("CAR"));
      // validParanthesis(3, "", 0, 0);
      permutation("abc", "");
    }
}
 