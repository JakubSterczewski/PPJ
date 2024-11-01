import java.util.Scanner;

public class c03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select an option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3, 4, 5, 6:
                System.out.println("Option 3 selected");
                break;
            default:
                System.out.println("Invalid option selected");
        }

        //=================================

        System.out.print("Select an option (switch expression): ");
        option = scanner.nextInt();

        String result = switch (option) {
            case 1 -> "Option 1 selected";
            case 2, 5 -> "Option 2 selected";
            case 3 -> "Option 3 selected";
            default -> "Invalid option selected";
        };
        System.out.println(result);

        //=================================

        System.out.print("Month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("styczen");
                break;
            case 2:
                System.out.println("luty");
                break;
            case 3:
                System.out.println("marzec");
                break;
            case 4:
                System.out.println("kwiecien");
                break;
            case 5:
                System.out.println("maj");
                break;
            case 6:
                System.out.println("czerwiec");
                break;
            case 7:
                System.out.println("lipiec");
                break;
            case 8:
                System.out.println("sierpien");
                break;
            case 9:
                System.out.println("wrzesien");
                break;
            case 10:
                System.out.println("pazdziernik");
                break;
            case 11:
                System.out.println("listopad");
                break;
            case 12:
                System.out.println("grudzien");
                break;
            default:
                System.out.println("Blad: rok ma 12 miesiecy");
        }

        //=================================

        System.out.print("Month (switch expression): ");
        month = scanner.nextInt();
        String monthText = switch (month) {
            case 1 -> "styczen";
            case 2 -> "luty";
            case 3 -> "marzec";
            case 4 -> "kwiecien";
            case 5 -> "maj";
            case 6 -> "czerwiec";
            case 7 -> "lipiec";
            case 8 -> "sierpien";
            case 9 -> "wrzesien";
            case 10 -> "pazdziernik";
            case 11 -> "listopad";
            case 12 -> "grudzien";
            default -> "Blad: rok ma 12 miesiecy";
        };
        System.out.println(monthText);

        //=================================

        System.out.print("Select an option: ");
        int a = scanner.nextInt();
        switch (a) {
            case 2:
                System.out.println("First");
                break;
            case 5:
                System.out.println("Second");
                break;
            case 10:
                System.out.println("Third");
                break;
            case 20:
                System.out.println("Fourth");
                break;
            default:
                System.out.println("None");
        }

        String resultEx5 = switch (a) {
            case 2 -> "First";
            case 5 -> "Second";
            case 10 -> "Third";
            case 20 -> "Fourth";
            default -> "None";
        };
        System.out.println(resultEx5);

        //=================================

        System.out.print("Podaj rok: ");
        int year = scanner.nextInt();
        System.out.print("Podaj miesiac: ");
        int monthEx6 = scanner.nextInt();
        int day;
        int[] monthsDays = {31, (year % 4 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        do {
            System.out.print("Podaj dzien: ");
            day = scanner.nextInt();
        } while (day < 1 || day > monthsDays[monthEx6 - 1]);

        int resultEx6 = 0;
        switch (monthEx6 - 1) {
            case 11:
                resultEx6 += monthsDays[10];
            case 10:
                resultEx6 += monthsDays[9];
            case 9:
                resultEx6 += monthsDays[8];
            case 8:
                resultEx6 += monthsDays[7];
            case 7:
                resultEx6 += monthsDays[6];
            case 6:
                resultEx6 += monthsDays[5];
            case 5:
                resultEx6 += monthsDays[4];
            case 4:
                resultEx6 += monthsDays[3];
            case 3:
                resultEx6 += monthsDays[2];
            case 2:
                resultEx6 += monthsDays[1];
            case 1:
                resultEx6 += monthsDays[0];
            case 0:
                break;
            default:
                System.out.println("Error: a year has only 12 months");
        }

        resultEx6 += day - 1;
        System.out.println("This year already lasts " + resultEx6 + " days");

        //=================================

        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'A', 'Ą', 'B', 'C', 'Ć', 'D', 'E', 'Ę', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ł', 'M', 'N', 'Ń', 'O',
                 'Ó', 'P', 'R', 'S', 'Ś', 'T', 'U', 'W', 'Y', 'Z', 'Ź', 'Ż' ->
                    System.out.println("Znak jest wielka litera alfabetu");
            case 'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'ł', 'm', 'n', 'ń', 'o',
                 'ó', 'p', 'r', 's', 'ś', 't', 'u', 'w', 'y', 'z', 'ź', 'ż' ->
                    System.out.println("Znak jest mala litera alfabetu");
            default -> System.out.println("Znak nie jest litera alfabetu");
        }

    }
}