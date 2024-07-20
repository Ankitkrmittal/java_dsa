public class day2_prac {
    public static void main(String args[]) {
//         Ques 1:
// n = 5
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

//           for(int i =1;i<=5;i++) {
//             for(int j =1;j<=5;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//           }


// Ques 2:
// n = 5
// *
// * *
// * * *
// * * * *
// * * * * *
//   for(int i=1;i<=5;i++) {
//     for(int j=1;j<=i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
//   }


// Ques 3:
// n = 5
// * * * * *
// * * * *
// * * *
// * *
// *
//    for(int i =1;i<=5;i++) {
//     for(int j=1;j<=6-i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
//    } 


// Ques 4:
// n = 5
//         *
//       * *
//     * * *
//   * * * *
// * * * * *  
//     for(int i=1;i<=5;i++) {
//         for(int k =1;k<=5-i;k++) {
//            System.out.print("  ");
//         }
//         for(int j=1;j<=i;j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }

// Ques 5:
// n = 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// for(int i=5;i>=1;i--) {
//     for(int k =1;k<=5-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// Ques 6:
// n = 5
// * * * * *
//     * * * *
//         * * *
//             * *
//                  *
// for(int i=5;i>=1;i--) {
//     for(int k =1;k<=10-2*i;k++) {
//         System.out.print("    ");
//     }
//     for(int j =1;j<=i;j++) {
//         System.out.print("*  ");
//     }
//     System.out.println();
// }

// Ques 7:
// n = 5
// * * * * *
// *       *
// *       *
// *       *
// * * * * *
// for(int i =1;i<=5;i++) {
//     for(int j =1;j<=5;j++) {
//         if(i==1|| i==5|| j==1||j==5) {
//             System.out.print("* ");
//         }
//         else {
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }

// Ques 8:
// n = 5
// *        *
//  *     *
//     *
//  *     *
// *        *
// for(int i=1;i<=5;i++) {
//     for(int j =1;j<=5;j++) {
//         if(i==j||i+j==6) {
//             System.out.print("* ");
//         } else {
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }

// Ques 9:
// n = 5
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
// int stars=1;
// for(int i=0;i<5;i++) {
//     for(int j =0;j<5-i-1;j++) {
//         System.out.print("  ");
//     }
//     for(int j =0;j<stars;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
//     stars +=2;
// }

// Ques 10:
// n = 5
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
//  int n =5;
//   for(int i=n;i>=1;i--) {
//     for(int j =n;j>i;j--) {
//         System.out.print("  ");
//     }
//     for(int k=1;k<=(2*i-1);k++) {
//         System.out.print("* ");
//     }
//     System.out.println();
//   }


// Ques 11:
// n = 5
//      *
//    *  *
//   *  *  *
//  *  *  *  *
// *  *  *  *  *
// int n =5;

// for(int i=1;i<=n;i++) {
//     for(int k=i;k<n;k++) {
//         System.out.print("  ");
//     }
//     for(int j=1;j<=2*i-1;j++ ) {
//         if(j%2==0) {
//             System.out.print("  ");
//         } else {
//             System.out.print("* ");
//         }
//     }
//     System.out.println();
// }

// Ques 12:(similar to q11 only addition of ! this)
// n = 5
//         *
//       * ! *
//     * ! * ! *
//   * ! * ! * ! *
// * ! * ! * ! * ! *
// int n =5;
// for(int i=1;i<=n;i++) {
//   for(int k =i;k<n;k++) {
//     System.out.print("  ");
//   }
//   for(int j =1;j<=2*i-1;j++) {
//     if(j%2==0) {
//         System.out.print("! ");
//     } else {
//         System.out.print("* ");
//     }
//   }
//   System.out.println();
// }

// Ques 13:
// n = 5
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// int n =5;
// for(int i=1;i<=n;i++) {
//     for(int j=1;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for(int i=n-1;i>=1;i--) {
//     for(int j =1;j<=i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// Ques 14:
// n = 5
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// int n =5;
// for(int i=1;i<=n;i++) {
//     for(int k=1;k<=n-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for(int i=n-1;i>=1;i--) {
//     for(int k=1;k<=n-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=i;j++) {
//         System.out.print("* ");
//     }
//     System.out.println(); 
// }

// Ques 15:
// n = 5
// * * * * *
//     * * * *
//         * * *
//             * *
//                 *
//             * *
//         * * *
//     * * * *
// * * * * *

