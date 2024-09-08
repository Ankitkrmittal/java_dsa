package OOPS;

public class student {
    int roll;
    String name;
    Batch enrolled_Batch;

    public student() {//default constructor
        this.roll = 0;
        this.name = "unknown";
        this.enrolled_Batch = new Batch();
        
    }//custom constructor
    public student(
        int roll,
        String name,
        String batch_name,
        int batch_cost,
        String batch_topic
    ) {
        this.roll = roll;
        this.name = name;
        enrolled_Batch = new Batch(
            batch_name,
            batch_cost,
            batch_topic
        );
    }
    void study() {
        System.out.println(this.name + " is Studying");
    }
}