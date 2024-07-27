import java.util.Scanner;

public class day4practise {
    public static void swap(int a, int b) {
        int x= a;
        a= b;
        b =x;
        System.out.print(a + " " + b);
    }
    public static void printnatural_number(int n) {
        for(int i =1;i<=n;i++) {
            System.out.print(i + " ");
        }
    }
    public static void isprime(int n) {
        if(n<= 1) {
            System.out.println("not prime");
            return;
        }
        for(int i=2;i<n;i++) {
            if(n%i == 0) {
                System.out.print("not prime");
                return;
            } 
        }
        System.out.println("prime");
    }
    
    
    public static boolean armstrong(int n) {
        int d = digits(n);
        int sum =0;
        int temp = n;
        while(n!=0) {
            sum+=Math.pow((n%10),d);
            n/=10;
        }
        return (sum == temp);
    }
    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // QUESTION 1
    public static void odd_even(int n){
        int odd=0,even=0;  
        int r=0;int count=1;  
       while(n!=0){
          r=n%10;
          n=n/10;
          if(count%2==0) {
              even=even+r;
          }else{
               odd=odd+r;
          }
          count++;  
      }
      System.out.println(odd);
      System.out.println(even);
  
  }
  // QUESTION 2
  public static int countDigit(long number, int digit) {
    String numberStr = Long.toString(number);
    char digitChar = Character.forDigit(digit, 10);
    
    // Count the occurrences of digitChar in numberStr
    int count = 0;
    for (int i = 0; i < numberStr.length(); i++) {
        if (numberStr.charAt(i) == digitChar) {
            count++;
        }
    }
    
    // Return the count
    return count;
  }
  // QUESTION 3
  public static int inverse(int n) {
    int temp = 0;
    while(n!= 0) {
        temp = temp*10+n%10;
        n/=10;
    }
return temp;
}
// QUESTION 4
public static void binartToDecimal(String s) {
    int ans =0;
    int p =0;
     int len = s.length();

     for(int i=len-1;i>=0;i--) {
        if(s.charAt(i) == '1') {
            ans += Math.pow(2,p);
        }
        p++;
     }
     System.out.println(ans);

}
public static void integerBinaryDecimal(int n) {
    int ans =0; int i=0;
    int rem =0;
    while(n!=0) {
       rem = n%10;
       n/= 10;
       ans += rem*Math.pow(2,i);
       i++;
    }
    System.out.println(ans);
}
// QUESTION 5
public static int LCM(int a, int b) {
    int gcd =1;
    int lcm =1;
    for(int i=1;i<=a && i<=b;++i) {
        if(a%i ==0 && b%i==0) {
            gcd = i;
        }
         lcm = (a*b)/gcd;
        
    }
    return lcm;
   
}
// QUESTION 6
public static int fibbonacci(int n) {
  int n1 = 0, n2=1;
  for(int i=0;i<n;i++) {
    System.out.print(n1 + " ");
    int n3 = n1 + n2;
    n1 =n2;
    n2=n3;
  }
  if(n==0) {
    return 0;
  }
  if(n ==1) {
    return 1;
  }
  return n1;
}
//QUESTION 10
public static int gcd(int a,int b) {
    int count =0;
  for(int i=1;i<=a && i<=b;i++) {
    if(a%i==0 && b%i==0) {
        count = i;
        
    }
  }
  return count;
} 
//QUESTION 7
public static void conversion(int min, int max, int step) {
    for(int i=min;i<=max;i+=step) {
        int y = (int) ((5.0/9)*(i - 32));
         System.out.println(i + "   " +y);
    }
}
//QUESTION 9
public static void prime(int n) {
   for(int i=2;i<n;i++) {
    if(n%i == 0){
    System.out.println("not prime");
    break;
    }
    else {
       System.out.println("prime");
       break;
    }
   }
}
//QUESTION 12
public static void replace(int n) {
   if(n==0) {
    System.out.println(5);
    return ;
   }
   int result =0;
   int place =1;
   while(n>0) {
        int digit = n%10;
        if(digit ==0) {
            digit =5;
        }
        result+= digit*place;
        n/=10;
        place*=10;
   }
   System.out.println(result);
   
   
}
//QUESTION 13
public static void series(int n1, int n2) {
    int count = 0;
    int n =1;
    while(n1>count) {
      int term = 3*n+2;
      if(term%n2 !=0) {
        System.out.println(term);
        count++;
      }
      n++;
    }
    
}
//QUESTION 19
public static void oddEven(int n) {
    int sum =0;
    int temp = 0;
    while(n>0) {
        temp = n%10;
        sum = sum+ temp;
        n = n/10;
        
    }
    if(sum%4==0||sum%3==0) {
       System.out.println("Yes");
    } else{
        System.out.println("No");
    }
}

//QUESTION 20
public static int digits(int n ) {
    int count =0;
    
    while(n!= 0) {
        n/= 10;
        count++;
    }
    return count;
}
public static boolean isarmstrong(int n) {
     int d = digits(n);
     int sum =0;
     int value =n;
     int temp =0;
     while(n>0) {
        temp = n%10;
      sum += Math.pow(temp,d);
      n/=10;
     }
     if(value == sum){
         return true;
     }
     return false;
}
//QUESTION 15

public static void btwArmstrong(int n1, int n2) {
    
    for(int i =n1+1;i<n2;i++) {
        
       if(isarmstrong(i)){
         System.out.println(i);
       }
   
    }
}
//QUESTION 17
public static int primeFactors(int number) {
    int sum = 0;
        
        // Add the number of 2s that divide number
        while (number % 2 == 0) {
            sum += 2;
            number /= 2;
        }
        
        // Number must be odd at this point, so we can skip even numbers (i.e., i = i + 2)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, add i to sum and divide number
            while (number % i == 0) {
                sum += i;
                number /= i;
            }
        }
        
