public class Fibonacci {
    public static void main(String[] args) {
        int limit = 50;
        
        int prev = 0;
        int current = 1;
        
        System.out.println("Fibonacci series up to " + limit + ":");
        System.out.print(prev + " " + current + " ");
        for (int i = 2; current + prev <= limit; i++) {
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }
    }
}
