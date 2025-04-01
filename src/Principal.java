import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a idade");
        int idade = leitor.nextInt();;

        System.out.println("Digite o rm do aluno");
        float rm = leitor.nextFloat();

        System.out.println("Digite a nota da cp1");
        double cp = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da cp3");
        double cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do challenge");
        double challenge = leitor.nextDouble();

        System.out.println("Por fim, digite a nota da gs");
        double gs = leitor.nextDouble();



        Aluno aluno1 = new Aluno();
        aluno1.nome = nome;
        aluno1.idade = idade;
        aluno1.rm = rm;
        aluno1.cp = cp;
        aluno1.cp2 = cp2;
        aluno1.cp3 = cp3;
        aluno1.challenge = challenge;
        aluno1.gs = gs;


      double media =  aluno1.calcularMedia();

        System.out.println("A média final ficou" + media);


    }


}
