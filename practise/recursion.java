package java_dsa.practise;

import java.util.*;


public class recursion {
    static void count(int [] arr, int key, int index, List<Integer> result) {
        if(index == arr.length)
          return;
          if(arr[index] == key) {
            result.add(index);
          }
          count(arr, key, index+1, result);
    }
    static String digitToWord(int digit) {
        switch(digit) {
            case 0:return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5 : return "Five";
            case 6: return "Six";
            case 7 :return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
     static String numberToWord(int number) {
        if(number <10) {
            return digitToWord(number);
        }
        return numberToWord(number/10) + " " + digitToWord(number%10);
     }
     static int length(String str) {
        if(str.length() ==0) {
            return 0;
        }
        return length(str.substring(1)) +1;
     }
    public static void main(String[] args) {
        // int [] arr  = {3,2,4,5,6,2,7,2,2};
        // int key =2;
        // List<Integer> result = new ArrayList<>();
        // count(arr, key, 0, result);
        // for(int index: result) {
        //     System.out.print(index + " ");
        // }
        //question 2
        // int number = 1947;
        // String result = numberToWord(number);
        // System.out.println(result);

        //question 3
        // String str = "abcdder";
        // System.out.println(length(str));


           
        // question1 String
        // System.out.println("enter string");
        // String str = new Scanner(System.in).next();
        // int count =0;
         
        // for(int i=0;i<str.length();i++) {
        //     char ch = str.charAt(i);
        //     if(ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u') {
        //         count++;
        //     }
        // }
        
        // System.out.println("count of vovel is : " + count);
        
     //question 4 string
    //  String str1 = "earth";
    //  String str2 = "heart";
    //  if(str1.length() == str2.length()) {
    //     char [] str1charArray = str1.toCharArray();
    //     char [] str2charArray = str2.toCharArray();
    //     Arrays.sort(str1charArray);
    //     Arrays.sort(str2charArray);

    //     boolean result = Arrays.equals(str1charArray, str2charArray);
    //     if(result) {
    //         System.out.println("yes anagrams");
    //     } else {
    //         System.out.println("no anagrams");
    //     }
    //  } else {
    //     System.out.println("no anagrams");
    //  }
    }
}
