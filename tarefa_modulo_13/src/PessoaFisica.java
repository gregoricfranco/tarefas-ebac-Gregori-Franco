public class PessoaFisica extends Pessoa {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + ",  CPF: " + this.cpf + "Telefone : " + this.getTelefone() + " Endereco: " + this.getEndereco());
    }
}
