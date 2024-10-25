public class c01 {
    public static void main(String[] args) {
        boolean isWindy = true;
        boolean isRainy = true;
        if (isWindy && isRainy) {
            System.out.println("The weather is awful today");
        } else if (isWindy || isRainy) {
            System.out.println("It could have been worse...");
        } else {
            System.out.println("The weather is ok today.");
        }

        //===========================================================================

        int val1 = 3;
        if (val1 < 5)
            System.out.println("it works just fine");
        else
            System.out.println("I would like to...");
        System.out.println("...print this message only if the condition is not met");


        int val2 = 3;
        if (val2 < 5)
            System.out.println("it works just fine");
        else {
            System.out.println("I would like to...");
            System.out.println("...print this message only if the condition is not met");
        }

        //===========================================================================

        int x1 = 31;
        int x2 = 823;
        if (x1 < x2)
            System.out.println(x2);
        else if (x1 > x2)
            System.out.println(x1);
        else
            System.out.println("x1 = x2");

        //===========================================================================

        int x4 = 3129;
        System.out.println(x4 / 3);
        if (x4 % 3 == 0) System.out.println("x4 is divisible by 3");


        //===========================================================================

        int x15 = 392, x25 = 238, x35 = 102;

        if (x15 > x25 && x15 > x35)
            System.out.println(x15);
        else if (x25 > x15 && x25 > x35)
            System.out.println(x25);
        else if (x35 > x15 && x35 > x25)
            System.out.println(x35);
        else {
            if (x15 == x25)
                System.out.println("x15 == x25");
            else if (x15 == x35)
                System.out.println("x15 == x35");
            else
                System.out.println("x25 == x35");
        }

        //===========================================================================

        int age = 23;
        System.out.println(age < 18 ? "niepelnoletnia" : age < 40 ? "mlodzi dorosli" : age < 60 ? "dorosla" : "starsza");

        //===========================================================================

        char sign = 'a';
        switch (sign) {
            case 'A', 'Ą', 'B', 'C', 'Ć', 'D', 'E', 'Ę', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ł', 'M', 'N', 'Ń', 'O',
                 'Ó', 'P', 'R', 'S', 'Ś', 'T', 'U', 'W', 'Y', 'Z', 'Ź', 'Ż' -> System.out.println("Upper case");
            case 'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'ł', 'm', 'n', 'ń', 'o',
                 'ó', 'p', 'r', 's', 'ś', 't', 'u', 'w', 'y', 'z', 'ź', 'ż' -> System.out.println("Lower case");
            default -> System.out.println("It's not a letter");
        }

        //===========================================================================

        //R = 255, G = 192, B = 203
        System.out.println((255 << 16) + (192 << 8) + 203);

        int color = 8388564;
        System.out.println(((color >> 16) & 255) + " " + ((color >> 8) & 255) + " " + (color & 255));
    }
}
