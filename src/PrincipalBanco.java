import java.util.Scanner;

public class PrincipalBanco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome");
        cliente.nome = leitor.next() + leitor.nextLine();

        cliente.endereco = endereco;
        System.out.println("Digite o logradouro");
        endereco.logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Digite o número");
        endereco.numero = leitor.nextShort();

        System.out.println("Digite o complemento");
        endereco.complemento = leitor.next() + leitor.nextLine();

        System.out.println("Digite o CEP");
        endereco.cep = leitor.next() + leitor.nextLine();

        System.out.println("Digite o CPF");
        cliente.cpf = leitor.next() + leitor.nextLine();

        cc.titular = cliente;

        System.out.println("Digite o valor para depósito");
        cc.depositar(leitor.nextDouble());

        System.out.println("Digite o valor para retirar");
        cc.retirar(leitor.nextDouble());

        System.out.println(cliente.retornaDados());
        System.out.println("Saldo: " + cc.saldo);
    }
}