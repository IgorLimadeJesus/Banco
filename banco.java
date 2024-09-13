import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        boolean contaCriada = false;

        Scanner scanner = new Scanner(System.in);
        ClienteInfo clienteInfo = new ClienteInfo(); 
        menu Menu = new menu(); 

        
        if (!contaCriada) {
            System.out.println("========================================");
            System.out.println("======== Você não tem uma conta ========");
            System.out.println("======== Crie uma para continuar =======");
            System.out.println("========================================");

            
            System.out.println("Digite seu nome completo: ");
            clienteInfo.setNome(scanner.nextLine());

            System.out.println("Digite seu CPF: ");
            clienteInfo.setCPF(scanner.nextLine());

            
            clienteInfo.GerarConta();
            contaCriada = true;

            System.out.println("========================================");
            System.out.println("======== Conta criada com sucesso =======");
            System.out.println("========================================");
        }

        
        clienteInfo.InfoCliente();

        
        Menu.inmenu(clienteInfo);

        
        scanner.close();
    }
}
