public class l01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);


        //==================================================

        int number = 214748364;
        long reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        if (reversedNumber <= 2147483647 && reversedNumber >= -2147483648)
            System.out.println(reversedNumber);
        else
            System.out.println("Błąd: wynik odwrócenia liczby przekracza 32-bitowy zakres liczb całkowitych.");

    }
}
