public class day3_homework_question3 {
    
        public static void main(String[] args) {
            
            int[] arr = new int[5];
            
            // Assign values to the array and print them
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }
            
            // Reverse the array
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            
            System.out.println("\nReversed array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            
            
    
           
        }
    }
    

