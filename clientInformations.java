import java.util.Random;
import java.util.Scanner;

class ClienteInfo {
    
    String Nome;
    String CPF;
    int nConta;
    double saldo;
    double saque;
    double deposito;

    public void GerarConta()
    {
        Random random = new Random();
        this.nConta = 10000 + random.nextInt(90000);
    }

    public void InfoCliente()
    {
        System.out.println("Nome: " + Nome);
        System.out.println("Conta: " + nConta);
        System.out.println("saldo: R$" + saldo);
        
    }

    public void Sacar()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo: " + saldo);
        System.out.println("Digite o valor que deseja sacar: ");
        saque = scanner.nextDouble();
        

        if (saque> saldo) {
            System.out.println("======================================================");
            System.out.println("============= Vc nao tem saldo suficiente ============");
            System.out.println("======================================================");
        }
        else
        {
            saldo -= saque - 3.0;
            System.out.println("======================================================");
            System.out.println("===================== Valor Sacado ===================");
            System.out.println("============================"+ saque + "==========================");
        }

        
        scanner.close();
    }

    public void Deposito()
    {   
        Scanner scanner = new Scanner(System.in);
        menu Menu = new menu();

        System.out.println("Digite o valor do deposito: ");
        deposito = scanner.nextDouble();

        saldo += deposito;

        System.out.println();
        System.out.println("======================================================");
        System.out.println("==================== Valor depositado ================");
        System.out.println("=========================="+ deposito + "========================");


        Menu.inmenu();
        
        scanner.close();

    }

    public void MudarNome()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu novo Nome: ");
        Nome = scanner.nextLine(); 
        
        scanner.close();
    }

}


