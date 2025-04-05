import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno1.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a idade");
        aluno1.idade = leitor.nextInt();;

        System.out.println("Digite o rm do aluno");
        aluno1.rm = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota da cp1");
        aluno1.cp = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        aluno1.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da cp3");
        aluno1.cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do challenge");
        aluno1.challenge = leitor.nextDouble();

        System.out.println("Por fim, digite a nota da gs");
        aluno1.gs = leitor.nextDouble();


      double media =  aluno1.calcularMediaFinal();
      double mediaCp = aluno1.calcularMediaCp();
        System.out.println("O aluno " + aluno1.nome +" ficou com a média final de nota " + media + ", e a média dos checkpoints ficou " + mediaCp);

        System.out.printf("Média do cp formatado: %.2f ", mediaCp);
        System.out.printf("\nMédia semestre formatado: %.2f", media);


    }


}
