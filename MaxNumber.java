public class MaxNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
