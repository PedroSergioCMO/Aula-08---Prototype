import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println(" FÁBRICA DE VIOLÕES ");
        System.out.println("Padrão Prototype - Escolha seu violão\n");

        do {
            exibirMenu();
            opcao = lerOpcao(scanner);
            
            if (opcao == 0) {
                System.out.println("\nObrigado por usar nosso sistema!");
                break;
            }
            
            Violao violao = obterViolao(opcao);
            
            if (violao != null) {
                System.out.println("\n Resultado:");
                violao.mostrarDetalhes();
            } else {
                System.out.println("\nOpção inválida! Digite 1-9 ou 0 para sair.");
            }
            
        } while (true);
        
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Violão Clássico");
        System.out.println("2 - Violão Folk");
        System.out.println("3 - Violão Flet");
        System.out.println("4 - Violão Jumbo");
        System.out.println("5 - Violão 7 Cordas");
        System.out.println("6 - Violão 12 Cordas");
        System.out.println("7 - Violão Zero");
        System.out.println("8 - Violão Duplo Zero");
        System.out.println("9 - Violão Triplo Zero");
        System.out.println("0 - Sair");
        System.out.print(" Escolha: ");
    }

    private static int lerOpcao(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    private static Violao obterViolao(int opcao) {
        switch (opcao) {
            case 1: return FabricaVioloes.getViolao("classico");
            case 2: return FabricaVioloes.getViolao("folk");
            case 3: return FabricaVioloes.getViolao("flet");
            case 4: return FabricaVioloes.getViolao("jumbo");
            case 5: return FabricaVioloes.getViolao("7cordas");
            case 6: return FabricaVioloes.getViolao("12cordas");
            case 7: return FabricaVioloes.getViolao("zero");
            case 8: return FabricaVioloes.getViolao("duplozero");
            case 9: return FabricaVioloes.getViolao("triplozero");
            default: return null;
        }
    }
}