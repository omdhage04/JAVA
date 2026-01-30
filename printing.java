import java.util.Scanner;

public class printing {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner ip = new Scanner(System.in);
        int Ii = ip.nextInt();        // Outer loop runs 5 times
        for ( int i = 1; i <= Ii; i++) {
            // Inner loop: Fixed the brackets and condition
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            // Move to a new line after each row
            System.out.println();
        }
        ip.close();
    }
}