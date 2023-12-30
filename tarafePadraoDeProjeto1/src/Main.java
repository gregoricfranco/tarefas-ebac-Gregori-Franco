// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CarroFactory fabricaDeCarrosPopulares = new FabricaDeCarrosPopulares();
        Carro carroPopular = fabricaDeCarrosPopulares.criarCarro("hatch");
        System.out.println(carroPopular.getModelo());
        System.out.println(carroPopular.getPreco());
        System.out.println("Imposto pago: " + fabricaDeCarrosPopulares.calcularImpostoDeRenda( carroPopular));

        CarroFactory fabricaDeCarrosLuxuosos = new FabricaDeCarrosLuxuosos();
        Carro carroLuxuoso = fabricaDeCarrosLuxuosos.criarCarro("sedan");
        System.out.println(carroLuxuoso.getModelo());
        System.out.println(carroLuxuoso.getPreco());
        System.out.println("Imposto pago: " + fabricaDeCarrosLuxuosos.calcularImpostoDeRenda(carroLuxuoso));

    }
}