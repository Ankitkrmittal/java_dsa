public class day10 {
    public static boolean check(int[] piles, int currentspeed,int hours) {
        int temptime =0;
        for(int i=0;i<piles.length;i++) {
            if(piles[i] %currentspeed ==0) {
             temptime+=piles[i]/currentspeed;
            } else {
                temptime +=(piles[i]/currentspeed) +1;
            }
        }
        return(temptime<=hours);
    }
    public static void mineatingspeed(int [] piles,int)

}
}