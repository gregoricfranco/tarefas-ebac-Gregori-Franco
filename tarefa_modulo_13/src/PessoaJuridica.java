public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + ", CNPJ: " + this.CNPJ + "Telefone : " + this.getTelefone() + " Endereco: " + this.getEndereco());
    }
}
