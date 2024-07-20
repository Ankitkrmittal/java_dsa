import java.util.Scanner;

public class day2 {
    public static void main(String args []) {
        // int i =1;
        // while(i <=10) {
        //     System.out.println(i);
        //     i++;
       // }
    //    int i;
       Scanner sc = new Scanner(System.in);
    //    i = sc.nextInt();
    //    while(i<=10){
    //     System.out.println(i);
    //     i++;
    //    }
    //    sc.close();
    // for(int i =sc.nextInt();i<=10;i++) {
    //     System.out.println(i);

   // }
   //QUESTION 1 TAKE AN INTEGER N AS INPUT AND PRINT A *N TIMES
    //   int n = sc.nextInt();
    //   for(int i=0;i<n;i++) {
    //     System.out.print("* ");
    //   }

    // QUESTION2
    // for(int i =1;i<=5;i++) {
    //     for(int j =1;j<=5;j++) {
    //         System.out.print("* ");
           
    //     }
    //     System.out.println();
    // }
    // QUESTOPN 3
    //  for(int i =1;i<=4;i++) {
    //     for(int j =1;j<=i;j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //  }
    // question
    //  for(int i =1;i<=4;i++) {
    //     for(int k =1;k<=4-i;k++) {
    //         System.out.print("  ");
    //     }
    //      for(int j =1;j<=i;j++) {
    //         System.out.print("* ");
    //      } 
         
    //      System.out.println();
    //  }
    //question
    // for(int i =4;i>=1;i--) {
    //          for(int j =1;j<=i;j++) {
    //              System.out.print("* ");
    //    }
    //    System.out.println();
    // }
    // question
    // for(int i =4;i>=1;i--) {
    //         for(int k =1;k<=4-i;k++) {
    //             System.out.print("  ");
    //         }
    //          for(int j =1;j<=i;j++) {
    //              System.out.print("* ");
    //           } 
             
    //           System.out.println();
    //      }
// question 
// for(int i =4;i>=1;i--) {
//     for(int k =1;k<=4-i;k++) {
//         System.out.print("    ");
//     }
//      for(int j =1;j<=i;j++) {
//          System.out.print("* ");
//       } 
     
//       System.out.println();
//  }
//    for(int i =1;i<=5;i++) {
//     for(int j =1;j<=5;j++) {
//         if(i==1|| i==5||j==1||j==5) {
//             System.out.print("* ");
//         } else{
//         System.out.print("  ");
//         }
        
//     }
//     System.out.println();
//    }
 // QUESTION OMMISION
 int n =5
 for(int i=1;i<=n;i++) {
    for(int k =1;k<=(n-i);k++){
        System.out.println();
    }
 }
}
}