//  int n =5;
//  for(int i=1;i<=n;i++) {
//     for(int k=1;k<=2*i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =n-i+1;j>0;j--) {
//         System.out.print("* ");
//     }
//     System.out.println();
//  }
//  for(int i=n-1;i>0;i--) {
//     for(int k=1;k<=2*i;k++) {
//         System.out.print("  ");
//     }
//     for(int j=n-i+1;j>0;j--) {
//         System.out.print("* ");
//     }
//     System.out.println();
//  }

// Ques 16:
// n = 5
//         * * * * *
//       * * * *
//     * * *
//   * *
// *
//   * *
//     * * *
//     * * * *
//       * * * * *

// int n =5;
// for(int i=n;i>=1;i--) {
//    for(int k=0;k<=i;k++) {
//     System.out.print("  ");
//    }
//    for(int j =1;j<=i;j++) {
//     System.out.print("* ");
//    }
//    System.out.println();
// }
// for(int i=1;i<n;i++) {
//     for(int k =0;k<=i+1;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=i+1;j++) {
//         System.err.print("* ");
//     }
// System.out.println();
// }

// Ques 17:
// n = 7
// CODING BLOCKS: PATTERN QUESTIONS
// Page No. 7
// * * *   * * *
// * *       * *
// *           *

// *           *
// * *       * *
// * * *   * * *

// int n = 3; 

//         // Print the upper part of the pattern
//         for (int i = 0; i < n; i++) {
//             // Print stars on the left side
//             for (int j = 0; j < n - i; j++) {
//                 System.out.print("* ");
//             }
//             // Print spaces in the middle
//             for (int j = 0; j < 2 * i+2; j++) {
//                 System.out.print("  ");
//             }
//             // Print stars on the right side
//             for (int j = 0; j < n - i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//         // Print the lower part of the pattern
//         for (int i = n - 1; i >= 0; i--) {
//             // Print stars on the left side
//             for (int j = 0; j < n - i; j++) {
//                 System.out.print("* ");
//             }
//             // Print spaces in the middle
//             for (int j = 0; j < 2 * i+2; j++) {
//                 System.out.print("  ");
//             }
//             // Print stars on the right side
//             for (int j = 0; j < n - i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

// Ques 18:
// n = 7
//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *
// int n =4;
// for(int i=1;i<=n;i++) {
//     for(int k=i;k<n;k++) {
//         System.out.print("  ");
//     }
//     for(int j=1;j<=(2*i-1);j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for(int i=n-1;i>=1;i--) {
//     for(int k =n;k>i;k--) {
//         System.out.print("  ");
//     }
//     for(int j=1;j<=(2*i-1);j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }


