import java.util.Scanner;

public class banco {

    public static void main(String[] args)
    {
        boolean Conta = false;

        Scanner scanner = new Scanner(System.in);
        ClienteInfo clienteInfo = new ClienteInfo();
        menu Menu = new menu();

        if (Conta == false) {
            System.out.println("========================================");
            System.out.println("======== Você não tem uma conta ========");
            System.out.println("======== Crie uma para contiunar =======");
            System.out.println("========================================");

        System.out.println("Digite seu nome completo: ");
        clienteInfo.Nome = scanner.nextLine();
        System.out.println("Digite seu cpf agr: ");
        clienteInfo.CPF = scanner.nextLine();
        clienteInfo.GerarConta();
        Conta = true;

        System.out.println("========================================");
        System.out.println("========Conta criado com sucesso========");
        System.out.println("========================================");

        
        }

        clienteInfo.InfoCliente();
        Menu.inmenu();
        scanner.close();
    
    }
}