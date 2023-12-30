public class FabricaDeCarrosLuxuosos extends  CarroFactory {
    @Override
    public Carro criarCarro(String tipo) {
        switch (tipo) {
            case "hatchback":
                return new HatchbackLuxuoso("Audi A3", 180.000D, "Vermelho");
            case "sedan":
                return new SedanLuxuoso("MERCEDES-BENZ CLASSE C", 280.458D, "Preto");
            case "SUV":
                return new SUVLuxuoso("Volvo XC60 Recharge", 480.355D, "Prata");
            default:
                throw new IllegalArgumentException("Tipo de carro inválido");
        }
    }

    @Override
    public double calcularImpostoDeRenda(Carro carro) {
        double rendaBruta = carro.getPreco();
        double aliquota = 0;
        if (rendaBruta <= 2.000000) {
            aliquota = 0.25;
        } else if (rendaBruta <= 3.000000) {
            aliquota = 0.35;
        } else {
            aliquota = 0.45;
        }

        return rendaBruta * aliquota;
    }
}
