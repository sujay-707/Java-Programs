import java.util.Scanner;

public class PrintNums {

    public void displayNums(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public void displayNumsRev(int n) {
        for (int i = n; i >=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print nums from 1 to entered number");
        int n = sc.nextInt();

        PrintNums pn = new PrintNums();
        System.out.println("The nums are as follows");
        pn.displayNums(n);
        System.out.println("The numbers printed Reverese ");
        pn.displayNumsRev(n);

        sc.close();

    }

}
