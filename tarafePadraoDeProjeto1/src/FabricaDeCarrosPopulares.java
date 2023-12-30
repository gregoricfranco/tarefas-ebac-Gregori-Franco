public class FabricaDeCarrosPopulares extends CarroFactory{

    @Override
    public Carro criarCarro(String tipo) {
        switch (tipo) {
            case "hatch":
                return new HatchbackPopular("Chevrolet Onix", 89.756D, "Preto");
            case "sedan":
                return new SedanPopular("Honda City", 99.756D, "Prata");
            case "SUV":
                return new SUVPopular("Tracker", 109.756D, "Branca");
            default:
                throw new IllegalArgumentException("Tipo de carro inválido");
        }
    }

    @Override
    public double calcularImpostoDeRenda(Carro carro) {
        double rendaBruta = carro.getPreco();
        double aliquota = 0;
        if (rendaBruta <= 2.000000) {
            aliquota = 0.15;
        } else if (rendaBruta <= 3.000000) {
            aliquota = 0.25;
        } else {
            aliquota = 0.35;
        }

        return rendaBruta * aliquota;
    }

}


