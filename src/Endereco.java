public class Endereco {

    String logradouro;
    short numero;
    String complemento;
    String cep;


    String retornaEndereco(){
        return "Logradouro: " + logradouro + ", " + numero + " " + complemento + " CEP: " + cep;
    }
}
