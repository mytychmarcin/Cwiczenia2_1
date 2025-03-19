import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");
        String wyraz = skaner.nextLine();

        String wynik = zamienNaMale(wyraz);
        System.out.println("Wynik: " + wynik);

        skaner.close();
    }

    public static String zamienNaMale(String tekst) {
        return tekst.toLowerCase();
    }
}
