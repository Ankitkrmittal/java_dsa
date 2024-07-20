public class day3_homework_question1 {
    public static void main(String[] args) {
        int sum =0;
        int[] arr = new  int[5];
        for(int i=0;i<arr.length;i++) {
            
            arr[i] = i;
          System.out.print(arr[i] + " ");
     

        }
         for(int i=0;i<arr.length;i++) {
            sum += i;
         }
         System.out.println();
         System.out.println(sum);
        
        
    }
}
