public class Aluno {

    String nome;
    int idade;
    float rm;
    double cp;
    double cp2;
    double cp3;
    double challenge;
    double gs;

    double calcularMedia(){
        double notaFinal;
        notaFinal = (cp + cp2 + cp3)/3 + challenge + gs /3;
        return notaFinal;
    }





}
