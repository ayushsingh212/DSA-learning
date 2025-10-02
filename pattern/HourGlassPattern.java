public class HourGlassPattern {
    
    /**
     * Prints an hourglass pattern with given height
     * @param n Height of half the hourglass (total height = 2n - 1)
     */
    public static void printHourglass(int n) {
        // Upper half (including middle)
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 5; // Height of half the hourglass
        System.out.println("Hourglass Pattern (n = " + n + "):");
        printHourglass(n);
        
        System.out.println("\nHourglass Pattern (n = 7):");
        printHourglass(7);
    }
}
