import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void PrintNonNegInt(int num){
        if(num < 0){
            System.out.println("Error it's negative integer!!!");

        }else{
            for (int i = 1; i <= num; i++) {
                System.out.println("i = " + i);
            }
        }

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = n.nextInt();
        PrintNonNegInt(number);

    }
}