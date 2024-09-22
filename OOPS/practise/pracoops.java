package OOPS.practise;

import java.util.*;

public class pracoops {
    public static class person {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String toString() {
            return "Hello! My Name is " + name;
        }
    }
    public static void main(String[] args) {
        int total = 3;
        Scanner sc = new Scanner(System.in);
        person [] persons = new person[total];
        for(int i=0;i<total;i++) {
            persons[i] = new person();
            System.out.println("Enter the name " + (i+1) + ":");
            persons[i].setName(sc.nextLine());
        }
        for(int i=0;i<total;i++) {
            System.out.println(persons[i].toString());
        }
    }
}
