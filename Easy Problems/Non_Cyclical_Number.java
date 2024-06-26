public class Non_Cyclical_Number {
    public static void main(String[] args) throws Exception {
        isHappy(100);
    }

    public static boolean isHappy(int n) {
        int curr;
        int[] seen; //not sure if i want a HashMap or list here tbh
        boolean terminated = false;
        while(!terminated) {
            curr = 0;
            for(int i = 0; i < String.valueOf(n).length(); i++) { // converts into a string and takes the length of that
                //System.out.println("\nindex: " + i);
                //System.out.println("digit: " + n / (int) (Math.pow(10,i)) % 10);
                curr += (int) (Math.pow(n / Math.pow(10,i) % 10,2)); // uses i as a means for denoting the positional value via division and modulo, then squares it and casts as an int
                //System.out.println(curr);
            }
            seen.add(curr); //add to our list of results
            terminated = true;
        }
        return terminated;
    }
}