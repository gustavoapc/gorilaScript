package out;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SwingMain {
    public static void main(String[] args) {
        while (true) {  
            JTextField valorInicialField = new JTextField();
            JTextField taxaJurosField = new JTextField();
            JTextField anosField = new JTextField();
            JTextField aporteMensalField = new JTextField();

            JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));
            panel.add(new JLabel("Digite o valor inicial:"));
            panel.add(valorInicialField);
            panel.add(new JLabel("Digite a taxa de juros (em %):"));
            panel.add(taxaJurosField);
            panel.add(new JLabel("Digite o número de anos:"));
            panel.add(anosField);
            panel.add(new JLabel("Digite o valor do aporte mensal:"));
            panel.add(aporteMensalField);

            Dimension fieldSize = new Dimension(200, 30);
            valorInicialField.setPreferredSize(fieldSize);
            taxaJurosField.setPreferredSize(fieldSize);
            anosField.setPreferredSize(fieldSize);
            aporteMensalField.setPreferredSize(fieldSize);

            int result = JOptionPane.showConfirmDialog(null, panel, "Simulador de Investimentos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                try {
                    float valorInicial = Float.parseFloat(valorInicialField.getText());
                    float taxaJuros = Float.parseFloat(taxaJurosField.getText());
                    int anos = Integer.parseInt(anosField.getText());

                    float aporteMensal = 0;
                    if (!aporteMensalField.getText().isEmpty()) {
                        aporteMensal = Float.parseFloat(aporteMensalField.getText());
                    }

                    float valorFinal = GeneratedCode.calcularInvestimento(valorInicial, taxaJuros, anos, aporteMensal);

                    DecimalFormat df = new DecimalFormat("#.00");
                    String valorFinalFormatado = df.format(valorFinal);

                    JOptionPane.showMessageDialog(null, "O valor final do investimento é: " + valorFinalFormatado +" R$", "Simulador de Investimentos", JOptionPane.INFORMATION_MESSAGE);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.\nPara valores decimais, utilize '.'\nEx: 10.50", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
               
                break;
            }
        }
    }
}
