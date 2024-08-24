public class day12 {
    //reversing a string qustion 1
    public static  void String(String s) {
        for(int i= s.length()-1;i>=0;i--) {
           System.out.print(s.charAt(i));
        }  
    }
    public static boolean pallindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j) {
            if(s.charAt(i) != s.charAt(j))
            return false;
        i++;j--;
        }
        return true;


    }
    public static char maxoccur(String s) {
        int countMaxElement = 0;
        char maxElement = '*';
        int countcurrentElement =0;
        char currElement ='*';
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) !=currElement ) {
                if(countcurrentElement >countMaxElement) {
                    countMaxElement =countcurrentElement;
                    maxElement = currElement;
                } else
                currElement = s.charAt(i);
                countcurrentElement = 1;

            } else {
                countcurrentElement++;
            }

        }
        if(countcurrentElement >countMaxElement) {
            countMaxElement = countcurrentElement;
            maxElement = currElement;
        }
  return maxElement;
    } 

         
    
    public static void main(String[] args) {
        // String s1 = "Hello";
        // String s2 = "lo";
        // System.out.println(s1.contains(s2));
        // String s3 = " girls rule \f";
        // System.out.println(s3);
      

        //part 3
        // String s1 = "hi, this is an example string";
        // String [] arr =s1.split("\\s");
        // for(String i:arr) {
        //     System.out.println(i);
        // }

        //function to reverse a string
        
        //function to check if a string is pallindrome or not
        // find the maximum occuring element in a sorted string
        //leetcode question 424 homework
    //     String s = "potato";
    //     String(s);
    //    System.out.println(pallindrome(s));

    //    String s = "aaaabbbss";
    //    System.out.println(maxoccur(s));

    String s = "aaaabbbbbbccccccccc";
    System.out.println(maxoccur(s));

    }
}
