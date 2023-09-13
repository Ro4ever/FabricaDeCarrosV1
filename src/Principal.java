// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args)
    {
        EntradaSaida entradaSaida = new EntradaSaida();
        Carro carro = new Carro();
        ModeloCarro modeloCarro = new ModeloCarro();
        AnoDoCarro anoDoCarro = new AnoDoCarro();
        CorCarro corCarro = new CorCarro();

        String modelo = EntradaSaida.solicitarModelo();
        String cor = EntradaSaida.solicitaCor();
        int ano = EntradaSaida.solicitarAno();

        modeloCarro.setModelo(modelo);
        anoDoCarro.setAnoDoVeiculo(ano);
        corCarro.setCorDoVeiculo(cor);

        System.out.println(modeloCarro.getModelo());
        System.out.println(corCarro.getCorDoVeiculo());
        System.out.println(anoDoCarro.getAnoDoVeiculo());





    }
}