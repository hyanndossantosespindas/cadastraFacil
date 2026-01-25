import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome, cargo;
        double salarioBase, novoSalario;

        final double ESTAGIARIO = 0.05;
        final double JUNIOR = 0.10;
        final double PLENO = 0.15;

        System.out.println("Bem-vindo ao CadastraFacil!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Agora seu cargo: ");
        cargo = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.print("Por fim, digite seu salário: ");
        salarioBase = scanner.nextDouble();

        System.out.println("\n===== RELATÓRIO =====");
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário base: R$ %.0f%n", salarioBase);

        if (cargo.equals("estagiario")) {
            novoSalario = salarioBase + (salarioBase * ESTAGIARIO);
            System.out.println("Aumento: 5%");
        } else if (cargo.equals("junior")) {
            novoSalario = salarioBase + (salarioBase * JUNIOR);
            System.out.println("Aumento: 10%");
        } else if (cargo.equals("pleno")) {
            novoSalario = salarioBase + (salarioBase * PLENO);
            System.out.println("Aumento: 15%");
        } else {
            System.out.println("Cargo inválido!");
            scanner.close();
            return;
        }

        System.out.printf("Salário final: R$ %.0f%n", novoSalario);
        System.out.println("=====================");

        scanner.close();
    }
}
