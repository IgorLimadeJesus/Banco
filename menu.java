import java.util.Scanner;

public class menu {

    int escolha = 0;

    
    public void inmenu(ClienteInfo clienteInfo) {

        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Deseja fazer alguma operação?");
            System.out.println("Digite qual operação deseja fazer: ");
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.println("3. Trocar de nome");
            System.out.println("4. Informações");
            System.out.println("5. Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    clienteInfo.Sacar(this);
                    clienteInfo.InfoCliente(); 
                    break;

                case 2:
                    clienteInfo.Deposito(this); 
                    clienteInfo.InfoCliente(); 
                    break;

                case 3:
                    clienteInfo.MudarNome(this);
                    clienteInfo.InfoCliente(); 
                    break;

                case 4:
                    clienteInfo.InfoCliente(); 
                    break;

                case 5:
                    System.out.println("Saindo da Conta...");
                    System.exit(0); 
                    break;

                default:
                    System.out.println("Operação inválida");
                    break;
            }
        }
    }
}
