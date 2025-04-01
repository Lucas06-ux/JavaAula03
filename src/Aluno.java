public class Aluno {

    String nome;
    int idade;
    float rm;
    double cp;
    double cp2;
    double cp3;
    double challenge;
    double gs;
    double mediaCp;




    double calcularMedia(){

        double notaFinal;
        notaFinal = mediaCp * 0.2 + challenge * 0.2 + gs * 0.6;
        return notaFinal;
    }





}
