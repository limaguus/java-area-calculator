import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            FormaGeometrica forma = null;

            switch (opcao) {
                case 1:
                    double lado = lerDoublePositivo(scanner, "Digite o lado do quadrado: ");
                    forma = new Quadrado(lado);
                    System.out.printf("Área do quadrado: %.2f%n", forma.calcularArea());
                    break;

                case 2:
                    double baseRetangulo = lerDoublePositivo(scanner, "Digite a base do retângulo: ");
                    double alturaRetangulo = lerDoublePositivo(scanner, "Digite a altura do retângulo: ");
                    forma = new Retangulo(baseRetangulo, alturaRetangulo);
                    System.out.printf("Área do retângulo: %.2f%n", forma.calcularArea());
                    break;

                case 3:
                    double raio = lerDoublePositivo(scanner, "Digite o raio do círculo: ");
                    forma = new Circulo(raio);
                    System.out.printf("Área do círculo: %.2f%n", forma.calcularArea());
                    break;

                case 4:
                    double baseTriangulo = lerDoublePositivo(scanner, "Digite a base do triângulo: ");
                    double alturaTriangulo = lerDoublePositivo(scanner, "Digite a altura do triângulo: ");
                    forma = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.printf("Área do triângulo: %.2f%n", forma.calcularArea());
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (opcao != 0) {
                System.out.println();
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("****** CALCULADORA DE ÁREAS ******");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Triângulo");
        System.out.println("0 - Sair");
    }

    public static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public static double lerDoublePositivo(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine();

                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("O valor deve ser maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine();
            }
        }
    }
}