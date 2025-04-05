public class Aluno {

    String nome;
    int idade;
    String rm;
    double cp;
    double cp2;
    double cp3;
    double challenge;
    double gs;




    double calcularMediaCp(){
        return (cp + cp2 + cp3) /3;
    }

    double calcularMediaFinal(){
        return calcularMediaCp() * 0.2 + challenge * 0.2 + gs * 0.6;

    }



}