        // This condition is to handle the case when number is a prime number
        // greater than 2
        if (number > 2) {
            sum += number;
        }
        
        return sum;
    }
    public static int sumOfDigits(int number) {
        int sum =0; 
        int temp =0;
        while(number>0) {
            temp = number%10;
            number/=10;
            sum+=temp;
           
        }
        return sum;
    }
    public static boolean sum(int number) {
      int  sumOfDigit = sumOfDigits(number);
      int  sumOfFactors = primeFactors(number);
      return sumOfDigit == sumOfFactors;
    }
    public static void main(String[] args) {
        //swap(2, 5);
        //printnatural_number(12);
       // isprime(4);
       //System.out.println(inverse(1234));
      // System.out.println(digits(12345));
       //System.out.println(armstrong(371));
       //int [] arr = {1,23,4,5,6};
      // System.out.println(swap(arr, 1, 4));
      Scanner sc = new Scanner(System.in);
    //   int n = sc.nextInt();
    //   odd_even(n);
    // QUESTION 2
    //    long number = sc.nextLong();
    //    int digit = sc.nextInt();
    //    System.out.println(countDigit(number, digit));
    // QUESTION 3
    // int n = sc.nextInt();
    // System.out.println(inverse(n));
    // QUESTION 4
    //   String s = sc.nextLine();
    //   binartToDecimal(s);

    // int n = sc.nextInt();
    // integerBinaryDecimal(n);

    // QUESTION 5
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println(LCM(a, b));

    //QUESTION 6
//   int n = sc.nextInt();
//   fibbonacci(n);
// QUESTION 10
//  int a = sc.nextInt();
//  int b = sc.nextInt();
//  System.out.println(gcd(a, b));
//QUESTION 7
// int min =sc.nextInt();
// int max = sc.nextInt();
// int step= sc.nextInt();
//  conversion(min, max, step);
//QUESTION 9
// int n = sc.nextInt();
// prime(n);
// QUESTION 12
//  int n = sc.nextInt();
//  replace(n);

//QUESTION 13
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();
// series(n1, n2);
//QUESTION 14
// int sum =0;
// while(true){
    
// int n = sc.nextInt();
// sum = sum+n;
// if(sum<0) {
//     break;
// }
// System.out.println(n);
// }

//QUESTION 19
// int n1 = sc.nextInt();
// for(int i=1;i<=n1;i++) {
//     int  n = sc.nextInt();
//     oddEven(n);
// }
//QUESTION 20
// int n =sc.nextInt();
// System.out.println(isarmstrong(n));

//QUESTION 15
// int n1= sc.nextInt();
// int n2 = sc.nextInt();
// btwArmstrong(n1, n2);
int numbers = sc.nextInt();
if(sum(numbers)) {
    System.out.println("1");
} else {
    System.out.println("0");
}

    }
 }

