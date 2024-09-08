package OOPS;

public class Batch {
    String batch_name;
    int cost;
    String topic;
     
    public Batch() {//default constructor
        this.batch_name = "default_batch";
        this.cost = 950000;
        this.topic = "Java";

    }
    //custom constructor
    public Batch(
        String batch_name,
        int cost,
        String topic
    ) {
        this.batch_name = batch_name;
        this.cost = cost;
        this.topic = topic;
    }
}
