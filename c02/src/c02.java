import java.util.Scanner;

public class c02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstVal = 3;
        int secondVal = myScanner.nextInt();
        String text = myScanner.next();
        System.out.println("First value = " + firstVal + ", second value = " + secondVal + ", text: " + text);

        //=================================

        System.out.print("Name: ");
        String name = myScanner.next();
        System.out.print("Surname: ");
        String surname = myScanner.next();
        System.out.println("Witaj " + name + " " + surname);

        //=================================

        System.out.print("X: ");
        int x = myScanner.nextInt();
        System.out.print("Divider: ");
        int divider = myScanner.nextInt();

        if (divider == 0)
            System.out.println("Divider can't be 0");
        else if (x % divider == 0)
            System.out.println("Liczba " + x + " jest podzielna przez " + divider);
        else
            System.out.println("Liczba " + x + " nie jest podzielna przez " + divider + ". Reszta z dzielenia to: " + x % divider);

        //=================================

        System.out.print("A: ");
        int a = myScanner.nextInt();
        System.out.print("B: ");
        int b = myScanner.nextInt();
        System.out.print("C: ");
        int c = myScanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a);
            if (b >= c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b >= a && b >= c) {
            System.out.println(b);
            if (a >= c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (a >= b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }

        //=================================

        int val = 5;
        if (val > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println((val > 0) ? "Yes" : "No");
        boolean val2 = false;
        int i = (val2) ? 5 : 8;
        System.out.println(i);

        //=================================

        System.out.print("Num1: ");
        int num1 = myScanner.nextInt();
        System.out.print("Num2: ");
        int num2 = myScanner.nextInt();
        System.out.println((num1 > num2) ? num1 : (num1 < num2) ? num2 : "num1 == num2");

        //=================================

        System.out.print("Y1: ");
        int y1 = myScanner.nextInt();
        System.out.print("Y2: ");
        int y2 = myScanner.nextInt();
        System.out.print("Y3: ");
        int y3 = myScanner.nextInt();
        System.out.println((y1 + y2 + y3 > y1 * y2 * y3) ? "Sum" : "Product");
    }
}
