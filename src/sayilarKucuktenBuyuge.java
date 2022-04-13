import java.util.Scanner;

public class sayilarKucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("B sayısını giriniz : ");
        b = input.nextInt();
        System.out.print("C sayısını giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {

            if (b > c) {
                System.out.print("C < B < A");
            } else {
                System.out.print("B < C < A");
            }
        }
        if ((b > a) && (b > c)) {


            if (a > c) {
                System.out.print("C < A < B");
            } else {
                System.out.print("A < C < B");
            }
        }
        if ((c > a) && (c > b)) {


            if (a > b) {
                System.out.print("B < A < C");
            } else {
                System.out.print("A < B < C");
            }
        }
    }
}