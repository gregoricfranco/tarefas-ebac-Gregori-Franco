public class Pessoa {


    private int id;
    private String cpf;
    private String nome;
    private String endereco;
    private String contato;


    /**
     * @param cpf
     * @param nome
     * @param endereco
     * @param contato
     */
    public Pessoa(String cpf, String nome, String endereco, String contato){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.contato= contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param pessoa
     * o id da classe Pessoa e gerado automaticamente
     */
    public void cadastrarPessoa(Pessoa pessoa){
        pessoa.setId((int) ((Math.random() * (10 - 1)) + 1));
        System.out.println("Foi cadastarado com sucesso: Id: " + pessoa.getId()+ " Nome "+ pessoa.getNome());
    }



}
