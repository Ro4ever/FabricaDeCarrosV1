// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args)
    {
        //EntradaSaida entradaSaida = new EntradaSaida();
        Carro carro = new Carro();
        ModeloCarro modeloCarro = new ModeloCarro();
        AnoDoCarro anoDoCarro = new AnoDoCarro();
        CorCarro corCarro = new CorCarro();

        String modelo = modeloCarro.solicitarModelo();
        String cor = corCarro.solicitaCor();
        int ano = anoDoCarro.solicitarAno();

        carro.setModelo(modelo);
        carro.setAnoDoVeiculo(ano);
        carro.setCorDoVeiculo(cor);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCorDoVeiculo());
        System.out.println(carro.getAnoDoVeiculo());





    }
}