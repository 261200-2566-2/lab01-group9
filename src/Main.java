import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void PrintNonNegInt(int [] arr){
        System.out.println("Integers in a sorted order");
        for (int j : arr) {
            System.out.println("i = " + j);
        }
    }
    public static void SortAscendingArr(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void PushNum(int cap){
        int [] arr = new int[cap];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i< arr.length;i++){
            System.out.print("Enter number "+(i+1) +": ");
            int number = sc.nextInt();
            if(number < 0){
                i--;
                System.out.println("Error!!! Please enter NonNegative number");
                continue;
            }
            arr[i] = number;
        }
        SortAscendingArr(arr);
        PrintNonNegInt(arr);
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner n = new Scanner(System.in);
        System.out.print("Enter N: ");
        int capacity = n.nextInt();
        PushNum(capacity);
    }
}