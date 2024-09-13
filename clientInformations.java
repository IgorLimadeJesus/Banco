import java.util.Random;
import java.util.Scanner;

class ClienteInfo {

    private String Nome;
    private String CPF;
    private int nConta;
    private double saldo;
    private double saque;
    private double deposito;

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    
    public void GerarConta() {
        Random random = new Random();
        this.nConta = 10000 + random.nextInt(90000);
    }

    public void InfoCliente() {
        System.out.println("Nome: " + Nome);
        System.out.println("Conta: " + nConta);
        System.out.println("Saldo: R$" + saldo);
    }

    public void Sacar(menu Menu) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo: " + saldo);
        System.out.println("Digite o valor que deseja sacar: ");
        saque = scanner.nextDouble();

        if (saque > saldo) {
            System.out.println("======================================================");
            System.out.println("============= Você não tem saldo suficiente ============");
            System.out.println("======================================================");
        } else {
            saldo -= saque - 3.0; 
            System.out.println("======================================================");
            System.out.println("===================== Valor Sacado ===================");
            System.out.println("============================ " + saque + " ==========================");
        }

        Menu.inmenu(this);
        scanner.close();
    }

    public void Deposito(menu Menu) {  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do depósito: ");
        deposito = scanner.nextDouble();

        saldo += deposito;

        System.out.println();
        System.out.println("======================================================");
        System.out.println("==================== Valor depositado ================");
        System.out.println("========================== " + deposito + " =========================");

        
        Menu.inmenu(this);  

        scanner.close();
    }

    public void MudarNome(menu Menu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu novo nome: ");
        Nome = scanner.nextLine();

        Menu.inmenu(this);
        scanner.close();
    }
}
