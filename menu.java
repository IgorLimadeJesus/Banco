import java.util.Scanner;

public class menu {
    
    int escolha = 0;

    public void inmenu() {

        Scanner scanner = new Scanner(System.in);
        ClienteInfo clienteInfo = new ClienteInfo();

        System.out.println("Deseja fazer alguma operacao?");
        System.out.println("Digite qual opercao deseja fazer: ");
        System.out.println("1.Saque");
        System.out.println("2.Deposito");
        System.out.println("3.Trocar de nome");
        System.out.println("4.Informacoes");
        System.out.println("4.Sair");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                clienteInfo.Sacar();
                break;

            case 2:
                clienteInfo.Deposito();
                break;

            case 3:
                clienteInfo.MudarNome();
                break;

            case 4:
                clienteInfo.InfoCliente();
                break;

            case 5:
            System.out.println("Saindo da Conta...");
            System.exit(0);
                break;
        
            default:
                System.out.println("Operacao invalida");
                break;
        }

        scanner.close();

    }
}