// Ques 19:
// n = 7
// * * * * * * *
// * * *   * * *
// * *       * *
// *           *
// * *       * *
// * * *   * * *
// * * * * * * *
// int n = 7; // Total number of rows in the pattern
//         int mid = n / 2;
 
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i <= mid) { // Top half
//                     if (j <= mid - i || j >= mid + i) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 } else { // Bottom half
//                     if (j <= i - mid || j >= n - (i - mid) - 1) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
    
// Ques 20:
// n = 7
// HOLLOW DIAMOND PATTERN

// int n = 7; // Total number of rows in the pattern
//         int mid = n / 2;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i <= mid) { // Top half
//                     if (j == mid - i || j == mid + i) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 } else { // Bottom half
//                     if (j == i - mid || j == n - (i - mid) - 1) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
// Ques 21:
// n = 5
// *               *
// * *           * *
// * * *       * * *
// * * * *   * * * *
// * * * * * * * * *

// int n = 5; // Number of rows in the pattern

//         for (int i = 0; i < n; i++) {
//             // Left part of the pattern
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             // Spaces in the middle
//             for (int j = 0; j < 2*(n - i - 1); j++) {
//                 System.out.print("  ");
//             }

//             // Right part of the pattern
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
// Ques 22:
// n = 5
// * * * * * * * * *
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *
// int n =5;
// for(int i=n;i>=1;i--) {
//    for(int j =1;j<=i;j++) {
//       System.out.print("* ");
//    }
//    for(int k =0;k<2*(n-i+1);k++) {
//     System.out.print("  ");
//    }
//    for(int j =1;j<=i;j++) {
//     System.out.print("* ");
//    }
//    System.out.println();
// }


//NUMBER PATTERN

// Ques 23:
// n = 5
//         1
//       1 1 1
//     1 1 1 1 1
//   1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1
// int n=5;
// for(int i=0;i<n;i++) {
//     for(int k =0;k<n-i-1;k++) {
//         System.out.print("  ");
//     }
//     for(int j =0;j<2*i+1;j++) {
//         System.out.print("1 ");
//     }


//     System.out.println();
// }
// Ques 23:
// n = 5
// 1
// 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5
// int n =5;
// for(int i=1;i<=n;i++) {
//     for(int k =1;k<=n-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=2*i-1;j++) {
//         System.out.print(i +" ");
//     }
//     System.out.println();
// }

// Ques 25:
// n = 5
//           1
//         2 3 4
//       5 6 7 8 9
//    10 11 12 13 14 15 16
// 17 18 19 20 21 22 23 24 25
// int n =5;
// int num =1;
// for(int i=1;i<=n;i++) {
//     for(int k =1;k<=n-i;k++) {
//         System.out.print("   ");
//     }
//     for(int j =1;j<=2*i-1;j++) {
//         System.out.print((String.format("%2d",num++ )));
//         System.out.print(" ");
        
        
//     }
//     System.out.println();
    
//}
// Ques 26:
// n = 5
//         1
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9
// int n =5;
// for(int i=1;i<=n;i++) {
//     for(int k=1;k<=n-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j=1;j<=2*i-1;j++) {
//         System.out.print(j +" ");
//     }
//     System.out.println();
// }

// Ques 27:
// n = 5
//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
//  int n =5;
//  for(int i=1;i<=n;i++) {
//     for(int k=1;k<=n-i;k++) {
//         System.out.print("  ");
//     }
//     for(int j =1;j<=i;j++) {
//         System.out.print( j + " ");
//     }
//     for(int j=i-1;j>0;j--) {
//       System.out.print(j + " ");
//     }
//     System.out.println();
//  }

// Ques 28:
// n = 5
//         1
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5
// int n = 5; // Number of rows

//         for (int i = 1; i <= n; i++) {
//             // Printing leading spaces
//             for (int k = n - i; k > 0; k--) {
//                 System.out.print("  ");
//             }

//             // Printing ascending part
//             int num = i;
//             for (int j = 0; j < i; j++) {
//                 System.out.print(num + j + " ");
//             }

//             // Printing descending part
//             for (int j = i - 2; j >= 0; j--) {
//                 System.out.print(num + j + " ");
//             }

//             // Move to the next line after printing each row
//             System.out.println();
//         }

// Ques 29:
// n = 5
//         1
//       2 0 2
//     3 0 0 0 3
//   4 0 0 0 0 0 4
// 5 0 0 0 0 0 0 0 5
// int n = 5; // Number of rows

// for (int i = 1; i <= n; i++) {
//     // Printing leading spaces
//     for (int k = n - i; k > 0; k--) {
//         System.out.print("  ");
//     }

//     // Printing the first number of the row
//     System.out.print(i + " ");

//     // Printing the zeros in the middle
//     for (int j = 1; j < 2 * (i - 1); j++) {
//         System.out.print("0 ");
//     }

//     // Printing the last number of the row
//     if (i > 1) {
//         System.out.print(i);
//     }

//     // Move to the next line after printing each row
//     System.out.println();
// }
// Ques 30:
// n = 5
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// int n =5;
// for(int i=1;i<=n;i++) {
//     for(int j =5;j>=1;j--) {
//         System.out.print(j + " ");
//     }
//     System.out.println();
// }
// Ques 31:
// n = 5
// 5 4 3 2 *
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1
// int n =5;
// for(int i =n;i>=1;i--) {
//     for(int j =5;j>=1;j--) {
//         if(i+ j == 6) {
//             System.out.print("* ");
//         } else {
//             System.out.print(j + " ");
//         }
//     }
//     System.out.println();
// }
// Ques 32:
// n = 5
// 1
// 2 * 2
// 3 * 3 * 3
// 4 * 4 * 4 * 4
// 5 * 5 * 5 * 5 * 5
// 4 * 4 * 4 * 4
// 3 * 3 * 3
// 2 * 2
// 1

//         int n = 5; // Number of rows for the top part

//         // Top part of the pattern
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print(i + "  *  ");
//             }
//             System.out.println(i +" ");
//         }

//         // Bottom part of the pattern
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print(i + "  *  ");
//             }
//             System.out.println(i + " ");
//         }
    


int n = 9; // number of rows in the pyramid
for (int i = 1; i <= n; i++) {
    // print leading spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
    }
    // print numbers in ascending order
    for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
    }
    // print numbers in descending order
    for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
    }
}

