import java.util.ArrayList;
import java.util.List;

public class Non_Cyclical_Number {
    public static void main(String[] args) throws Exception {
        Non_Cyclical_Number test = new Non_Cyclical_Number();
        //isHappy(100);
        test.isHappy(2);
    }

    public boolean isHappy(int n) {
        int curr = n;
        List<Integer> seen = new ArrayList<>(); //not sure if i want a HashMap or list here tbh
        while(!seen.contains(curr) && curr != 1) {
            for(int i = 0; i < String.valueOf(n).length(); i++) { // converts into a string and takes the length of that
                System.out.println("\nindex: " + i);
                System.out.println("digit: " + n / (int) (Math.pow(10,i)) % 10);
                curr += (int) (Math.pow(n / Math.pow(10,i) % 10,2)); // uses i as a means for denoting the positional value via division and modulo, then squares it and casts as an int
                System.out.println(curr);
            }
            seen.add(curr); //add to our list of results
            curr = n;

        }
        return curr == 1;
    }
}