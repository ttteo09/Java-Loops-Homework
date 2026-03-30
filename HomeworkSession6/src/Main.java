import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean esteValid;

        System.out.println("=== Sistem de Validare Username (5 Puncte) ===");

        // Folosim do-while: "Fa asta o data si repeta CAT TIMP nu e valid"
        do {
            esteValid = true; // Presupunem ca e bun pana gasim o eroare
            System.out.println("\nIntrodu un username (6-12 caractere, fara spatii, minim o cifra):");
            username = scanner.nextLine();

            // Regula 1: Lungimea (intre 6 si 12)
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                esteValid = false;
            }
            // Regula 2: Sa nu contina spatii
            else if (username.contains(" ")) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                esteValid = false;
            }
            // Regula 3: Sa contina cel putin o cifra
            else {
                boolean areCifra = false;
                // Trece prin fiecare litera sa caute o cifra
                for (int i = 0; i < username.length(); i++) {
                    if (Character.isDigit(username.charAt(i))) {
                        areCifra = true;
                        break;
                    }
                }
                if (!areCifra) {
                    System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                    esteValid = false;
                }
            }
        } while (!esteValid); // Daca 'esteValid' e false, o ia de la capat

        System.out.println("\nUsername acceptat: " + username);
    }
}