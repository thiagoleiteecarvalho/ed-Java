import java.util.Scanner;

public final class LeitoraDados {

    private Scanner scanner;

    public LeitoraDados() {
        scanner = new Scanner(System.in);
    }

    public String lerTexto() {

        String texto = scanner.nextLine();
        return texto;
    }

}