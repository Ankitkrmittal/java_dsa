public class day14 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("hello");
         sb.append("hey");  
           
         sb.append("bye");
         System.out.println(sb);
         System.out.println(sb.capacity());
         System.out.println(sb.length());
         System.out.println(sb.substring(4)); 
    }
}
