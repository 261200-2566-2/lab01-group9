import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of positive integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter " + n + " positive integers , one per line: ");
        for (int i = 0; i < n; i++) {
            integers[i] = scanner.nextInt();
            if(integers[i] < 0){
                System.out.println("Error!! , Please enter positive integers");
                return;
            }
        }
        int l = integers.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    int temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted integers in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(integers[i]);
        }

    }
}
