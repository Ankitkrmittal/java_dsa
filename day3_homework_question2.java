public class day3_homework_question2 {
    public static void main(String[] args) {
        int [] arr = new int [5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = i+2;
           
        }
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
     }
}
