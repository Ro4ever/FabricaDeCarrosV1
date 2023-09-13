import javax.swing.*;

public class EntradaSaida
{
    public static String solicitaCor()
    {
        return JOptionPane.showInputDialog("Informe a cor do veículo: ");
    }
    public static int solicitarAno()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo: "));
    }
    public static String solicitarModelo()
    {
        return JOptionPane.showInputDialog("Informe o modelo do veículo: ");
    }


}
