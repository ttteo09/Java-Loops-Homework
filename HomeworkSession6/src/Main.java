import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- EXERCIȚIUL 1: TRIUNGHIUL DE STELUȚE ---
        System.out.println("=== 1. Desenare Triunghi ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Trecem la rândul următor
        }

        // --- EXERCIȚIUL 2: LOCURI LIBERE CINEMA ---
        System.out.println("\n=== 2. Cautare Loc Cinema (Matrice) ===");
        // 1 = Ocupat, 0 = Liber
        int[][] sala = {
                {1, 1, 1},
                {0, 1, 1}, // Aici avem un loc liber la randul 1, locul 0
                {1, 0, 1}
        };

        boolean locGasit = false;
        for (int r = 0; r < sala.length; r++) {
            for (int c = 0; c < sala[r].length; c++) {
                if (sala[r][c] == 0) {
                    System.out.println("Am gasit loc liber la: Randul " + r + ", Locul " + c);
                    locGasit = true;
                    break; // Ne oprim din cautarea pe acest rand
                }
            }
            if (locGasit) break; // Ne oprim de tot din cautare
        }

        // --- EXERCIȚIUL 3: VALIDARE USERNAME (Cel facut anterior) ---
        System.out.println("\n=== 3. Validare Username ===");
        String username;
        boolean esteValid;

        do {
            esteValid = true;
            System.out.println("Introdu un username (6-12 caractere, fara spatii, minim o cifra):");
            username = scanner.nextLine();

            // Verificare lungime si spatii
            if (username.length() < 6 || username.length() > 12 || username.contains(" ")) {
                System.out.println("Eroare! Reguli lungime/spatii nerespectate.");
                esteValid = false;
            } else {
                // Verificare daca are cel putin o cifra
                boolean areCifra = false;
                for (int i = 0; i < username.length(); i++) {
                    if (Character.isDigit(username.charAt(i))) {
                        areCifra = true;
                        break;
                    }
                }
                if (!areCifra) {
                    System.out.println("Eroare! Username-ul trebuie sa contina minim o cifra.");
                    esteValid = false;
                }
            }
        } while (!esteValid);

        System.out.println("\nUsername acceptat cu succes: " + username);
    }
}
