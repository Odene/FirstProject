package OczyszczaczPowietrza;
import java.util.Scanner;

public class Aplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość pomieszczenia.");
        int metraz = scanner.nextInt();
        scanner.close();
        double wysokosc = 2.2;
        int sprawnosc = 30;
        Sprawdzenie(metraz, wysokosc, sprawnosc);
    }

    private static void Sprawdzenie(int metraz, double wysokosc, int sprawnosc) {
        if (metraz < 0) {
            System.out.println("Metraż musi być większy od 0.");
        } else if (metraz > 120) {
            System.out.println("Metraż nie może być większy niż 120.");
        } else
            System.out.println("Potrzebne będzie " + (Obliczenia(metraz, wysokosc, sprawnosc)) + " godzin aby oczyścić pomieszczenie.");

    }

    private static double Obliczenia(int metraz, double wysokosc, int sprawnosc) {
        return metraz * wysokosc / sprawnosc;
    }

}
