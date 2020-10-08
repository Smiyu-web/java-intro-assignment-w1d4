
public class MilesToKilometers {
    
    public static void main(String[] args) {
        
        final double kilometers = 1.609;

        int miles = 1;

        while (miles <= 10) {
            if (miles == 1) {
                System.out.println(miles + " mile = " + (kilometers * miles) + " kilometers");
                miles++;
            } else {
                System.out.println(miles + " miles = " + (kilometers * miles) + " kilometers");
                miles++;
            }
        }
    }
}
