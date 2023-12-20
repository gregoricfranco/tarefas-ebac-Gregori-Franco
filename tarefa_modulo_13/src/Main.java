
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf("06488709977");
        pf.setNome("Joao ");
        pf.setEndereco("rua abc, 125 apt 800");
        pf.setTelefone("(48) 3334-1212");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCNPJ("12.925.608.0001-15");
        pj.setNome("Maria Pj ");
        pj.setEndereco("rua 11111, 125 sala  02");
        pj.setTelefone("(48) 3047-1919");



        pf.imprimir();

        pj.imprimir();

    }
}