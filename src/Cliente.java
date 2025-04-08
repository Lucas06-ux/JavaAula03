public class Cliente {

    String nome;
    String cpf;
    Endereco endereco;

    String retornaDados(){
        return "Nome: " + nome + ", cpf: " + cpf + ", endereço: " + endereco.retornaEndereco();
    }

}
